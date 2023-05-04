package com.projeto.apontament.datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Apontamentos")
public class Apontamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_Apontamento;

	@Column(name = "jornada_de_trabalho")
	private int horasTrabalhadas;
	private int diasTrabalhados;
	private int mes;
	private int ano;
	@ManyToOne
	private Profissional profissional;
	@OneToOne
	private ProjetoAlocado projetoAlocado;
	
	
//	public Apontamento(int horasTrabalhadas, int diasTrabalhados, int mes, int ano) {
//	this.horasTrabalhadas = horasTrabalhadas;
//	this.diasTrabalhados = diasTrabalhados;
//	this.mes = mes;
//	this.ano = ano;
//}
	
	public Long getId_Apontamento() {
		return id_Apontamento;
	}
	public void setId_Apontamento(Long id_Apontamento) {
		this.id_Apontamento = id_Apontamento;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}
	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	public ProjetoAlocado getProjetoAlocado() {
		return projetoAlocado;
	}
	public void setProjetoAlocado(ProjetoAlocado projetoAlocado) {
		this.projetoAlocado = projetoAlocado;
	}
	
	
}
