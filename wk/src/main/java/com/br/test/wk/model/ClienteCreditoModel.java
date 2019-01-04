package com.br.test.wk.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClienteCreditoModel {

	@Id
	@Column(name="CD_CLIENTE")
	private Long id;
	
	@Column(name="NOME_CLIENTE")
	private String nome;
	
	@Column(name="LIMITE_CREDITO")
	private Double valorLimiteCredito;
	
	@OneToMany(mappedBy="clienteCreditoModel", cascade = CascadeType.ALL)
	private List<RiscoCreditoModel> tiposRisco;

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
	
	public List<RiscoCreditoModel> getTiposRisco() {
		return tiposRisco;
	}

	public void setTiposRisco(List<RiscoCreditoModel> tiposRisco) {
		this.tiposRisco = tiposRisco;
	}

	@Override
	public String toString() {
		return "ClienteCreditoModel [id=" + id + ", nome=" + nome + ", valorLimiteCredito=" + valorLimiteCredito + "]";
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
