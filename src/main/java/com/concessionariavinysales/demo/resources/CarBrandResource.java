package com.concessionariavinysales.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionariavinysales.demo.entities.CarBrand;
import com.concessionariavinysales.demo.services.CarBrandService;

@RestController
@RequestMapping(value = "/carBrand")
public class CarBrandResource {

	@Autowired
	private CarBrandService service;

	@GetMapping
	public ResponseEntity<List<CarBrand>> findAll() {
		List<CarBrand> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CarBrand> findById(@PathVariable Long id) {
		CarBrand obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
