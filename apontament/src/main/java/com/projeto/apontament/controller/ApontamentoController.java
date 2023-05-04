package com.projeto.apontament.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.apontament.datasource.model.Apontamento;
import com.projeto.apontament.repository.ApontamentoRepository;
import com.projeto.apontament.resource.model.ApontamentoResource;
import com.projeto.apontament.service.BuscarApontamentosServiceImp;
import com.projeto.apontament.service.CadastrarApontamento;

@RestController
@RequestMapping(value = "/api")
public class ApontamentoController {
	
@Autowired
private ApontamentoRepository apontamentoRepository;

@Autowired
private BuscarApontamentosServiceImp serviceBuscar;

@Autowired
private CadastrarApontamento serviceCadastro;

@GetMapping(path = "/apontamentos")
public List<Apontamento> buscarApontamentos(){
	return serviceBuscar.buscarTodosOsApontamentos();
}

@GetMapping(path = "/apontamentos/id/{id}")
public Optional<Apontamento> buscarApontamentosPorId(
		@PathVariable(name = "id", required = true) Long id){
	return apontamentoRepository.findById(id);
}

@PostMapping(path = "/apontamentos/save")
public void salvarApontamento(
		@RequestBody ApontamentoResource apontamento) {
	serviceCadastro.cadastro(apontamento);
}

@DeleteMapping(path = "/apontamentos/delete/{id}")
public void deleteApontamento(
		@PathVariable(name = "id", required = true) Long id) {
	apontamentoRepository.deleteById(id);
}


}
