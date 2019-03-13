package com.jzt.services.impl;

import com.jzt.dao.YxsDao;
import com.jzt.entity.Yxsdet;
import com.jzt.entity.Yxssum;
import com.jzt.services.YxsServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("YxsServicesImpl")
public class YxsServicesImpl implements YxsServices {
    @Resource
    private YxsDao yxsDao;
    @Override
    public void inserYxssum(Yxssum yxssum) {
        yxsDao.inserYxssum(yxssum);
    }

    @Override
    public void delYxsum(Yxssum yxssum) {
        yxsDao.delYxsum(yxssum);
    }

    @Override
    public void delYxdet(Yxsdet yxsdet) {
        yxsDao.delYxdet(yxsdet);
    }

    @Override
    public List<Yxssum> getYxsum(Yxssum yxssum) {
        return yxsDao.getYxsum(yxssum);
    }

    @Override
    public void inserYxsdet(Yxsdet yxsdet) {
         yxsDao.inserYxsdet(yxsdet);
    }

    @Override
    public List<Yxssum> getOneYxssum(Yxssum yxssum) {
        return yxsDao.getOneYxssum(yxssum);
    }

    @Override
    public void updYxs(Yxsdet yxsdet) {
        yxsDao.updYxs(yxsdet);
    }

    @Override
    public List<Yxsdet> getOneYxsdet(Yxsdet yxsdet) {
        return yxsDao.getOneYxsdet(yxsdet);
    }

}
