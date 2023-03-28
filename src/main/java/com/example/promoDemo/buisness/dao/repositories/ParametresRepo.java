/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.promoDemo.buisness.dao.repositories;

import com.example.promoDemo.model.entities.ParModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author ayash
 */
@CrossOrigin(origins = "http://localhost:4200")

public interface ParametresRepo extends JpaRepository<ParModel, Long> {

}
