package com.example.entity;

public class Function {
    private Integer id;
    private String feaName;
    private String upperID;

    public Integer getId() {return this.id;}
    public String getFeaName() {return this.feaName;}
    public String getUpperID() {return this.upperID;}
    public void setId(Integer id) {this.id=id;}
    public void setFeaName(String feaName) {this.feaName=feaName;}
    public void setUpperID(String upperID) {this.upperID=upperID;}

    public Function(Integer id,String feaName,String upperID) {
        this.id=id;
        this.feaName=feaName;
        this.upperID=upperID;
    }
    public Function(){}
}
