package com.example.entity;


import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;

    private String roleName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String RoleName) {
        this.roleName = RoleName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Role(Integer id, String RoleName){
        this.id=id;
        this.roleName=RoleName;
    }
    public Role(){

    }
}