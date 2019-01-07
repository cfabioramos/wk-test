package com.br.test.wk.resource.to;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import com.br.test.wk.constants.TipoRisco;
import com.br.test.wk.model.ClienteCreditoModel;

public class ClienteCreditoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private Double valorLimiteCredito;
	
	private TipoRisco tipoRisco;
	
	private Integer taxaJuros;
	
	public ClienteCreditoModel getModel() {
		
		ClienteCreditoModel model = new ClienteCreditoModel();
		
		BeanUtils.copyProperties(this, model);
		
		return model;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValorLimiteCredito() {
		return valorLimiteCredito;
	}
	
	public void setValorLimiteCredito(Double valorLimiteCredito) {
		this.valorLimiteCredito = valorLimiteCredito;
	}
	
	public TipoRisco getTipoRisco() {
		return tipoRisco;
	}
	
	public void setTipoRisco(TipoRisco tipoRisco) {
		this.tipoRisco = tipoRisco;
	}
	
	public Integer getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(Integer taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public String toString() {
		return "ClienteCreditoTO [nome=" + nome + ", valorLimiteCredito=" + valorLimiteCredito + ", tipoRisco="
				+ tipoRisco + ", taxaJuros=" + taxaJuros + "]";
	}

}
