package com.filipov.freemasonry.api.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.filipov.freemasonry.api.FilipovFreemasonryApiApplication;
import com.filipov.freemasonry.api.domain.model.Cargo;
import com.filipov.freemasonry.api.domain.repository.CargoRepository;

public class BuscaCargoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FilipovFreemasonryApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CargoRepository cargoRepository = applicationContext.getBean(CargoRepository.class);
		
		Cargo cargo = cargoRepository.buscar(1L);

		System.out.println(cargo.getCargo());
	}
	
}
