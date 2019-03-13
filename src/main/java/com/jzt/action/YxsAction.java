package com.jzt.action;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jzt.entity.Yxsdet;
import com.jzt.entity.Yxssum;
import com.jzt.services.YxsServices;
import com.jzt.tool.R;

import com.jzt.tool.S;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@Controller("YxsAction")
public class YxsAction {
    @Resource
    private YxsServices yxsServices;

    @RequestMapping("insYxs")
    @ResponseBody
    public R insYxs(@RequestBody String yxsdets) throws Exception {
        System.out.println("yxsdets"+yxsdets);
        List<?> yxsdetList = JSONArray.parseArray(yxsdets,Object.class);
        if(yxsdetList != null && yxsdetList.size()>0){
            Yxssum yxssum = (Yxssum) JSONObject.toBean(JSONObject.fromObject(yxsdetList.get(0)),Yxssum.class);
            yxssum.setBillid(S.getid("YXS"));
            yxsServices.inserYxssum(yxssum);
            for(int n = 1;n < yxsdetList.size();n++){
                Yxsdet yxsdets1 = (Yxsdet) JSONObject.toBean(JSONObject.fromObject(yxsdetList.get(n)),Yxsdet.class);
                yxsdets1.setBillid(yxssum.getBillid());
                yxsServices.inserYxsdet(yxsdets1);
            }
        }
        List list = new ArrayList();
        return R.data("保存成功！", list);
    }

    @RequestMapping("delYxsum")
    @ResponseBody
    public R delYxsum(Yxssum yxssum,Yxsdet yxsdet) {
        yxsServices.delYxsum(yxssum);
        yxsServices.delYxdet(yxsdet);
        List list = new ArrayList();
        return R.data("删除成功！", list);
    }

    @RequestMapping("getYxsum")
    @ResponseBody
    public R getYxsum(Yxssum yxssum) {
        System.out.println(yxssum.getStatu());
        List<Yxssum> yxssumList = yxsServices.getYxsum(yxssum);
        return R.data("", yxssumList);
    }

    @RequestMapping("getOneYxssum")
    @ResponseBody
    public R getOneYxssum(Yxssum yxssum) {
        List<Yxssum> yxssumList = yxsServices.getOneYxssum(yxssum);
        return R.data("", yxssumList);
    }

    @RequestMapping("getOneYxsdet")
    @ResponseBody
    public R getOneYxsdet(Yxsdet yxsdet) {
        List<Yxsdet> oneYxsdet = yxsServices.getOneYxsdet(yxsdet);
        return R.data("", oneYxsdet);
    }

    @RequestMapping("updYxs")
    @ResponseBody
    public R updYxs(Yxsdet yxsdet) {
        yxsServices.updYxs(yxsdet);
        List list = new ArrayList();
        return R.data("修改成功!", list);
    }

}
