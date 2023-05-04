package com.projeto.apontament.service;

import org.springframework.stereotype.Component;

import com.projeto.apontament.datasource.model.Apontamento;
import com.projeto.apontament.datasource.model.Profissional;
import com.projeto.apontament.exception.ApontamentoResouceException;
import com.projeto.apontament.resource.model.ApontamentoResource;

@Component
public class ApontamentoConversor {
	
	public Apontamento conversor(
			ApontamentoResource apontamentoResource, Profissional profissional ) 
					throws ApontamentoResouceException {
		
		try {
			
			Apontamento apontamento = new Apontamento();
			
			Long id_Apontamento = checkId_Apontamento(
					apontamentoResource.getId_Apontamento());
			
			//String nome = checkNome(apontamentoResource.getNome());
			apontamento.setId_Apontamento(id_Apontamento);
			apontamento.setAno(apontamentoResource.getAnos());
			apontamento.setDiasTrabalhados(apontamentoResource.getDiasTrabalhados());
			apontamento.setHorasTrabalhadas(apontamentoResource.getHorasTrabalhadas());
			apontamento.setProfissional(profissional);
			return apontamento;
			
			
			
			
		
	} catch (Exception e) {
		throw new ApontamentoResouceException(
				"Falha ao converter o resouce para entidade, resource: " 
		+ apontamentoResource);
	}
		
	}	
		
	private Long checkId_Apontamento(String id_Apontamento) {
		return Long.parseLong(id_Apontamento);
		
	}
	
	private String checkNome(String nome) {
		return String.valueOf(nome);
	}

}
