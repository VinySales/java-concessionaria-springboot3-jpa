package com.concessionariavinysales.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionariavinysales.demo.entities.CarBrand;
import com.concessionariavinysales.demo.repositories.CarBrandRepository;

@Service
public class CarBrandService {

	@Autowired
	private CarBrandRepository repository;

	public List<CarBrand> findAll() {
		return repository.findAll();
	}

	public CarBrand findById(Long id) {
		Optional<CarBrand> obj = repository.findById(id);
		return obj.get();
	}
	
	public CarBrand insert(CarBrand obj) {
		return repository.save(obj);
	}
	
}
