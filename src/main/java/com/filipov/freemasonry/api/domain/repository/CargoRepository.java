package com.filipov.freemasonry.api.domain.repository;

import java.util.List;

import com.filipov.freemasonry.api.domain.model.Cargo;

public interface CargoRepository {
	
	List<Cargo> todos();
	Cargo buscar(Long id);
	Cargo salvar(Cargo cargo);
	void remover(Cargo cargo);

}
