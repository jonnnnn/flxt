package com.jzt.action;

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

}
