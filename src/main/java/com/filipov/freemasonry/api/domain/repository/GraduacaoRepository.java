package com.filipov.freemasonry.api.domain.repository;

import java.util.List;

import com.filipov.freemasonry.api.domain.model.Graduacao;

public interface GraduacaoRepository {
	
	List<Graduacao> todas();
	Graduacao porId(Long id);
	Graduacao salvar(Graduacao graduacao);
	void remover(Graduacao graduacao);

}
