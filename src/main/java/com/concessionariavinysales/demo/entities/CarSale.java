package com.concessionariavinysales.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

/*@Entity*/
public class CarSale implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@MapsId
	private CarOwner owner;
	
	@OneToOne
	@MapsId
	private CarBrand brand;
	
	@OneToOne
	@MapsId
	private CarModel model;
	private Integer year;
	private Double km;
	private Double price;
	private Boolean sold = false;
	
	public CarSale() {
	}

	public CarSale(Long id, CarOwner owner, CarBrand brand, CarModel model, Integer year, Double km, Double price,
			Boolean sold) {
		super();
		this.id = id;
		this.owner = owner;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.km = km;
		this.price = price;
		this.sold = sold;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CarOwner getOwner() {
		return owner;
	}

	public void setOwner(CarOwner owner) {
		this.owner = owner;
	}

	public CarBrand getBrand() {
		return brand;
	}

	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getSold() {
		return sold;
	}

	public void setSold(Boolean sold) {
		this.sold = sold;
	}

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
		CarSale other = (CarSale) obj;
		return Objects.equals(id, other.id);
	}
	*/
}
