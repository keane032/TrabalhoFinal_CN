package br.com.ufc.TrabalhoFinal_CN.model;

public class Alimento {
	private String nomeAlimento;
	private int avaliacaoBoa;
	private int avaliacaoRegular;
	private int avaliacaoRuim;
	private String descricao;
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
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
	public Alimento() {
		super();
	}
	public int getAvaliacaoRuim() {
		return avaliacaoRuim;
	}
	public void setAvaliacaoRuim(int avaliacaoRuim) {
		this.avaliacaoRuim = avaliacaoRuim;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Alimento [nomeAlimento=" + nomeAlimento + ", avaliacaoBoa=" + avaliacaoBoa + ", avaliacaoRegular="
				+ avaliacaoRegular + ", avaliacaoRuim=" + avaliacaoRuim + ", descricao=" + descricao + "]";
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
	

}
