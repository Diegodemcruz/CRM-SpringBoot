package br.com.projetoIntegradorPig5.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author PIG5
*/

@Entity
public class AcaoUsuarioCliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2328489934353047406L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer acao_usuario_cliente_id;
	
	private Cliente cliente_id;
	
	private Acao acao_id;
	
	private String acao_usuario_cliente_descricao;
	
	private LocalDate acao_usuario_cliente_data;
	
	private Usuario usuario_id;

	public Integer getAcao_usuario_cliente_id() {
		return acao_usuario_cliente_id;
	}

	public void setAcao_usuario_cliente_id(Integer acao_usuario_cliente_id) {
		this.acao_usuario_cliente_id = acao_usuario_cliente_id;
	}

	public Cliente getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Cliente cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Acao getAcao_id() {
		return acao_id;
	}

	public void setAcao_id(Acao acao_id) {
		this.acao_id = acao_id;
	}

	public String getAcao_usuario_cliente_descricao() {
		return acao_usuario_cliente_descricao;
	}

	public void setAcao_usuario_cliente_descricao(String acao_usuario_cliente_descricao) {
		this.acao_usuario_cliente_descricao = acao_usuario_cliente_descricao;
	}

	public LocalDate getAcao_usuario_cliente_data() {
		return acao_usuario_cliente_data;
	}

	public void setAcao_usuario_cliente_data(LocalDate acao_usuario_cliente_data) {
		this.acao_usuario_cliente_data = acao_usuario_cliente_data;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	
	

}
