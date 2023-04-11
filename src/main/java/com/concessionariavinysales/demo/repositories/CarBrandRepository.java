package com.concessionariavinysales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionariavinysales.demo.entities.CarBrand;

public interface CarBrandRepository extends JpaRepository<CarBrand, Long>{

}