package com.jzt.services.impl;

import com.jzt.dao.ProdmainDao;
import com.jzt.entity.Prodmain;
import com.jzt.services.ProdmainServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ProdmainServicesImpl")
public class ProdmainServicesImpl implements ProdmainServices {
    @Resource
    ProdmainDao prodmainDao;
    @Override
    public List<Prodmain> getProd(Prodmain prodmain) {
        return prodmainDao.getProd(prodmain);
    }

}
