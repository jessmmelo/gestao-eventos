package br.com.gestaoeventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoeventos.modelos.SalasDoEvento;

@Repository
public interface SalasDoEventoRepositorio extends JpaRepository<SalasDoEvento, Integer>{

}
