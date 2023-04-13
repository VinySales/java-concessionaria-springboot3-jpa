package com.concessionariavinysales.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concessionariavinysales.demo.entities.CarOwner;
import com.concessionariavinysales.demo.services.CarOwnerService;

@RestController
@RequestMapping(value = "/carOwners")
public class CarOwnerResource {

	@Autowired
	private CarOwnerService service;

	@GetMapping
	public ResponseEntity<List<CarOwner>> findAll() {
		List<CarOwner> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CarOwner> findById(@PathVariable Long id) {
		CarOwner obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
