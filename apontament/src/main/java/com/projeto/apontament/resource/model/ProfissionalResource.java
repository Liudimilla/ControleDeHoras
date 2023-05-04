package com.projeto.apontament.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfissionalResource {
	
	@JsonProperty("nome_profissional")
	private String nome;
	
	@JsonProperty("Id_profissional")
	private String id;
	
	@JsonProperty("chave_matricula")
	private String chaveM;

	public ProfissionalResource(String nome, String id, String chaveM) {
		this.nome = nome;
		this.id = id;
		this.chaveM = chaveM;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChaveM() {
		return chaveM;
	}

	public void setChaveM(String chaveM) {
		this.chaveM = chaveM;
	}

	@Override
	public String toString() {
		return "ProfissionalResource [nome=" + nome + ", id=" + id + ", chaveM=" + chaveM + "]";
	}
	
	

	
}
