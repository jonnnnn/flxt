package com.jzt.services.impl;

import com.jzt.dao.CustmainDao;
import com.jzt.entity.Custmain;
import com.jzt.services.CustmainServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CustmainServicesImpl")
public class CustmainServicesImpl implements CustmainServices {
    @Resource
    private CustmainDao custmainDao;
    public List<Custmain> getCust(Custmain custmain){
       return custmainDao.getCust(custmain);
    }

}
