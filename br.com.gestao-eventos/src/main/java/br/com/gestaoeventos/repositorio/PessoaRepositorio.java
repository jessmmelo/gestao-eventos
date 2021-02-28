package br.com.gestaoeventos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoeventos.modelos.Pessoa;
import br.com.gestaoeventos.modelos.SalasDoEvento;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer> {
	List<Pessoa> findBySalas(SalasDoEvento salas);
}
