package com.jzt.dao;

import com.jzt.entity.Qrlr;
import com.jzt.entity.Ylr;

import java.util.List;
import java.util.Map;

public interface QrluDao {
    public void inserQrlr(Qrlr qrlr);

    public void insUpdStatu(Qrlr qrlr);

    public void delQrlr(Qrlr qrlr);

    public void updQrlr(Qrlr qrlr);

    public void sslr(Qrlr qrlr);

    public void updQrStatu(Qrlr qrlr);

    public void inserSs(Qrlr qrlr);

    public List<Qrlr>  getQrlrCount(Qrlr qrlr);

    public List<Qrlr>  getSsmm(Qrlr qrlr);

}
