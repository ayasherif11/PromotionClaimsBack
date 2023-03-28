package com.example.promoDemo.buisness.dao.repositories;

import com.example.promoDemo.model.entities.DistributorsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author ayash
 */
@CrossOrigin(origins = "http://localhost:4200")

public interface DistributorsRepo extends JpaRepository<DistributorsModel, Long> {

}
