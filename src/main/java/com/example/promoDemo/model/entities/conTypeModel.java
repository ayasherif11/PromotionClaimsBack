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
@Table(name = "ConType")

public class conTypeModel implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "SCENARIO")
    private String scenario;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CONDITION_TYPE")
    private String condition_type;

    public conTypeModel() {
    }

    public conTypeModel(String scenario, String description, String condition_type) {
        this.scenario = scenario;
        this.description = description;
        this.condition_type = condition_type;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition_type() {
        return condition_type;
    }

    public void setCondition_type(String condition_type) {
        this.condition_type = condition_type;
    }

    @Override
    public String toString() {
        return "conTypeModel{" + "scenario=" + scenario + ", description=" + description + ", condition_type=" + condition_type + '}';
    }

}
