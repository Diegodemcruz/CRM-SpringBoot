package br.com.projetoIntegradorPig5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoIntegradorPig5.domain.Cliente;
import br.com.projetoIntegradorPig5.repository.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente search(Integer cliente_id) throws ObjectNotFoundException{
		Optional<Cliente> chave = clienteRepository.findById(cliente_id);
		return chave.orElseThrow(() -> new ObjectNotFoundException(
				"não encontrado. id " + cliente_id + ", Tipo!" + Cliente.class.getName()));
	}
	
	
	public List<Cliente> searchAll(){
		return clienteRepository.findAll();
	}
	
	
	public Cliente save (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
		
	public List<Cliente> saveAll(List<Cliente> cliente){
		return clienteRepository.saveAll(cliente);
	}
	
	public Cliente edit(Cliente cliente) throws ObjectNotFoundException {
		Cliente clienteEdit = search(cliente.getCliente_id());
		
		clienteEdit.setCliente_id(cliente.getCliente_id());
		clienteEdit.setCliente_nome(cliente.getCliente_nome());
		clienteEdit.setCliente_sobrenome(cliente.getCliente_sobrenome());
		clienteEdit.setCliente_cpf(cliente.getCliente_cpf());
		clienteEdit.setCliente_email(cliente.getCliente_email());
		clienteEdit.setCliente_status(cliente.getCliente_status());
		
		return save(clienteEdit);
		
	}
	
	
	public void delete(Integer cliente_id) {
		clienteRepository.deleteById(cliente_id);
	}


	public Cliente findOneUsuario(Integer cliente_id) {
		Optional<Cliente> cliente_Id = clienteRepository.findById(cliente_id);
				return cliente_Id.get();
	}
}
