package br.com.gestaoeventos.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalasDoEvento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeDaSala;
	
	private Integer LotacaoDaSala;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDaSala() {
		return nomeDaSala;
	}

	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}

	public Integer getLotacaoDaSala() {
		return LotacaoDaSala;
	}

	public void setLotacaoDaSala(Integer lotacaoDaSala) {
		LotacaoDaSala = lotacaoDaSala;
	}
	
	
	
}
