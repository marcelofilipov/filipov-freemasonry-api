package com.filipov.freemasonry.api.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.filipov.freemasonry.api.domain.model.Cargo;
import com.filipov.freemasonry.api.domain.repository.CargoRepository;

@Component
public class CargoRepositoryImpl implements CargoRepository{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Cargo> todos() {
		return manager.createQuery("from Cargo", Cargo.class).getResultList();
	}
	
	@Override
	public Cargo buscar(Long id) {
		return manager.find(Cargo.class, id);
	}
	
	@Transactional
	@Override
	public Cargo salvar(Cargo cargo) {
		return manager.merge(cargo);
	}
	
	@Transactional
	@Override
	public void remover(Cargo cargo) {
		cargo = buscar(cargo.getId());
		manager.remove(cargo);
	}

}
