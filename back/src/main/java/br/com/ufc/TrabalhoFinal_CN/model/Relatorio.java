package br.com.ufc.TrabalhoFinal_CN.model;

import java.util.ArrayList;
import java.util.Date;

public class Relatorio {
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
