package com.concessionariavinysales.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.concessionariavinysales.demo.entities.Car;
import com.concessionariavinysales.demo.entities.CarBrand;
import com.concessionariavinysales.demo.entities.CarModel;
import com.concessionariavinysales.demo.entities.CarOwner;
import com.concessionariavinysales.demo.entities.CarSale;
import com.concessionariavinysales.demo.repositories.CarBrandRepository;
import com.concessionariavinysales.demo.repositories.CarModelRepository;
import com.concessionariavinysales.demo.repositories.CarOwnerRepository;
import com.concessionariavinysales.demo.repositories.CarRepository;
import com.concessionariavinysales.demo.repositories.CarSaleRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CarBrandRepository carBrandRepository;

	@Autowired
	private CarModelRepository carModelRepository;

	@Autowired
	private CarOwnerRepository carOwnerRepository;

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private CarSaleRepository carSaleRepository;

	@Override
	public void run(String... args) throws Exception {

		CarOwner co1 = new CarOwner(null, "Vinicius Sales", "vinysales@hotmail.com", "+5511942556459");
		CarOwner co2 = new CarOwner(null, "Alessandro Costa", "alessandro@hotmail.com", "+551194251755");
		
		carOwnerRepository.saveAll(Arrays.asList(co1, co2));
		
		CarBrand cb1 = new CarBrand(null, "Peugeot");
		CarBrand cb2 = new CarBrand(null, "Chevrolet");
		
		carBrandRepository.saveAll(Arrays.asList(cb1, cb2));

		CarModel cm1 = new CarModel(null, "308 THP", cb1);
		CarModel cm2 = new CarModel(null, "207 Passion", cb1);
		
		carModelRepository.saveAll(Arrays.asList(cm1, cm2));

		Car c1 = new Car(null, cm1);
		Car c2 = new Car(null, cm2);
		
		carRepository.saveAll(Arrays.asList(c1, c2));

		CarSale cs1 = new CarSale(null, co1, c1, 51.000, 46.000, false);
		CarSale cs2 = new CarSale(null, co1, c1, 110.000, 21.000, false);

		carSaleRepository.saveAll(Arrays.asList(cs1, cs2));
	}
}
