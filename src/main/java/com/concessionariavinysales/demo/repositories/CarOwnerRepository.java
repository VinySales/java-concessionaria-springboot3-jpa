package com.concessionariavinysales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concessionariavinysales.demo.entities.CarOwner;

public interface CarOwnerRepository extends JpaRepository<CarOwner, Long>{

}