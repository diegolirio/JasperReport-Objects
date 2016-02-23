package com.diegolirio.report.models;

import java.util.List;

public class NotaFiscal {
	
	private long id;
	private int numero;
	private String cnpj;
	private String data;
	private List<NotaProduto> notaProdutos;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<NotaProduto> getNotaProdutos() {
		return notaProdutos;
	}
	public void setNotaProdutos(List<NotaProduto> notaProdutos) {
		this.notaProdutos = notaProdutos;
	}

	
	
}
