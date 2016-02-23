package com.diegolirio.report.models;

public class NotaProduto {

	private long id;
	private Produto produto;
	private NotaFiscal notaFiscal;
	private int quantidade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
