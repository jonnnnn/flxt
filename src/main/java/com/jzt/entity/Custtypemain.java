package com.jzt.entity;


public class Custtypemain {

  private String custtypeid;
  private String custtypename;
  private String note;
  private String deleteflag;
  private java.sql.Date createtime;
  private java.sql.Date lastmodifytime;


  public String getCusttypeid() {
    return custtypeid;
  }

  public void setCusttypeid(String custtypeid) {
    this.custtypeid = custtypeid;
  }


  public String getCusttypename() {
    return custtypename;
  }

  public void setCusttypename(String custtypename) {
    this.custtypename = custtypename;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public String getDeleteflag() {
    return deleteflag;
  }

  public void setDeleteflag(String deleteflag) {
    this.deleteflag = deleteflag;
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

}
