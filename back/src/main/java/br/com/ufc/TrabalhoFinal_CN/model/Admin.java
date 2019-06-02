package br.com.ufc.TrabalhoFinal_CN.model;

public class Admin {
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
