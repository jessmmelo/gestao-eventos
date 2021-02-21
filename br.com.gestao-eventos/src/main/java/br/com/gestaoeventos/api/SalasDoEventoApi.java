package br.com.gestaoeventos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestaoeventos.modelos.SalasDoEvento;
import br.com.gestaoeventos.servico.SalasDoEventoServico;

@RestController
@RequestMapping("/salasDoEvento")
public class SalasDoEventoApi {

	@Autowired
	private SalasDoEventoServico salasDoEventoServico;
	
	@PostMapping
	public SalasDoEvento cadastar(@RequestBody SalasDoEvento salasDoEvento) {
		return salasDoEventoServico.cadastrar(salasDoEvento);
	}

	@GetMapping
	public List<SalasDoEvento> listar() {
		return salasDoEventoServico.listarTodos();
	}

	@GetMapping("/{id}")
	public SalasDoEvento buscar(@PathVariable Integer id) {
		return salasDoEventoServico.buscar(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Integer id) {
		salasDoEventoServico.delete(id);
	}
}
