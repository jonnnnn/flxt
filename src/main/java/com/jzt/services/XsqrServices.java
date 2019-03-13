package com.jzt.services;

import com.jzt.entity.Xsqrdet;
import com.jzt.entity.Xsqrsum;

import java.util.List;


public interface XsqrServices {
    public void inserXsqrsum(Xsqrsum xsqrsum);

    public void delXsqrsum(Xsqrsum xsqrsum);

    public List<Xsqrsum> getXsqrsum(Xsqrsum xsqrsum);

    public List<Xsqrsum> getOneXsqr(Xsqrsum xsqrsum);

    public List<Xsqrdet> getOneXsqrdet(Xsqrdet xsqrdet);

    public void updXsqr(Xsqrdet xsqrdet);

    public void inserXsqrdet(Xsqrdet xsqrdet);

    public void insUpdStatu(Xsqrsum xsqrsum);

    public void delXsqrdet(Xsqrdet xsqrdet);
}
