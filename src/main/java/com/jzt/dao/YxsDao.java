package com.jzt.dao;

import com.jzt.entity.Yxsdet;
import com.jzt.entity.Yxssum;

import java.util.List;

public interface YxsDao {
    public void inserYxssum(Yxssum yxssum);

    public void delYxsum(Yxssum yxssum);

    public void delYxdet(Yxsdet yxsdet);

    public List<Yxssum> getYxsum(Yxssum yxssum);

    public void inserYxsdet(Yxsdet yxsdet);

    public List<Yxssum> getOneYxssum(Yxssum yxssum);

    public List<Yxsdet> getOneYxsdet(Yxsdet yxsdet);

    public void  updYxs (Yxsdet yxsdet);
}
