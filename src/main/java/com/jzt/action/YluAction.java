package com.jzt.action;

import com.jzt.entity.Ylr;
import com.jzt.services.YlrServices;
import com.jzt.tool.R;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller("YluAction")
public class YluAction {
    @Resource
    private YlrServices ylrServices;

    @RequestMapping("inserYlr")
    @ResponseBody
    public R inserYlr(Ylr ylr, HttpSession session) {
        //验证重复
        List<Ylr> ylrList = ylrServices.getYlrCount(ylr);
        if(ylrList.size()>0){
            return R.data("数据重复，保存失败！");
        }
        ylr.setStaff((String)session.getAttribute("username"));
        ylrServices.inserYlr(ylr);
        return R.data("保存成功！");
    }

    @RequestMapping("delYlr")
    @ResponseBody
    public R delYlr(Ylr ylr) {
        ylrServices.delYlr(ylr);
        return R.data("删除成功！");
    }

    @RequestMapping("getYlr")
    @ResponseBody
    public R getYlr(Ylr ylr) {
        List<Ylr>  ylrList = ylrServices.getYlrCount(ylr);
        return R.data("",ylrList,ylrList.size()>0 ? ylrList.get(0).getAllcount():ylrList.size());
    }

    @RequestMapping("updYlr")
    @ResponseBody
    public R updYlr(Ylr ylr) {
        ylrServices.updYlr(ylr);
        return R.data("修改成功!");
    }

    @RequestMapping("updState")
    @ResponseBody
    public R updState(Ylr ylr) {
        ylrServices.updState(ylr);
        return R.data("OK");
    }
}
