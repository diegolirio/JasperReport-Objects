package com.diegolirio.report.models;

public class People {
	
	private long id;
	private String name;
	private String cpfCnpj;
	private String rg;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", cpfCnpj=" + cpfCnpj
				+ ", rg=" + rg + "]";
	}
	
	

}
