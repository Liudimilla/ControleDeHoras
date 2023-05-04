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

import com.projeto.apontament.datasource.model.Profissional;
import com.projeto.apontament.repository.ProfissionalRepository;


@RestController
@RequestMapping(value = "/api")
public class ProfissionalController {

@Autowired
private ProfissionalRepository profissionalRepository;
	
@GetMapping(path = "/profissional")
public List<Profissional> buscarProfissionais() {
	return profissionalRepository.findAll();
	
}

@GetMapping(path = "/profissional/id/{id}")
public Optional<Profissional> buscarProfissionaisPorId
(@PathVariable(name = "id", required = true) Long id) {
	return profissionalRepository.findById(id);
	
}
 
@PostMapping(path = "profissional/save")
public void salvarProfissional(@RequestBody Profissional profissional) {
	profissionalRepository.save(profissional);
}

@DeleteMapping(path = "/profissional/delete/{id}")
public void deleteProfissional(
@PathVariable(name = "id", required = true) Long id){
	profissionalRepository.deleteById(id);
}
	

}
