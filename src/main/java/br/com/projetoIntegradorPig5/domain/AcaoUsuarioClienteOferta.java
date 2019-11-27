
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
public class AcaoUsuarioClienteOferta implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3318294142516162477L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer acao_usuario_cliente_oferta;

	private Acao acao_id;
	
	private String acao_usuario_cliente_oferta_descricao;
	
	private LocalDate acao_usuario_cliente_oferta_data;
	
	private Usuario usuario_id;
	
	private Cliente cliente_id;
	
	private Oferta oferta_id;
	
	private FunilEtapa funil_etapa_id;

	public Integer getAcao_usuario_cliente_oferta() {
		return acao_usuario_cliente_oferta;
	}

	public void setAcao_usuario_cliente_oferta(Integer acao_usuario_cliente_oferta) {
		this.acao_usuario_cliente_oferta = acao_usuario_cliente_oferta;
	}

	public Acao getAcao_id() {
		return acao_id;
	}

	public void setAcao_id(Acao acao_id) {
		this.acao_id = acao_id;
	}

	public String getAcao_usuario_cliente_oferta_descricao() {
		return acao_usuario_cliente_oferta_descricao;
	}

	public void setAcao_usuario_cliente_oferta_descricao(String acao_usuario_cliente_oferta_descricao) {
		this.acao_usuario_cliente_oferta_descricao = acao_usuario_cliente_oferta_descricao;
	}

	public LocalDate getAcao_usuario_cliente_oferta_data() {
		return acao_usuario_cliente_oferta_data;
	}

	public void setAcao_usuario_cliente_oferta_data(LocalDate acao_usuario_cliente_oferta_data) {
		this.acao_usuario_cliente_oferta_data = acao_usuario_cliente_oferta_data;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}

	public Cliente getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Cliente cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Oferta getOferta_id() {
		return oferta_id;
	}

	public void setOferta_id(Oferta oferta_id) {
		this.oferta_id = oferta_id;
	}

	public FunilEtapa getFunil_etapa_id() {
		return funil_etapa_id;
	}

	public void setFunil_etapa_id(FunilEtapa funil_etapa_id) {
		this.funil_etapa_id = funil_etapa_id;
	}

	
	
	

}
