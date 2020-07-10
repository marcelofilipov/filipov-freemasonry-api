package com.filipov.freemasonry.api.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.filipov.freemasonry.api.FilipovFreemasonryApiApplication;
import com.filipov.freemasonry.api.domain.model.Cargo;
import com.filipov.freemasonry.api.domain.repository.CargoRepository;

public class ConsultaCargoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FilipovFreemasonryApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CargoRepository cargos = applicationContext.getBean(CargoRepository.class);
		
		List<Cargo> todosCargos = cargos.todos();
		for (Cargo cargo : todosCargos) {
			System.out.println(cargo.getCargo());
		}


	}
	
}
