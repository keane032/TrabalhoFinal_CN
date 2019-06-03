package br.com.ufc.TrabalhoFinal_CN.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
  private ArrayList<Alimento> ListaDeAlimentos;
  private Date dateDoRelatorio;
public ArrayList<Alimento> getListaDeAlimentos() {
	return ListaDeAlimentos;
}
public void setListaDeAlimentos(ArrayList<Alimento> listaDeAlimentos) {
	ListaDeAlimentos = listaDeAlimentos;
}
public Date getDateDoRelatorio() {
	return dateDoRelatorio;
}
public void setDateDoRelatorio(Date dateDoRelatorio) {
	this.dateDoRelatorio = dateDoRelatorio;
}
@Override
public String toString() {
	return "Relatorio [ListaDeAlimentos=" + ListaDeAlimentos + ", dateDoRelatorio=" + dateDoRelatorio + "]";
}
public Relatorio(Date dateDoRelatorio) {
	super();
	this.dateDoRelatorio = dateDoRelatorio;
}
public Relatorio(ArrayList<Alimento> listaDeAlimentos, Date dateDoRelatorio) {
	super();
	ListaDeAlimentos = listaDeAlimentos;
	this.dateDoRelatorio = dateDoRelatorio;
}
  
}
