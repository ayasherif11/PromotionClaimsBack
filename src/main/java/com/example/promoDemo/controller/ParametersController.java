/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.controller;

import com.example.promoDemo.buisness.services.ParametersServices;
import com.example.promoDemo.model.entities.ParModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author ayash
 */
@RestController
@RequestMapping("/parametres")
@CrossOrigin(origins = "http://localhost:4200")

public class ParametersController {

    private final ParametersServices ParametersServices;

    public ParametersController(ParametersServices ParametersServices) {
        this.ParametersServices = ParametersServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ParModel>> getAllData() {
        List<ParModel> parData = ParametersServices.findAllPar();
        return new ResponseEntity<>(parData, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ParModel> addPar(@RequestBody ParModel parametersModel) {
        ParModel newPar = ParametersServices.addPar(parametersModel);
        return new ResponseEntity<>(newPar, HttpStatus.CREATED);
    }
}
