package br.com.projetoIntegradorPig5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoIntegradorPig5.domain.Usuario;
import br.com.projetoIntegradorPig5.repository.UsuarioRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public boolean login(Usuario usuario) {
		Usuario searchUsuario = usuarioRepository.findByUsuarioLoginAndUsuarioSenha(usuario.getUsuarioLogin(), usuario.getUsuarioSenha());
		if (searchUsuario == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Usuario search(Integer usuario_id) throws ObjectNotFoundException{
		Optional<Usuario> usuario = usuarioRepository.findById(usuario_id);
		return usuario.orElseThrow(()-> new ObjectNotFoundException(
				"não encontrado. id " + usuario_id + ", Tipo !" + Usuario.class.getName()));
	}
	
	public List<Usuario> searchAll(){
		return usuarioRepository.findAll();
	}

	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
		
	}
	
	public List <Usuario> saveAll(List<Usuario> usuario){
		return usuarioRepository.saveAll(usuario);
	}

	public void delete(Integer usuario_id) {
		usuarioRepository.deleteById(usuario_id);
		
	}

	public Usuario findOneUsuario(Integer usuarioId) {
Optional<Usuario> usuario_Id = usuarioRepository.findById(usuarioId);
return usuario_Id.get();
	}

}
