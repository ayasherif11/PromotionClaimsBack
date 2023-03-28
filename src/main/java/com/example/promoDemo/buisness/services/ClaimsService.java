/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.buisness.services;

import com.example.promoDemo.buisness.dao.repositories.ClaimsRepo;
import com.example.promoDemo.model.entities.ClaimsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 *
 * @author ayash
 */
@Service
@Transactional

public class ClaimsService {

    private final ClaimsRepo claimsRepo;

    @Autowired
    public ClaimsService(ClaimsRepo claimsRepo) {
        this.claimsRepo = claimsRepo;
    }

    public List<ClaimsModel> findAllData() {
        return claimsRepo.findAll();
    }

    public ClaimsModel addData(ClaimsModel cm) {
        return claimsRepo.save(cm);
    }

}
