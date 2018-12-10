package br.com.fiscaltech.model;

import java.util.Calendar;

public class Veiculo {

	private String placa;
	private Calendar anoModelo;
	private Calendar atualizadoEm;
	private Cor idCor;
	private Calendar anoFabricacao;
	private boolean ativo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Calendar getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Calendar anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Calendar getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Calendar atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public Cor getIdCor() {
		return idCor;
	}

	public void setIdCor(Cor idCor) {
		this.idCor = idCor;
	}

	public Calendar getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Calendar anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
