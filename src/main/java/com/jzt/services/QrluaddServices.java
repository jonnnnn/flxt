package com.jzt.services;

import com.jzt.entity.Qrlr;
import com.jzt.entity.QrlrAdd;

import java.util.List;


public interface QrluaddServices {
    public void inserQrlradd(QrlrAdd qrlrAdd);

    public void updQraddStatu(QrlrAdd qrlrAdd);
    public void delQrlradd(QrlrAdd qrlrAdd);
    public void Qradd(String p_pk);
    public List<QrlrAdd>  getQrlraddCount(QrlrAdd qrlrAdd);

}
