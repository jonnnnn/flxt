package com.jzt.services.impl;


import com.jzt.dao.QrluDao;
import com.jzt.entity.Qrlr;
import com.jzt.entity.Ylr;
import com.jzt.services.QrluServices;
import com.jzt.tool.S;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("QrluServicesImpl")
public class QrluServicesImpl implements QrluServices {
    @Resource
    private QrluDao qrluDao;

    @Override
    public void inserQrlr(Qrlr qrlr) {
        qrluDao.inserQrlr(qrlr);
    }

    @Override
    public void insUpdStatu(Qrlr qrlr) {
        qrluDao.insUpdStatu(qrlr);
    }

    @Override
    public void delQrlr(Qrlr qrlr) {
        qrluDao.delQrlr(qrlr);
    }

    @Override
    public List<Qrlr> getQrlrCount(Qrlr qrlr) {
        List<Qrlr> qrlrList = qrluDao.getQrlrCount(qrlr);
        //保留两位小数
        for (Qrlr list : qrlrList) {
            list.setPrice(S.getDouble(list.getPrice()));
            list.setGetprice(S.getDouble(list.getGetprice()));
            list.setFlprice(S.getDouble(list.getFlprice()));
        }
        return qrlrList;
    }

    @Override
    public List<Qrlr> getSsmm(Qrlr qrlr) {
        return qrluDao.getSsmm(qrlr);
    }

    @Override
    public void updQrlr(Qrlr qrlr) {
        qrluDao.updQrlr(qrlr);
    }

    @Override
    public void sslr(Qrlr qrlr) {
        qrluDao.sslr(qrlr);
    }

    @Override
    public void updQrStatu(Qrlr qrlr) {
        qrluDao.updQrStatu(qrlr);
    }

    @Override
    public void  inserSs(Qrlr qrlr) {
        qrluDao.inserSs(qrlr);
    }

}
