package br.com.ufc.TrabalhoFinal_CN.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeAdmin;
	private int senhaAdmin;
	@Override
	public String toString() {
		return "Admin [nomeAdmin=" + nomeAdmin + ", senhaAdmin=" + senhaAdmin + "]";
	}
	public String getNomeAdmin() {
		return nomeAdmin;
	}
	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}
	public int getSenhaAdmin() {
		return senhaAdmin;
	}
	public Admin() {
		super();
	}
	public void setSenhaAdmin(int senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}
	public Admin(String nomeAdmin, int senhaAdmin) {
		super();
		this.nomeAdmin = nomeAdmin;
		this.senhaAdmin = senhaAdmin;
	}

}
