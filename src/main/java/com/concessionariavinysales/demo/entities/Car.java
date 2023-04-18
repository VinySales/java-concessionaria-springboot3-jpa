package com.concessionariavinysales.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private CarModel model;
	
	//@OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
	//private CarSale carSale;
	@JsonIgnore
	@OneToMany(mappedBy = "car")
	private List<CarSale> carSales = new ArrayList<>();
	
	public Car() {
	}
	
	public Car(Long id, CarModel model) {
		super();
		this.id = id;
		this.model = model;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}
	
	public List<CarSale> getCarSales() {
		return carSales;
	}
	
	//public CarSale getCarSale() {
		//return carSale;
	//}

	//public void setCarSale(CarSale carSale) {
		//this.carSale = carSale;
	//}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(id, other.id);
	}
	
}
