package com.concessionariavinysales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionariavinysales.demo.entities.CarSale;

public interface CarSaleRepository extends JpaRepository<CarSale, Long>{

}