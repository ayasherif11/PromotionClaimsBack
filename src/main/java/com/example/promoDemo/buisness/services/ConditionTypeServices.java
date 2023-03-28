/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.buisness.services;

import com.example.promoDemo.buisness.dao.repositories.ConditionTypeRepo;
import com.example.promoDemo.model.entities.conTypeModel;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ayash
 */
@Service
@Transactional

public class ConditionTypeServices {

    private final ConditionTypeRepo conditionTypeRepo;

    @Autowired
    public ConditionTypeServices(ConditionTypeRepo conditionTypeRepo) {
        this.conditionTypeRepo = conditionTypeRepo;
    }

    public List<conTypeModel> findAllData() {
        return conditionTypeRepo.findAll();
    }

    public conTypeModel addData(conTypeModel conditionTypeModel) {
        return conditionTypeRepo.save(conditionTypeModel);
    }

}
