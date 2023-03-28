/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.controller;

import com.example.promoDemo.buisness.services.ClaimsService;
import com.example.promoDemo.model.entities.ClaimsModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ayash
 */
@RestController
@RequestMapping("/claims")
@CrossOrigin(origins = "http://localhost:4200")

public class ClaimsController {

    private final ClaimsService claimsService;

    public ClaimsController(ClaimsService claimsService) {
        this.claimsService = claimsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ClaimsModel>> getAllData() {
        List<ClaimsModel> dms = claimsService.findAllData();
        return new ResponseEntity<>(dms, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ClaimsModel> addData(@RequestBody ClaimsModel claimsModel) {
        ClaimsModel dm = claimsService.addData(claimsModel);
        return new ResponseEntity<>(dm, HttpStatus.CREATED);
    }

}
