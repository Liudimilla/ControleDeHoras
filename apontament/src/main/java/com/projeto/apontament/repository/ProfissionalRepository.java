package com.projeto.apontament.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apontament.datasource.model.Profissional;



public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
	
}
