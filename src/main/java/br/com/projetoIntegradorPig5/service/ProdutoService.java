package br.com.projetoIntegradorPig5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoIntegradorPig5.domain.Produto;
import br.com.projetoIntegradorPig5.repository.ProdutoRepository;
import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public Produto search(Integer produto_id) throws ObjectNotFoundException{
		Optional<Produto> produto = produtoRepository.findById(produto_id);
		return produto.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + produto_id + ", Tipo!" + Produto.class.getName()));
	}
	
	
	
	public List <Produto> searchAll(){
		return produtoRepository.findAll();
	}
	
	public Produto save (Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public List <Produto> saveAll(List<Produto> produto){
		return produtoRepository.saveAll(produto);
	}
	
	
	public Produto findOneProduto(int produtoId) {
        Optional<Produto> produto_Id = produtoRepository.findById(produtoId);
        return produto_Id.get();
    }
	
	
	
	public void delete(Integer produto_id) {
		produtoRepository.deleteById(produto_id);
	}
	
}
