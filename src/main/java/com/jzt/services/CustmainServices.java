package com.jzt.services;

import com.jzt.entity.Custapi;
import com.jzt.entity.Custmain;

import java.util.List;

public interface CustmainServices {
    public List<Custmain> getCust(Custmain custmain);

    public  List<Custapi>  getCustapi(Custapi custapi);

    public void updateCallCust(Custapi custapi);

    public void insCallCust(Custapi custapi);

    public void delCallCust(Custapi custapi);
}
