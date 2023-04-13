package com.concessionariavinysales.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionariavinysales.demo.entities.Car;
import com.concessionariavinysales.demo.services.CarService;

@RestController
@RequestMapping(value = "/cars")
public class CarResource {

	@Autowired
	private CarService service;

	@GetMapping
	public ResponseEntity<List<Car>> findAll() {
		List<Car> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Car> findById(@PathVariable Long id) {
		Car obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
