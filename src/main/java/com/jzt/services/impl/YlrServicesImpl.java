package com.jzt.services.impl;

import com.jzt.dao.YlrDao;
import com.jzt.entity.Ylr;
import com.jzt.services.YlrServices;
import com.jzt.tool.S;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("YluServicesImpl")
public class YlrServicesImpl implements YlrServices {
    @Resource
    private YlrDao yluDao;

    @Override
    public void inserYlr(Ylr ylr) {
        ylr.setBillid(S.getid("YLR"));
        yluDao.inserYlr(ylr);
    }

    @Override
    public void delYlr(Ylr ylr) {
        yluDao.delYlr(ylr);
    }

    @Override
    public List<Ylr> getYlrCount(Ylr ylr) {
        if(ylr.getPage() == null || ylr.getLimit() == null){ylr.setPage(1);ylr.setLimit(10);}
        List<Ylr> ylrList = yluDao.getYlrCount(ylr);
        for (Ylr list : ylrList) {
            list.setPrice(S.getDouble(list.getPrice()));
            list.setGetprice(S.getDouble(list.getGetprice()));
            list.setFlprice(S.getDouble(list.getFlprice()));
        }
        return ylrList;
    }

    @Override
    public void updYlr(Ylr ylr) {
        yluDao.updYlr(ylr);
    }

    @Override
    public void updState(Ylr ylr) {
        yluDao.updState(ylr);
    }
}
