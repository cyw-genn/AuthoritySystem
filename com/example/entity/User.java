package com.example.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String identify;
    private String qq;
    private String wechat;
    private String address;
    private String telephone;
    private String email;
    private String personalpage;
    private String idtime;
    private String phonetime;
    private String mailtime;
    private String status;
    private String createtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id=id;}
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password=password;}
    public String getIdentify() {return identify;}
    public String getQq() {return qq;}
    public void setIdentify(String identify) {this.identify=identify;}
    public void setQq(String qq) {this.qq=qq;}
    public String getWechat() {return wechat;}
    public void setWechat(String wechat) {this.wechat=wechat;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address=address;}
    public String getTelephone() {return telephone;}
    public void setTelephone(String telephone) {this.telephone=telephone;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email=email;}
    public String getPersonalpage() {return personalpage;}
    public void setPersonalpage(String personalpage) {this.personalpage=personalpage;}
    public String getPhonetime() {return phonetime;}
    public void setPhonetime(String phonetime) {this.phonetime=phonetime;}
    public String getIdtime() {return idtime;}
    public void setIdtime(String idtime) {this.idtime=idtime;}
    public String getMailtime() {return mailtime;}
    public void setMailtime(String mailtime) {this.mailtime=mailtime;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status=status;}
    public String getCreatetime() {return createtime;}
    public void setCreatetime(String createtime) {this.createtime=createtime;}
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User(Integer userID, String userName, String password, String identify, String qq, String wechat, String address, String telephone, String email, String personalpage, String idtime, String phonetime, String mailtime, String status, String createtime) {
        this.id=userID;
        this.name=userName;
        this.password=password;
        this.identify=identify;
        this.qq=qq;
        this.wechat=wechat;
        this.address=address;
        this.telephone=telephone;
        this.email=email;
        this.personalpage=personalpage;
        this.phonetime=phonetime;
        this.idtime=idtime;
        this.mailtime=mailtime;
        this.status=status;
        this.createtime=createtime;
    }

    public User(){

    }
    @Override
    public String toString(){
        return "User{"+"id="+id+", name='"+name+'\''+", password='"+password+'\''+'}';
    }
}
