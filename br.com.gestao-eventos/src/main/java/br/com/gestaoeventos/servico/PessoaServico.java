package br.com.gestaoeventos.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoeventos.modelos.Pessoa;
import br.com.gestaoeventos.repositorio.PessoaRepositorio;

@Service
public class PessoaServico {

	@Autowired
	private PessoaRepositorio pessoaRepositorio;

	public Pessoa cadastrar(Pessoa pessoa) {
		return pessoaRepositorio.save(pessoa);
	}

	public List<Pessoa> listarTodos() {
		return pessoaRepositorio.findAll();
	}

	public Pessoa buscar(Integer id) {
		Optional<Pessoa> optional = pessoaRepositorio.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public void delete(Integer id) {
		Pessoa pessoa = buscar(id);
		if (pessoa != null) {
			pessoaRepositorio.delete(pessoa);
		}
	}

}
