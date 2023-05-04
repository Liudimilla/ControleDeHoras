package com.projeto.apontament.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.projeto.apontament.datasource.model.Apontamento;

public interface ApontamentoRepository extends JpaRepository<Apontamento, Long >{

}
