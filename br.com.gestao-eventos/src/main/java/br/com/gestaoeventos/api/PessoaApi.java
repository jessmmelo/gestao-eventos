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

import br.com.gestaoeventos.modelos.Pessoa;
import br.com.gestaoeventos.servico.PessoaServico;

@RestController
@RequestMapping("/pessoa")
public class PessoaApi {

	@Autowired
	private PessoaServico pessoaServico;

	@PostMapping
	public Pessoa cadastar(@RequestBody Pessoa pessoa) {
		return pessoaServico.cadastrar(pessoa);
	}

	@GetMapping
	public List<Pessoa> listar() {
		return pessoaServico.listarTodos();
	}

	@GetMapping("/{id}")
	public Pessoa buscar(@PathVariable Integer id) {
		return pessoaServico.buscar(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Integer id) {
		pessoaServico.delete(id);
	}
	
	@PostMapping("/sala")
	public void sala() {
		pessoaServico.alterarSala();
	}
	
	@PostMapping("/cafes")
	public void cafes() {
		pessoaServico.alterarCafe();
	}
}
