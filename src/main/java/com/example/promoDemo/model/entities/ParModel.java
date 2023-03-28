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
@Table(name = "PARAMETERS")

public class ParModel implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VALUE")
    private String value;

    public ParModel() {
    }

    public ParModel(String code, String description, String value) {
        this.code = code;
        this.description = description;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParModel{" + "code=" + code + ", description=" + description + ", value=" + value + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
