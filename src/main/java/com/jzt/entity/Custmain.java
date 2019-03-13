package com.jzt.entity;


public class Custmain {

  private String custno;
  private String custname;
  private String custadd;
  private String note;
  private String deleteflag;
  private java.sql.Date lastmodifytime;
  private String custidentify;


  public String getCustno() {
    return custno;
  }

  public void setCustno(String custno) {
    this.custno = custno;
  }


  public String getCustname() {
    return custname;
  }

  public void setCustname(String custname) {
    this.custname = custname;
  }


  public String getCustadd() {
    return custadd;
  }

  public void setCustadd(String custadd) {
    this.custadd = custadd;
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


  public java.sql.Date getLastmodifytime() {
    return lastmodifytime;
  }

  public void setLastmodifytime(java.sql.Date lastmodifytime) {
    this.lastmodifytime = lastmodifytime;
  }


  public String getCustidentify() {
    return custidentify;
  }

  public void setCustidentify(String custidentify) {
    this.custidentify = custidentify;
  }

}
