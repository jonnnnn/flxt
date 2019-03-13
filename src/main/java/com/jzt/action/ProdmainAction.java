package com.jzt.action;

import com.jzt.entity.Custapi;
import com.jzt.entity.Prodapi;
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

    /*获取API商品信息*/
    @RequestMapping("getProdapi")
    @ResponseBody
    public R getProdapi(Prodapi prodapi){
        List<Prodapi> prodmainapiList = prodmainServices.getProdapi(prodapi);
        return R.data("OK",prodmainapiList);
    }

    /*调用API表中商品信息*/
    @RequestMapping("updateCallProd")
    @ResponseBody
    public R updateCallProd(Prodapi prodapi){
        System.out.println("State:"+prodapi.getState());
        prodmainServices.updateCallProd(prodapi);
        prodmainServices.insCallProd(prodapi);
        List<Custapi> list = new ArrayList<>();
        return R.data("已调用！",list);
    };

    /*取消调用API表商品信息*/
    @RequestMapping("delCallProd")
    @ResponseBody
    public R delCallProd(Prodapi prodapi){
        prodmainServices.updateCallProd(prodapi);
        prodmainServices.delCallProd(prodapi);
        List<Custapi> list = new ArrayList<>();
        return R.data("已取消调用！",list);
    };
}
