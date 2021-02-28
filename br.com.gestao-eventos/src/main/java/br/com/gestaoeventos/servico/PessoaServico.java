package br.com.gestaoeventos.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoeventos.modelos.EspacosDeCafe;
import br.com.gestaoeventos.modelos.Pessoa;
import br.com.gestaoeventos.modelos.SalasDoEvento;
import br.com.gestaoeventos.repositorio.PessoaRepositorio;

@Service
public class PessoaServico {

	@Autowired
	private PessoaRepositorio pessoaRepositorio;

	@Autowired
	private SalasDoEventoServico eventoServico;

	@Autowired
	private EspacosDeCafeServico cafeServico;

	public Pessoa cadastrar(Pessoa pessoa) {
		return pessoaRepositorio.save(pessoa);
	}

	public List<Pessoa> listarTodos() {
		return pessoaRepositorio.findAll();
	}

	public Pessoa buscar(Integer id) {
		Optional<Pessoa> optional = pessoaRepositorio.findById(id);
		if (!optional.isPresent()) {
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

	public void alterarSala() {
		List<Pessoa> pessoas = listarTodos();
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).setCafes(null);
			pessoaRepositorio.save(pessoas.get(i));
		}
		List<SalasDoEvento> salaEvento = eventoServico.listarTodos();
		int index = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).setSalas(salaEvento.get(index));
			if (salaEvento.size() - 1 == index) {
				index = 0;
			} else {
				index++;
			}

			pessoaRepositorio.save(pessoas.get(i));
		}
	}

	public void alterarCafe() {
		List<Pessoa> pessoas = listarTodos();
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).setSalas(null);
			pessoaRepositorio.save(pessoas.get(i));
		}
		List<EspacosDeCafe> espacosDeCafes = cafeServico.listarTodos();
		int index = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).setCafes(espacosDeCafes.get(index));
			if (espacosDeCafes.size() - 1 == index) {
				index = 0;
			} else {
				index++;
			}

			pessoaRepositorio.save(pessoas.get(i));
		}
	}

}
