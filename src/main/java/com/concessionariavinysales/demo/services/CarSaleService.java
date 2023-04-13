package com.concessionariavinysales.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concessionariavinysales.demo.entities.CarSale;
import com.concessionariavinysales.demo.repositories.CarSaleRepository;

@Service
public class CarSaleService {

	@Autowired
	private CarSaleRepository repository;

	public List<CarSale> findAll() {
		return repository.findAll();
	}

	public CarSale findById(Long id) {
		Optional<CarSale> obj = repository.findById(id);
		return obj.get();
	}
	
}
