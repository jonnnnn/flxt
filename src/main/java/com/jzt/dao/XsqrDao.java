package com.jzt.dao;

import com.jzt.entity.Xsqrdet;
import com.jzt.entity.Xsqrsum;

import java.util.List;

public interface XsqrDao {
    public void inserXsqrsum(Xsqrsum xsqrsum);

    public void inserXsqrdet(Xsqrdet xsqrdet);

    public void insUpdStatu(Xsqrsum xsqrsum);

    public void delXsqrsum(Xsqrsum xsqrsum);

    public void delXsqrdet(Xsqrdet xsqrdet);

    public List<Xsqrsum> getXsqrsum(Xsqrsum xsqrsum);

    public List<Xsqrsum> getOneXsqr(Xsqrsum xsqrsum);

    public List<Xsqrdet> getOneXsqrdet(Xsqrdet xsqrdet);

    public void updXsqr(Xsqrdet xsqrdet);

}
