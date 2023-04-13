package com.concessionariavinysales.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionariavinysales.demo.entities.CarSale;
import com.concessionariavinysales.demo.services.CarSaleService;

@RestController
@RequestMapping(value = "/carSales")
public class CarSaleResource {

	@Autowired
	private CarSaleService service;

	@GetMapping
	public ResponseEntity<List<CarSale>> findAll() {
		List<CarSale> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CarSale> findById(@PathVariable Long id) {
		CarSale obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
