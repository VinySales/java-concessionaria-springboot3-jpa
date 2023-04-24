package com.concessionariavinysales.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionariavinysales.demo.entities.CarOwner;
import com.concessionariavinysales.demo.repositories.CarOwnerRepository;

@Service
public class CarOwnerService {

	@Autowired
	private CarOwnerRepository repository;

	public List<CarOwner> findAll() {
		return repository.findAll();
	}

	public CarOwner findById(Long id) {
		Optional<CarOwner> obj = repository.findById(id);
		return obj.get();
	}
	
	public CarOwner insert(CarOwner obj) {
		return repository.save(obj);
	}
	
}
