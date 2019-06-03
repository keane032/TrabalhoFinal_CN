package br.com.ufc.TrabalhoFinal_CN.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeAlimento;
	private String descricao;
	private int avaliacaoBoa = 0;
	private int avaliacaoRegular = 0;
	private int avaliacaoRuim = 0;
	
	
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	public Alimento() {
		super();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Alimento(String nomeAlimento) {
		super();
		this.nomeAlimento = nomeAlimento;
	}
	public Alimento(String nomeAlimento, String descricao) {
		super();
		this.nomeAlimento = nomeAlimento;
		this.descricao = descricao;
	}
	
	public int getAvaliacaoBoa() {
		return avaliacaoBoa;
	}
	public void setAvaliacaoBoa(int avaliacaoBoa) {
		this.avaliacaoBoa = avaliacaoBoa;
	}
	public int getAvaliacaoRegular() {
		return avaliacaoRegular;
	}
	public void setAvaliacaoRegular(int avaliacaoRegular) {
		this.avaliacaoRegular = avaliacaoRegular;
	}

	public int getAvaliacaoRuim() {
		return avaliacaoRuim;
	}
	public void setAvaliacaoRuim(int avaliacaoRuim) {
		this.avaliacaoRuim = avaliacaoRuim;
	}

}
