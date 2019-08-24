package com.jzt.services.impl;

import com.jzt.dao.CustmainDao;
import com.jzt.dao.CusttypemainDao;
import com.jzt.entity.Custmain;
import com.jzt.entity.Custtypemain;
import com.jzt.services.CustmainServices;
import com.jzt.services.CusttypemainServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CusttypemainServicesImpl")
public class CusttypemainServicesImpl implements CusttypemainServices {
    @Resource
    private CusttypemainDao custtypemainDao;

    @Override
    public List<Custtypemain> getCusttype(Custtypemain custtypemain) {
        return custtypemainDao.getCusttype(custtypemain);
    }
}
