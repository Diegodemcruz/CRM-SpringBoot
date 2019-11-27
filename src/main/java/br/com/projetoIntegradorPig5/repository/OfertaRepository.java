package br.com.projetoIntegradorPig5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoIntegradorPig5.domain.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Integer>  {

}
