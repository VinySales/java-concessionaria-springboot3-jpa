package com.concessionariavinysales.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionariavinysales.demo.entities.Car;
import com.concessionariavinysales.demo.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository repository;

	public List<Car> findAll() {
		return repository.findAll();
	}

	public Car findById(Long id) {
		Optional<Car> obj = repository.findById(id);
		return obj.get();
	}
	
}
