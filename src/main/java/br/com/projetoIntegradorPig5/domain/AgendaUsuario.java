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
public class AgendaUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1406643270141672114L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer agenda_id;
	
	private Cliente cliente_id;
	
	private Oferta oferta_id;
	
	private FunilEtapa funil_etapa_id;
	
	private Produto produto_id;
	
	private LocalDate agenda_data_inicio;
	
	private LocalDate agenda_data_fim;
	
	private String agenda_status;
	
	private Usuario usuario_id;

	public Integer getAgenda_id() {
		return agenda_id;
	}

	public void setAgenda_id(Integer agenda_id) {
		this.agenda_id = agenda_id;
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

	public Produto getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Produto produto_id) {
		this.produto_id = produto_id;
	}

	public LocalDate getAgenda_data_inicio() {
		return agenda_data_inicio;
	}

	public void setAgenda_data_inicio(LocalDate agenda_data_inicio) {
		this.agenda_data_inicio = agenda_data_inicio;
	}

	public LocalDate getAgenda_data_fim() {
		return agenda_data_fim;
	}

	public void setAgenda_data_fim(LocalDate agenda_data_fim) {
		this.agenda_data_fim = agenda_data_fim;
	}

	public String getAgenda_status() {
		return agenda_status;
	}

	public void setAgenda_status(String agenda_status) {
		this.agenda_status = agenda_status;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	
	
}
