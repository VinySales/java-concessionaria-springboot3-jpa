package com.concessionariavinysales.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionariavinysales.demo.entities.CarModel;
import com.concessionariavinysales.demo.repositories.CarModelRepository;

@Service
public class CarModelService {

	@Autowired
	private CarModelRepository repository;

	public List<CarModel> findAll() {
		return repository.findAll();
	}

	public CarModel findById(Long id) {
		Optional<CarModel> obj = repository.findById(id);
		return obj.get();
	}
	
}