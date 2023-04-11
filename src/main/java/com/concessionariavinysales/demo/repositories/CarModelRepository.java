package com.concessionariavinysales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionariavinysales.demo.entities.CarModel;

public interface CarModelRepository extends JpaRepository<CarModel, Long>{

}