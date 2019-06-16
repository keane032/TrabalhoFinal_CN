package br.com.ufc.TrabalhoFinal_CN.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avaliacao")
public class Avaliacao   {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
   private Date data;
	@JoinTable( 
	        name = "refe_alimento",  
	        inverseJoinColumns = @JoinColumn(
	          name = "alimen_id", referencedColumnName = "id"),
	        joinColumns = @JoinColumn(
	  	          name = "ava_id", referencedColumnName = "id")) 
	@ManyToMany
   private List <Alimento> alivementosAvaliacao = new ArrayList<>();;
   
public Date getData() {
	return data;
}
@Override
public String toString() {
	return "Avaliacao [data=" + data + ", alivementosAvaliacao=" + alivementosAvaliacao + "]";
}
public void setData(Date data) {
	this.data = data;
}
public List<Alimento> getAlivementosAvaliacao() {
	return alivementosAvaliacao;
}
public Avaliacao(Date data) {
	super();
	this.data = data;
}
public Avaliacao(Date data, List<Alimento> alivementosAvaliacao) {
	super();
	this.data = data;
	this.alivementosAvaliacao = alivementosAvaliacao;
}
public Avaliacao(List<Alimento> alivementosAvaliacao) {
	super();
	this.alivementosAvaliacao = alivementosAvaliacao;
}
public Avaliacao() {
	super();
}
public void setAlivementosAvaliacao(List<Alimento> alivementosAvaliacao) {
	this.alivementosAvaliacao = alivementosAvaliacao;
}
   
}
