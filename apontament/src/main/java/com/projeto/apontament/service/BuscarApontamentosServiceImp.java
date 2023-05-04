package com.projeto.apontament.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.apontament.datasource.model.Apontamento;
import com.projeto.apontament.repository.ApontamentoRepository;

@Service
public class BuscarApontamentosServiceImp {
	
	private static final Logger LOG = Logger
			.getLogger(BuscarApontamentosServiceImp.class);
	
	@Autowired
	private ApontamentoRepository apontamentoRepository;
	
	public List<Apontamento> buscarTodosOsApontamentos(){
		LOG.info("Serviço para buscar todos os apontamentos");
		List<Apontamento> listApontamentos = apontamentoRepository
				.findAll();
		return listApontamentos;
	}

}
