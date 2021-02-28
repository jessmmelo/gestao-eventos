package br.com.gestaoeventos.modelos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String sobrenome;
	
	@OneToOne(fetch = FetchType.EAGER)
	private SalasDoEvento salas;
	
	@OneToOne(fetch = FetchType.EAGER)
	private EspacosDeCafe cafes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public SalasDoEvento getSalas() {
		return salas;
	}

	public void setSalas(SalasDoEvento salas) {
		this.salas = salas;
	}

	public EspacosDeCafe getCafes() {
		return cafes;
	}

	public void setCafes(EspacosDeCafe cafes) {
		this.cafes = cafes;
	}
	
	
	
}
