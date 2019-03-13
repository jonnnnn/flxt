package com.jzt.tool;

import java.util.HashMap;
import java.util.List;

public class R extends HashMap<String, Object> {
    public static R data(String msg, List<?> data){
        R r = new R();
        r.put("code", 0);
        r.put("msg", msg);
        r.put("count", data.size());
        r.put("data", data);
        return r;
    }
}


