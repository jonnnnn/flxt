package com.jzt.action;

import com.alibaba.fastjson.JSONArray;
import com.jzt.entity.Xsqrdet;
import com.jzt.entity.Xsqrsum;
import com.jzt.entity.Yxsdet;
import com.jzt.entity.Yxssum;
import com.jzt.services.XsqrServices;
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

@Controller("XsqrAction")
public class XsqrAction {
    @Resource
    private XsqrServices xsqrServices;

    @RequestMapping("inserXsqrsum")
    @ResponseBody
    public R inserXsqrsum(@RequestBody String xsqrjson) {
        System.out.println("xsqrjson"+xsqrjson);
        List<?> xsqrjsonList = JSONArray.parseArray(xsqrjson,Object.class);
        if(xsqrjsonList != null && xsqrjsonList.size()>0){
            Xsqrsum xsqrsum = (Xsqrsum) JSONObject.toBean(JSONObject.fromObject(xsqrjsonList.get(0)),Xsqrsum.class);
            xsqrsum.setBillid(S.getid("QRX"));
            xsqrServices.inserXsqrsum(xsqrsum);
            for(int n = 1;n < xsqrjsonList.size();n++){
                Xsqrdet xsqrdet = (Xsqrdet) JSONObject.toBean(JSONObject.fromObject(xsqrjsonList.get(n)),Xsqrdet.class);
                xsqrdet.setBillid(xsqrsum.getBillid());
                xsqrServices.inserXsqrdet(xsqrdet);
            }
            xsqrServices.insUpdStatu(xsqrsum);//修改预销售调用状态
        }
        List list = new ArrayList();
        return R.data("保存成功！", list);
    }

    @RequestMapping("getXsqrsum")
    @ResponseBody
    public R getXsqrsum(Xsqrsum xsqrsum) {
        List<Xsqrsum> xsqrsumList = xsqrServices.getXsqrsum(xsqrsum);
        return R.data("OK", xsqrsumList);
    }

    @RequestMapping("delXsqrsum")
    @ResponseBody
    public R delXsqrsum(Xsqrsum xsqrsum, Xsqrdet xsqrdet) {
        xsqrServices.delXsqrsum(xsqrsum);
        xsqrServices.delXsqrdet(xsqrdet);
        List list = new ArrayList();
        return R.data("删除成功！", list);
    }

    @RequestMapping("getOneXsqr")
    @ResponseBody
    public R getOneXsqr(Xsqrsum xsqrsum) {
        List<Xsqrsum> xsqrsumList = xsqrServices.getOneXsqr(xsqrsum);
        return R.data("", xsqrsumList);
    }

    @RequestMapping("getOneXsqrdet")
    @ResponseBody
    public R getOneXsqrdet(Xsqrdet xsqrdet) {
        List<Xsqrdet> xsqrsumList = xsqrServices.getOneXsqrdet(xsqrdet);
        return R.data("", xsqrsumList);
    }

    @RequestMapping("updXsqr")
    @ResponseBody
    public R updXsqr(Xsqrdet xsqrdet) {
        xsqrServices.updXsqr(xsqrdet);
        List list = new ArrayList();
        return R.data("修改成功！", list);
    }
}
