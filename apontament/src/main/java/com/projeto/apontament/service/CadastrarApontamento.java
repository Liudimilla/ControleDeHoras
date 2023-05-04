package com.projeto.apontament.service;

import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.apontament.datasource.model.Apontamento;
import com.projeto.apontament.datasource.model.Profissional;
import com.projeto.apontament.exception.ApontamentoResouceException;
import com.projeto.apontament.repository.ApontamentoRepository;
import com.projeto.apontament.repository.ProfissionalRepository;
import com.projeto.apontament.resource.model.ApontamentoResource;

@Service
public class CadastrarApontamento {
	
	private static final Logger LOG = Logger.getLogger(CadastrarApontamento.class);
	
	@Autowired
	private ApontamentoRepository apontamentoRepository;
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@Autowired
	private ApontamentoConversor service;
	
	public void cadastro(ApontamentoResource apontamentoResource) {
	
		
		try {
			Optional<Profissional> profissionalOptional = profissionalRepository.findById(apontamentoResource.getId_profissional());
			if(profissionalOptional.isPresent()) {
				Apontamento apontamento = service
						.conversor(apontamentoResource, profissionalOptional.get());
				apontamentoRepository.saveAndFlush(apontamento);	
			}else {
				throw new ApontamentoResouceException("Profissional não encontrado");
			}
			
		} catch (ApontamentoResouceException e) {
		LOG.error("Erro ao salvar o apontamento: "+ e.getMessage(), e );
		}
		
	}

}
