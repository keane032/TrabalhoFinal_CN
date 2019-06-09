package br.com.ufc.TrabalhoFinal_CN.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="refeicao")
public class Refeicao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2894455384584417930L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeRefeicao;
	
	@JoinTable( 
	        name = "refe_alimento",  
	        inverseJoinColumns = @JoinColumn(
	          name = "alimen_id", referencedColumnName = "id"),
	        joinColumns = @JoinColumn(
	  	          name = "refe_id", referencedColumnName = "id")) 
	@OneToMany
	List<Alimento> listaDeAlimentos = new ArrayList<>();
	
	
	public Refeicao() {}	
	public Refeicao(String nomeRefeicao, List<Alimento> listaDeAlimentos) {
		this.nomeRefeicao = nomeRefeicao;
		this.listaDeAlimentos = listaDeAlimentos;
	}
	public Refeicao(Integer id, String nomeRefeicao, ArrayList<Alimento> listaDeAlimentos) {
		this.id = id;
		this.nomeRefeicao = nomeRefeicao;
		this.listaDeAlimentos = listaDeAlimentos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeRefeicao() {
		return nomeRefeicao;
	}
	public void setNomeRefeicao(String nomeRefeicao) {
		this.nomeRefeicao = nomeRefeicao;
	}
	public List<Alimento> getListaDeAlimentos() {
		return listaDeAlimentos;
	}
	public void setListaDeAlimentos(List<Alimento> listaDeAlimentos) {
		this.listaDeAlimentos = listaDeAlimentos;
	}
	
	
}
