package com.projeto.apontament.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.apontament.datasource.model.Profissional;
import com.projeto.apontament.repository.ProfissionalRepository;

public class CadastrarProfissionais {
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	public void cadastro(Profissional profissional) {
		profissionalRepository.saveAndFlush(profissional);
	}

}
