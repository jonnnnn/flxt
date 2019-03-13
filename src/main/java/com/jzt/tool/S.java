package com.jzt.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S {
    public static String getid(String billtype) {
        String branchid = "FWX";
        String id = branchid + billtype + new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        return id;
    }

}
