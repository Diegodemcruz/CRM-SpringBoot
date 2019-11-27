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
public class FunilEtapa implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4864084620643784311L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer funil_etapa_id;
	
	private String funil_etapa_descricao;
	
	private String funil_etapa_status;

	public Integer getFunil_etapa_id() {
		return funil_etapa_id;
	}

	public void setFunil_etapa_id(Integer funil_etapa_id) {
		this.funil_etapa_id = funil_etapa_id;
	}

	public String getFunil_etapa_descricao() {
		return funil_etapa_descricao;
	}

	public void setFunil_etapa_descricao(String funil_etapa_descricao) {
		this.funil_etapa_descricao = funil_etapa_descricao;
	}

	public String getFunil_etapa_status() {
		return funil_etapa_status;
	}

	public void setFunil_etapa_status(String funil_etapa_status) {
		this.funil_etapa_status = funil_etapa_status;
	}
	
	
	

	

}
