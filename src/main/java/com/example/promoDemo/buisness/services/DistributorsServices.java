/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.buisness.services;

import com.example.promoDemo.model.entities.DistributorsModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.promoDemo.buisness.dao.repositories.DistributorsRepo;

/**
 *
 * @author ayash
 */
@Service
@Transactional

public class DistributorsServices {

    private final DistributorsRepo distributorsRepo;

    @Autowired
    public DistributorsServices(DistributorsRepo distributorsRepo) {
        this.distributorsRepo = distributorsRepo;
    }

    public List<DistributorsModel> findAllData() {
        return distributorsRepo.findAll();
    }

    public DistributorsModel addData(DistributorsModel distributorsModel) {
        return distributorsRepo.save(distributorsModel);
    }
}
