package com.concessionariavinysales.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

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
		CarOwner co3 = new CarOwner(null, "Jane Sales", "jane@hotmail.com", "+5511998509920");
		
		CarBrand cb1 = new CarBrand(null, "Peugeot");
		CarBrand cb2 = new CarBrand(null, "Chevrolet");

		CarModel cm1 = new CarModel(null, "308 THP", cb1);
		CarModel cm2 = new CarModel(null, "207 Passion", cb1);
		
		Car c1 = new Car(null, cm1);
		Car c2 = new Car(null, cm2);
		
		CarSale cs1 = new CarSale(null, co1, c1, 51000.0, 46000.0, false);
		CarSale cs2 = new CarSale(null, co2, c2, 110000.0, 21000.0, false);
		
		carOwnerRepository.saveAll(Arrays.asList(co1, co2, co3));
		carBrandRepository.saveAll(Arrays.asList(cb1, cb2));
		carModelRepository.saveAll(Arrays.asList(cm1, cm2));
		carRepository.saveAll(Arrays.asList(c1, c2));
		carSaleRepository.saveAll(Arrays.asList(cs1, cs2));
	}
}
