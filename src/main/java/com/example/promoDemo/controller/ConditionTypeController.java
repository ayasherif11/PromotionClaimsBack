/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.controller;

import com.example.promoDemo.buisness.services.ConditionTypeServices;
import com.example.promoDemo.model.entities.conTypeModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ayash
 */
@RestController
@RequestMapping("/conType")
@CrossOrigin(origins = "http://localhost:4200")

public class ConditionTypeController {

    private final ConditionTypeServices conditionTypeServices;

    public ConditionTypeController(ConditionTypeServices conditionTypeServices) {
        this.conditionTypeServices = conditionTypeServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<conTypeModel>> getAllData() {
        List<conTypeModel> data = conditionTypeServices.findAllData();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<conTypeModel> addData(@RequestBody conTypeModel conditionTypeModel) {
        conTypeModel newX = conditionTypeServices.addData(conditionTypeModel);
        return new ResponseEntity<>(newX, HttpStatus.CREATED);
    }

}
