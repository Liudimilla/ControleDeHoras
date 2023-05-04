package com.projeto.apontament.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApontamentoResource {
	
	@JsonProperty(" id_Apontamento")
	private String id_Apontamento;
	
	@JsonProperty("horas_trabalhadas")
	private int horasTrabalhadas;
	
	@JsonProperty("dias_trabalhados")
	private int diasTrabalhados;
	
	@JsonProperty("mes")
	private int mes;
	
	@JsonProperty("anos")
	private int anos;
	
	@JsonProperty("id_profissional")
	private Long id_profissional;
	
	public ApontamentoResource(int horasTrabalhadas, int diasTrabalhados, int mes, int anos) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.diasTrabalhados = diasTrabalhados;
		this.mes = mes;
		this.anos = anos;
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

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}
	

	public String getId_Apontamento() {
		return id_Apontamento;
	}

	public void setId_Apontamento(String id_Apontamento) {
		this.id_Apontamento = id_Apontamento;
	}


	
	public Long getId_profissional() {
		return id_profissional;
	}

	public void setId_profissional(Long id_profissional) {
		this.id_profissional = id_profissional;
	}

	@Override
	public String toString() {
		return "ApontamentoResource [horasTrabalhadas=" + horasTrabalhadas + ", diasTrabalhados=" + diasTrabalhados
				+ ", mes=" + mes + ", anos=" + anos + "]";
	}
	
	
	

}
