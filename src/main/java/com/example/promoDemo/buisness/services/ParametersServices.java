/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.promoDemo.buisness.services;

import com.example.promoDemo.buisness.dao.repositories.ParametresRepo;
import com.example.promoDemo.model.entities.ParModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ayash
 */
@Service
@Transactional

public class ParametersServices {

    private final ParametresRepo parametresRepo;

    @Autowired
    public ParametersServices(ParametresRepo parametresRepo) {
        this.parametresRepo = parametresRepo;
    }

    public List<ParModel> findAllPar() {
        return parametresRepo.findAll();
    }

    public ParModel addPar(ParModel parametersModel) {
        return parametresRepo.save(parametersModel);
    }

}
