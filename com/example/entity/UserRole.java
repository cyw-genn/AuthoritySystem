package com.example.entity;

public class UserRole {
    private Integer id;
    private Integer userID;
    private Integer roleID;

    public Integer getId() {return this.id;}
    public Integer getUserID() {return this.userID;}
    public Integer getRoleID() {return this.roleID;}
    public void setId(Integer id) {this.id=id;}
    public void setUserID(Integer userID) {this.userID=userID;}
    public void setRoleID(Integer roleID) {this.roleID=roleID;}

    public UserRole(Integer id,Integer userID,Integer roleID) {
        this.id=id;
        this.userID=userID;
        this.roleID=roleID;
    }
    public UserRole() {}
}
