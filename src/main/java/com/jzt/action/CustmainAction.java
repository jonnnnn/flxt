package com.jzt.action;

import com.jzt.entity.Custapi;
import com.jzt.entity.Custmain;
import com.jzt.services.CustmainServices;
import com.jzt.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller("CustmainAction")
public class CustmainAction {
    @Resource
     private CustmainServices custmainServices;

    /*获取客户数据*/
    @RequestMapping("getCust")
    @ResponseBody
    public R getCust(Custmain custmain){
        List<Custmain> custmains = custmainServices.getCust(custmain);
       return R.data("",custmains);
    };

    /*获取API表数据*/
    @RequestMapping("getCustapi")
    @ResponseBody
    public R getCustapi(Custapi custapi){
        List<Custapi> custapiList = custmainServices.getCustapi(custapi);
        return R.data("",custapiList);
    };

    /*调用API表中客户数据*/
    @RequestMapping("updateCallCust")
    @ResponseBody
    public R updateCallCust(Custapi custapi){
        custmainServices.updateCallCust(custapi);
        custmainServices.insCallCust(custapi);
        List<Custapi> list = new ArrayList<>();
        return R.data("已调用！",list);
    };

    /*取消调用API表客户数据*/
    @RequestMapping("delCallCust")
    @ResponseBody
    public R delCallCust(Custapi custapi){
        custmainServices.updateCallCust(custapi);
        custmainServices.delCallCust(custapi);
        List<Custapi> list = new ArrayList<>();
        return R.data("已取消调用！",list);
    };

}
