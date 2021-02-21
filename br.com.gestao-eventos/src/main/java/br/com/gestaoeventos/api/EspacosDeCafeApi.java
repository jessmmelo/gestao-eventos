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

import br.com.gestaoeventos.modelos.EspacosDeCafe;
import br.com.gestaoeventos.servico.EspacosDeCafeServico;

@RestController
@RequestMapping("/espacosDeCafe")
public class EspacosDeCafeApi {

	@Autowired
	private EspacosDeCafeServico cafeServico;
	
	@PostMapping
	public EspacosDeCafe cadastar(@RequestBody EspacosDeCafe espacosDeCafe) {
		return cafeServico.cadastrar(espacosDeCafe);
	}

	@GetMapping
	public List<EspacosDeCafe> listar() {
		return cafeServico.listarTodos();
	}

	@GetMapping("/{id}")
	public EspacosDeCafe buscar(@PathVariable Integer id) {
		return cafeServico.buscar(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Integer id) {
		cafeServico.delete(id);
	}
}
