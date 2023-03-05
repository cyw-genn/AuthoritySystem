package com.example.entity;

public class RoleFea {
    private Integer id;
    private Integer roleID;
    private Integer feaID;

    public Integer getId() {return this.id;}
    public Integer getRoleID() {return this.roleID;}
    public Integer getFeaID() {return this.feaID;}
    public void setId(Integer id) {this.id=id;}
    public void setRoleID(Integer roleID) {this.roleID=roleID;}
    public void setFeaID(Integer feaID) {this.feaID=feaID;}

    public RoleFea(Integer id,Integer roleID,Integer feaID) {
        this.id=id;
        this.roleID=roleID;
        this.feaID=feaID;
    }
    public RoleFea(){}
}
