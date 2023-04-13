package com.concessionariavinysales.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionariavinysales.demo.entities.CarModel;
import com.concessionariavinysales.demo.services.CarModelService;

@RestController
@RequestMapping(value = "/carModels")
public class CarModelResource {

	@Autowired
	private CarModelService service;

	@GetMapping
	public ResponseEntity<List<CarModel>> findAll() {
		List<CarModel> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CarModel> findById(@PathVariable Long id) {
		CarModel obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
