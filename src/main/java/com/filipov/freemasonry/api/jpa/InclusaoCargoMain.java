package com.filipov.freemasonry.api.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.filipov.freemasonry.api.FilipovFreemasonryApiApplication;
import com.filipov.freemasonry.api.domain.model.Cargo;
import com.filipov.freemasonry.api.domain.repository.CargoRepository;

public class InclusaoCargoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FilipovFreemasonryApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CargoRepository cargoRepository = applicationContext.getBean(CargoRepository.class);

		Cargo cargo1 = new Cargo();
		cargo1.setCargo("Orador");

		Cargo cargo2 = new Cargo();
		cargo2.setCargo("Secretario");
		
		cargo1 = cargoRepository.salvar(cargo1);
		cargo2 = cargoRepository.salvar(cargo2);

		System.out.printf("%d - %s\n", cargo1.getId(), cargo1.getCargo());
		System.out.printf("%d - %s\n", cargo2.getId(), cargo2.getCargo());

	}
	
}
