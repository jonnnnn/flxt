package com.jzt.action;

import com.alibaba.fastjson.JSONArray;
import com.jzt.entity.Qrlr;
import com.jzt.entity.Ylr;
import com.jzt.services.QrluServices;
import com.jzt.tool.R;
import com.jzt.tool.S;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("QrluAction")
public class QrluAction {
    @Resource
    private QrluServices qrluServices;

    @RequestMapping("inserQrlr")
    @ResponseBody
    public R inserQrlr(Qrlr qrlr, HttpSession session) {
         qrlr.setBillid(S.getid("QRLR"));
         qrlr.setStaff((String)session.getAttribute("username"));
         qrluServices.inserQrlr(qrlr);
         qrluServices.insUpdStatu(qrlr);
        return R.data("保存成功！");
    }

    @RequestMapping("getQrlr")
    @ResponseBody
    public R getQrlr(Qrlr qrlr) {
        List<Qrlr> qrlrList = qrluServices.getQrlrCount(qrlr);
        return R.data("",qrlrList,qrlrList.size()>0 ? qrlrList.get(0).getAllcount() : qrlrList.size());
    }

    @RequestMapping("delQrlr")
    @ResponseBody
    public R delQrlr(Qrlr qrlr) {
        qrluServices.delQrlr(qrlr);
        return R.data("删除成功！");
    }

    @RequestMapping("updQrlr")
    @ResponseBody
    public R updQrlr(Qrlr qrlr) {
        qrluServices.updQrlr(qrlr);
        return R.data("修改成功！");
    }

    //实收录入
    @RequestMapping("sslr")
    @ResponseBody
    public R sslr(Qrlr qrlr) {
        qrlr.setStatu("1");
        qrluServices.updQrStatu(qrlr);
        qrluServices.sslr(qrlr);
        return R.data("录入成功！");
    }

    //实收审核
    @RequestMapping("sssh")
    @ResponseBody
    public R sssh(Qrlr qrlr) {
        Double ssje = Double.parseDouble(qrlr.getSsje());
        Double bcje = Double.parseDouble(qrlr.getBcss());
        qrlr.setStatu("0");
        qrlr.setSsje((ssje+bcje)+""); //审核通过后将本次实收累加到实收金额上
        qrlr.setBcss("0");
        qrluServices.updQrStatu(qrlr);
        qrluServices.sslr(qrlr);
        qrluServices.inserSs(qrlr);
        return R.data("已通过！");
    }

    //实收驳回
    @RequestMapping("ssshbo")
    @ResponseBody
    public R ssshbo(Qrlr qrlr) {
        qrlr.setStatu("0");
        qrlr.setBcss("0");
        qrluServices.sslr(qrlr);
        qrluServices.updQrStatu(qrlr);
        return R.data("已驳回！");
    }

    //实收明细查询
    @RequestMapping("getSsmx")
    @ResponseBody
    public R getSsmx(Qrlr qrlr) {
        List<Qrlr> list = qrluServices.getSsmm(qrlr);
        return R.data("", list,list.size()>0? list.get(0).getAllcount() : list.size());
    }
}
