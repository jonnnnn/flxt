package com.jzt.dao;

import com.jzt.entity.Ylr;

import java.util.List;
import java.util.Map;

public interface YlrDao {
    public void inserYlr(Ylr ylr);

    public void delYlr(Ylr ylr);

    public List<Ylr>  getYlrCount(Ylr ylr);

    public void  updYlr(Ylr ylr);

    public void  updState(Ylr ylr);



}
