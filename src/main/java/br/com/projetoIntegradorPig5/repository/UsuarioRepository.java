package br.com.projetoIntegradorPig5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoIntegradorPig5.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {
	
	Usuario findByUsuarioLoginAndUsuarioSenha(String usuario_login, String usuario_senha);
	
	

}
