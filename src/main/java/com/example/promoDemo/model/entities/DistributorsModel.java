/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.model.entities;

import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ayash
 */
@Entity
@Table(name = "Distributors")

public class DistributorsModel implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "branch")
    private String branch;

    @Column(name = "distributerNo")
    private String distributerNo;

    @Column(name = "sapCode")
    private String sapCode;

    @Column(name = "schema")
    private String schema;

    @Column(name = "region")
    private String region;

    @Column(name = "type")
    private String type;

    public DistributorsModel() {
    }

    public DistributorsModel(String branch, String distributerNo, String sapCode, String schema, String region, String type) {
        this.branch = branch;
        this.distributerNo = distributerNo;
        this.sapCode = sapCode;
        this.schema = schema;
        this.region = region;
        this.type = type;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDistributerNo() {
        return distributerNo;
    }

    public void setDistributerNo(String distributerNo) {
        this.distributerNo = distributerNo;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DistributorsModel{" + "branch=" + branch + ", distributerNo=" + distributerNo + ", sapCode=" + sapCode + ", schema=" + schema + ", region=" + region + ", type=" + type + '}';
    }

}
