package com.jzt.tool;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*工具类*/
public class S {

    //生成单据编号
    public static String getid(String billtype) {
        String branchid = "FWX";
        String id = branchid + billtype + new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        return id;
    }


    public static String getDouble(String str){
        Double lz = Double.parseDouble(str);
        String lzz = new DecimalFormat("#0.0000").format(lz);
        return lzz;
    }

}
