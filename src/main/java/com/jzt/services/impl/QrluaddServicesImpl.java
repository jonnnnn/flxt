package com.jzt.services.impl;


import com.jzt.dao.QrluDao;
import com.jzt.dao.QrluaddDao;
import com.jzt.entity.Qrlr;
import com.jzt.entity.QrlrAdd;
import com.jzt.services.QrluServices;
import com.jzt.services.QrluaddServices;
import com.jzt.tool.S;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("QrluaddServicesImpl")
public class QrluaddServicesImpl implements QrluaddServices {
    @Resource
    private QrluaddDao qrluaddDao;

    @Override
    public void inserQrlradd(QrlrAdd qrlrAdd) {
        qrluaddDao.inserQrlradd(qrlrAdd);
    }

    @Override
    public void updQraddStatu(QrlrAdd qrlrAdd) {
        qrluaddDao.updQraddStatu(qrlrAdd);
    }

    @Override
    public void delQrlradd(QrlrAdd qrlrAdd) {
        qrluaddDao.delQrlradd(qrlrAdd);
    }

    @Override
    public void Qradd(String p_pk) {
        qrluaddDao.Qradd(p_pk);
    }

    @Override
    public List<QrlrAdd> getQrlraddCount(QrlrAdd qrlrAdd) {
        return qrluaddDao.getQrlraddCount(qrlrAdd);
    }
}
