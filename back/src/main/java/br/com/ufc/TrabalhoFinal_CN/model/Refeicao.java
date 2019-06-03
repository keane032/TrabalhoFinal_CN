package br.com.ufc.TrabalhoFinal_CN.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Refeicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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
	
}
