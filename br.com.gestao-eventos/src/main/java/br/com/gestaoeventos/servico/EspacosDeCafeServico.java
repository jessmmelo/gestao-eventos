package br.com.gestaoeventos.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gestaoeventos.modelos.EspacosDeCafe;
import br.com.gestaoeventos.repositorio.EspacosDeCafeRepositorio;

@Service
public class EspacosDeCafeServico {

	@Autowired
	private EspacosDeCafeRepositorio cafeRepositorio;
	
	public EspacosDeCafe cadastrar(EspacosDeCafe espacosDeCafe) {
		return cafeRepositorio.save(espacosDeCafe);
	}

	public List<EspacosDeCafe> listarTodos() {
		return cafeRepositorio.findAll();
	}

	public EspacosDeCafe buscar(Integer id) {
		Optional<EspacosDeCafe> optional = cafeRepositorio.findById(id);
		if (!optional.isPresent()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public void delete(Integer id) {
		EspacosDeCafe espacosDeCafe = buscar(id);
		if (espacosDeCafe != null) {
			cafeRepositorio.delete(espacosDeCafe);
		}
	}
}
