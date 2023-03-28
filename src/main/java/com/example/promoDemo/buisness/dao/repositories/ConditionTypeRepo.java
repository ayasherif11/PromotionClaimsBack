/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.promoDemo.buisness.dao.repositories;

import com.example.promoDemo.model.entities.conTypeModel;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author ayash
 */
@CrossOrigin(origins = "http://localhost:4200")

public interface ConditionTypeRepo extends JpaRepositoryImplementation<conTypeModel, String> {

}
