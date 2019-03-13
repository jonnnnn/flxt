package com.jzt.services;

import com.jzt.entity.Yxsdet;
import com.jzt.entity.Yxssum;

import java.util.List;

public interface YxsServices {
    public void inserYxssum(Yxssum yxssum);

    public void delYxsum(Yxssum yxssum);

    public void delYxdet(Yxsdet yxsdet);

    public List<Yxssum> getYxsum(Yxssum yxssum);

    public void inserYxsdet(Yxsdet yxsdet);

    public List<Yxssum> getOneYxssum(Yxssum yxssum);

    public void  updYxs (Yxsdet yxsdet);

    public List<Yxsdet> getOneYxsdet(Yxsdet yxsdet);
}
