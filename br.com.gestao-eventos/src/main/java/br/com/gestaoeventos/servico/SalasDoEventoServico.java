package br.com.gestaoeventos.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoeventos.modelos.SalasDoEvento;
import br.com.gestaoeventos.repositorio.SalasDoEventoRepositorio;

@Service
public class SalasDoEventoServico {

	@Autowired
	private SalasDoEventoRepositorio salasDoEventoRepositorio;
	
	public SalasDoEvento cadastrar(SalasDoEvento salasDoEvento) {
		return salasDoEventoRepositorio.save(salasDoEvento);
	}

	public List<SalasDoEvento> listarTodos() {
		return salasDoEventoRepositorio.findAll();
	}

	public SalasDoEvento buscar(Integer id) {
		Optional<SalasDoEvento> optional = salasDoEventoRepositorio.findById(id);
		if (!optional.isPresent()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public void delete(Integer id) {
		SalasDoEvento salasDoEvento = buscar(id);
		if (salasDoEvento != null) {
			salasDoEventoRepositorio.delete(salasDoEvento);
		}
	}
}
