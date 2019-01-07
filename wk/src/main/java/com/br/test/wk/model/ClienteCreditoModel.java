package com.br.test.wk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.br.test.wk.constants.TipoRisco;

@Entity(name="TB_CLIENTE_CREDITO")
public class ClienteCreditoModel {

	@Id
	@GeneratedValue
	@Column(name="CD_CLIENTE_CREDITO")
	private Long id;
	
	@Column(name="NM_CLIENTE")
	private String nome;
	
	@Column(name="LIMITE_CREDITO")
	private Double valorLimiteCredito;
	
	@Enumerated(EnumType.STRING)
    @Column(name="TP_RISCO", unique = true)
	private TipoRisco tipoRisco;
	
	@Column(name="TX_JUROS")
	private Integer taxaJuros;

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
		return "ClienteCreditoModel [id=" + id + ", nome=" + nome + ", valorLimiteCredito=" + valorLimiteCredito
				+ ", tipoRisco=" + tipoRisco + ", taxaJuros=" + taxaJuros + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteCreditoModel other = (ClienteCreditoModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
