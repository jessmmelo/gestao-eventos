package br.com.gestaoeventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoeventos.modelos.EspacosDeCafe;

@Repository
public interface EspacosDeCafeRepositorio extends JpaRepository<EspacosDeCafe, Integer>{

}
