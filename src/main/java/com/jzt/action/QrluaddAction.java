package com.jzt.action;

import com.jzt.entity.Qrlr;
import com.jzt.entity.QrlrAdd;
import com.jzt.services.QrluServices;
import com.jzt.services.QrluaddServices;
import com.jzt.tool.R;
import com.jzt.tool.S;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller("QrluaddAction")
public class QrluaddAction {
    @Resource
    private QrluaddServices qrluaddServices;

    @RequestMapping("inserQrlradd")
    @ResponseBody
    public R inserQrlradd(QrlrAdd qrlrAdd, HttpSession session) {
        qrlrAdd.setStaff((String)session.getAttribute("username"));
        qrluaddServices.inserQrlradd(qrlrAdd);
        return R.data("保存成功！");
    }

    @RequestMapping("getQrlradd")
    @ResponseBody
    public R getQrlradd(QrlrAdd qrlrAdd) {
        List<QrlrAdd> qrlrList = qrluaddServices.getQrlraddCount(qrlrAdd);
        return R.data("",qrlrList,qrlrList.size()>0 ? qrlrList.get(0).getAllcount() : qrlrList.size());
    }

    @RequestMapping("delQrlradd")
    @ResponseBody
    public R delQrlradd(QrlrAdd qrlrAdd) {
        qrluaddServices.delQrlradd(qrlrAdd);
        return R.data("删除成功！");
    }

    @RequestMapping("updQraddSh")
    @ResponseBody
    public R updQraddSh(QrlrAdd qrlrAdd) {
        if(qrlrAdd.getStatu().equals("1")){
            qrluaddServices.updQraddStatu(qrlrAdd);
            qrluaddServices.Qradd(qrlrAdd.getPk());
            return R.data("");
        }else {
            qrluaddServices.updQraddStatu(qrlrAdd);
            return R.data("");
        }
    }
}
