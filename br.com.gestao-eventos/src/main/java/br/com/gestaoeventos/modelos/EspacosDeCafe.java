package br.com.gestaoeventos.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EspacosDeCafe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeEspacoCafe;
	
	private Integer lotacaoEspacoCafe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEspacoCafe() {
		return nomeEspacoCafe;
	}

	public void setNomeEspacoCafe(String nomeEspacoCafe) {
		this.nomeEspacoCafe = nomeEspacoCafe;
	}

	public Integer getLotacaoEspacoCafe() {
		return lotacaoEspacoCafe;
	}

	public void setLotacaoEspacoCafe(Integer lotacaoEspacoCafe) {
		this.lotacaoEspacoCafe = lotacaoEspacoCafe;
	}
	
	
}
