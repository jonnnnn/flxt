package com.jzt.tool;

import java.util.HashMap;
import java.util.List;


/*layui返回对象工具类*/
public class  R extends HashMap<String, Object> {
    public static R data(String msg){
        R r = new R();
        r.put("code", 0);
        r.put("msg",msg);
        r.put("count",0);
        r.put("data",null);
        return r;
    }

    public static R data(String msg, List<?> data){
        R r = new R();
        r.put("code", 0);
        r.put("msg", msg);
        r.put("count", data.size());
        r.put("data", data);
        return r;
    }

    public static R data(String msg,List<?>data,int count){
        R r = new R();
        r.put("code", 0);
        r.put("msg", msg);
        r.put("count",count);
        r.put("data", data);
        return r;
    }

}


