package com.jzt.dao;

import com.jzt.entity.Prodapi;
import com.jzt.entity.Prodmain;

import java.util.List;

public interface ProdmainDao {
    public List<Prodmain> getProd(Prodmain prodmain);

    public List<Prodapi> getProdapi(Prodapi prodapi);

    public void updateCallProd(Prodapi prodapi);

    public void insCallProd(Prodapi prodapi);

    public void delCallProd(Prodapi prodapi);
}
