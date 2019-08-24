package com.jzt.entity;


public class Ss {

  private java.sql.Date createtime;
  private java.sql.Date lastmodifytime;
  private String deleteflag;
  private String note;
  private String billid;
  private String statu;
  private String ssje;
  private Integer allcount;
  private Integer page;
  private Integer limit;

  public Integer getAllcount() {
    return allcount;
  }

  public void setAllcount(Integer allcount) {
    this.allcount = allcount;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public java.sql.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Date createtime) {
    this.createtime = createtime;
  }


  public java.sql.Date getLastmodifytime() {
    return lastmodifytime;
  }

  public void setLastmodifytime(java.sql.Date lastmodifytime) {
    this.lastmodifytime = lastmodifytime;
  }


  public String getDeleteflag() {
    return deleteflag;
  }

  public void setDeleteflag(String deleteflag) {
    this.deleteflag = deleteflag;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public String getBillid() {
    return billid;
  }

  public void setBillid(String billid) {
    this.billid = billid;
  }


  public String getStatu() {
    return statu;
  }

  public void setStatu(String statu) {
    this.statu = statu;
  }


  public String getSsje() {
    return ssje;
  }

  public void setSsje(String ssje) {
    this.ssje = ssje;
  }

}
