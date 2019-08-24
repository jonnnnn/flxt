package com.jzt.action;

import com.jzt.entity.Custtypemain;
import com.jzt.services.CusttypemainServices;
import com.jzt.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("CusttypemainAction")
public class CusttypemainAction {
    @Resource
     private CusttypemainServices custtypemainServices;

    /*获取客户类型*/
    @RequestMapping("getCusttype")
    @ResponseBody
    public R getCusttype(Custtypemain custtypemain){
        List<Custtypemain> custtype = custtypemainServices.getCusttype(custtypemain);
       return R.data("",custtype);
    };

}
