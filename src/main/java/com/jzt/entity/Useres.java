package com.jzt.entity;


public class Useres {

  private String userid;
  private String username;
  private String password;
  private String menu;
  private String deleteflag;
  private String note;
  private java.sql.Date createtime;
  private java.sql.Date lastmodifytime;


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getMenu() {
    return menu;
  }

  public void setMenu(String menu) {
    this.menu = menu;
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
