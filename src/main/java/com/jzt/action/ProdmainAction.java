package com.jzt.action;

import com.jzt.entity.Prodmain;
import com.jzt.services.ProdmainServices;
import com.jzt.tool.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller("ProdmainAction")
public class ProdmainAction {
    @Resource
    ProdmainServices prodmainServices;

    /*获取商品信息*/
    @RequestMapping("getProd")
    @ResponseBody
    public R getProd(Prodmain prodmain){
        List<Prodmain> prodmainList = prodmainServices.getProd(prodmain);
        return R.data("OK",prodmainList);
    }

}
