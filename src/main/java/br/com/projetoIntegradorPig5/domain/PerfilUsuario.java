package br.com.projetoIntegradorPig5.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author PIG5
*/

@Entity
public class PerfilUsuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6725680734477689571L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer permissao_id; 
	
	private String permissao_descricao;
	
	private String permissao_status;
	
	private Usuario usuario_id;

	public Integer getPermissao_id() {
		return permissao_id;
	}

	public void setPermissao_id(Integer permissao_id) {
		this.permissao_id = permissao_id;
	}

	public String getPermissao_descricao() {
		return permissao_descricao;
	}

	public void setPermissao_descricao(String permissao_descricao) {
		this.permissao_descricao = permissao_descricao;
	}

	public String getPermissao_status() {
		return permissao_status;
	}

	public void setPermissao_status(String permissao_status) {
		this.permissao_status = permissao_status;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	

}
