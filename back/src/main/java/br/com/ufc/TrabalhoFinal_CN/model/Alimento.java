package br.com.ufc.TrabalhoFinal_CN.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.ufc.TrabalhoFinal_CN.view.AliementoView;

@Entity
@Table(name="alimento")
public class Alimento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeAlimento;
	private String descricao;
	private int avaliacaoBoa = 0;
	private int avaliacaoRegular = 0;
	private int avaliacaoRuim = 0;

	
	
	@JsonView(AliementoView.class)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonView(AliementoView.class)
	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	@JsonView(AliementoView.class)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@JsonView(AliementoView.class)
	public int getAvaliacaoBoa() {
		return avaliacaoBoa;
	}

	public void setAvaliacaoBoa(int avaliacaoBoa) {
		this.avaliacaoBoa = avaliacaoBoa;
	}
	
	@JsonView(AliementoView.class)
	public int getAvaliacaoRegular() {
		return avaliacaoRegular;
	}

	public void setAvaliacaoRegular(int avaliacaoRegular) {
		this.avaliacaoRegular = avaliacaoRegular;
	}
	
	@JsonView(AliementoView.class)
	public int getAvaliacaoRuim() {
		return avaliacaoRuim;
	}

	public void setAvaliacaoRuim(int avaliacaoRuim) {
		this.avaliacaoRuim = avaliacaoRuim;
	}

	

}
