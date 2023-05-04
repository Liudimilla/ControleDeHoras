package com.projeto.apontament.datasource.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profissional")
public class Profissional implements Serializable{
	
	private static final long serialVersionUID = -3981979437249073882L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name = "Matricula")
	private String chaveM;
	
	//@OneToMany
	//private Set<Apontamento> apontamentos;
	
//	public Profissional() {	
//	this.id = id;
//	this.nome = nome;
//	this.chaveM = chaveM;
//}
	
	public Profissional() {	
}
	
	
	public Long getId() {
		return id;
		
		
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getChaveM() {
		return chaveM;
	}
	public void setChaveM(String chaveM) {
		this.chaveM = chaveM;
	}
	
}
