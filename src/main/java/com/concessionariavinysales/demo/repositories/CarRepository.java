package com.concessionariavinysales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionariavinysales.demo.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long>{

}