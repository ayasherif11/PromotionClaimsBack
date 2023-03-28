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
@Table(name = "claims")

public class ClaimsModel implements Serializable {

    @Id
    @Basic(optional = false)

    @Column(name = "branch")
    private String branch;

    @Column(name = "article")
    private String article;

    @Column(name = "conitionType")
    private String conitionType;

    @Column(name = "discountAmount")
    private String discountAmount;

    @Column(name = "discountType")
    private String discountType;

    @Column(name = "internalOrderNumber")
    private String internalOrderNumber;

    public ClaimsModel() {
    }

    public ClaimsModel(String branch, String article, String conitionType, String discountAmount, String discountType, String internalOrderNumber) {
        this.branch = branch;
        this.article = article;
        this.conitionType = conitionType;
        this.discountAmount = discountAmount;
        this.discountType = discountType;
        this.internalOrderNumber = internalOrderNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getConitionType() {
        return conitionType;
    }

    public void setConitionType(String conitionType) {
        this.conitionType = conitionType;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getInternalOrderNumber() {
        return internalOrderNumber;
    }

    public void setInternalOrderNumber(String internalOrderNumber) {
        this.internalOrderNumber = internalOrderNumber;
    }

    @Override
    public String toString() {
        return "ClaimsModel{" + "branch=" + branch + ", article=" + article + ", conitionType=" + conitionType + ", discountAmount=" + discountAmount + ", discountType=" + discountType + ", internalOrderNumber=" + internalOrderNumber + '}';
    }

}
