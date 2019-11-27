
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
public class Acao implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5430282739363255488L;

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer acao_id;

	private String acao_descricao;

	private String acao_status;

	public Integer getAcao_id() {
		return acao_id;
	}

	public void setAcao_id(Integer acao_id) {
		this.acao_id = acao_id;
	}

	public String getAcao_descricao() {
		return acao_descricao;
	}

	public void setAcao_descricao(String acao_descricao) {
		this.acao_descricao = acao_descricao;
	}

	public String getAcao_status() {
		return acao_status;
	}

	public void setAcao_status(String acao_status) {
		this.acao_status = acao_status;
	}

}
