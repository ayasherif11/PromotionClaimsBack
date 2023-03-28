/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.controller;

import com.example.promoDemo.buisness.services.DistributorsServices;
import com.example.promoDemo.model.entities.DistributorsModel;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ayash
 */
@RestController
@RequestMapping("/dis")
@CrossOrigin(origins = "http://localhost:4200")

public class DistributorsController {

    private final DistributorsServices distributorsServices;

    public DistributorsController(DistributorsServices distributorsServices) {
        this.distributorsServices = distributorsServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<DistributorsModel>> getAllData() {
        List<DistributorsModel> dms = distributorsServices.findAllData();
        return new ResponseEntity<>(dms, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<DistributorsModel> addData(@RequestBody DistributorsModel distributorsModel) {
        DistributorsModel dm = distributorsServices.addData(distributorsModel);
        return new ResponseEntity<>(dm, HttpStatus.CREATED);
    }
}
