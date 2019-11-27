package br.com.projetoIntegradorPig5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoIntegradorPig5.domain.Oferta;
import br.com.projetoIntegradorPig5.repository.OfertaRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service 
public class OfertaService {

	@Autowired
	OfertaRepository ofertaRepository;
	
	public Oferta search(Integer oferta_id) throws ObjectNotFoundException{
		Optional<Oferta> chave = ofertaRepository.findById(oferta_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + oferta_id + ", Tipo!" + Oferta.class.getName()));
	}
	
	public List <Oferta> searchAll(){
		return ofertaRepository.findAll();
	}
	
	public Oferta save (Oferta oferta) {
		return ofertaRepository.save(oferta);
	}
	
	public List <Oferta> saveAll(List<Oferta> produto){
		return ofertaRepository.saveAll(produto);
	}
	
	public void delete(Integer oferta_id) {
		ofertaRepository.deleteById(oferta_id);
	}

	public Oferta findOneOferta(Integer ofertaId) {
Optional <Oferta> oferta_Id = ofertaRepository.findById(ofertaId);

		return oferta_Id.get();
	}
	
	
}
