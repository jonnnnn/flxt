package com.jzt.services.impl;


import com.jzt.dao.XsqrDao;
import com.jzt.entity.Xsqrdet;
import com.jzt.entity.Xsqrsum;
import com.jzt.services.XsqrServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("XsqrServicesImpl")
public class XsqrServicesImpl implements XsqrServices {
    @Resource
    private XsqrDao xsqrDao;
    @Override
    public void inserXsqrsum(Xsqrsum xsqrsum) {
        xsqrDao.inserXsqrsum(xsqrsum);
    }

    @Override
    public void delXsqrsum(Xsqrsum xsqrsum) {
        xsqrDao.delXsqrsum(xsqrsum);
    }

    @Override
    public List<Xsqrsum> getXsqrsum(Xsqrsum xsqrsum) {
        return xsqrDao.getXsqrsum(xsqrsum);
    }

    @Override
    public List<Xsqrsum> getOneXsqr(Xsqrsum xsqrsum) {
        return xsqrDao.getOneXsqr(xsqrsum);
    }

    @Override
    public List<Xsqrdet> getOneXsqrdet(Xsqrdet xsqrdet) {
        return xsqrDao.getOneXsqrdet(xsqrdet);
    }
    @Override
    public void updXsqr(Xsqrdet xsqrdet) {
        xsqrDao.updXsqr(xsqrdet);
    }

    @Override
    public void inserXsqrdet(Xsqrdet xsqrdet) {
        xsqrDao.inserXsqrdet(xsqrdet);
    }

    @Override
    public void insUpdStatu(Xsqrsum xsqrsum) {
        xsqrDao.insUpdStatu(xsqrsum);
    }

    @Override
    public void delXsqrdet(Xsqrdet xsqrdet) {
        xsqrDao.delXsqrdet(xsqrdet);
    }
}
