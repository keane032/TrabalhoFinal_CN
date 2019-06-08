package br.com.ufc.TrabalhoFinal_CN.model;

import java.util.ArrayList;
import java.util.Date;

public class Refeicao {
	private Date date;
	private String nomeRefeicao;
	private ArrayList <Alimento> ListaDeAlimentos;
	public String getNomeRefeicao() {
		return nomeRefeicao;
	}
	public void setNomeRefeicao(String nomeRefeicao) {
		this.nomeRefeicao = nomeRefeicao;
	}
	public Refeicao(String nomeRefeicao, ArrayList<Alimento> listaDeAlimentos) {
		super();
		this.nomeRefeicao = nomeRefeicao;
		ListaDeAlimentos = listaDeAlimentos;
	}
	public ArrayList<Alimento> getListaDeAlimentos() {
		return ListaDeAlimentos;
	}
	public void setListaDeAlimentos(ArrayList<Alimento> listaDeAlimentos) {
		ListaDeAlimentos = listaDeAlimentos;
	}
	@Override
	public String toString() {
		return "Refeicao [nomeRefeicao=" + nomeRefeicao + ", ListaDeAlimentos=" + ListaDeAlimentos + "]";
	}
	

}
