package com.jzt.services.impl;

import com.jzt.dao.UseresDao;
import com.jzt.entity.Useres;
import com.jzt.services.UseresServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UseresServicesImpl")
public class UseresServicesImpl implements UseresServices {
@Resource
private UseresDao useresDao;

    @Override
    public Useres login(Useres useres) {
        return useresDao.login(useres);
    }
}
