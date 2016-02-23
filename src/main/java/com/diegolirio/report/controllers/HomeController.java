package com.diegolirio.report.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.report.generate.Report;
import com.diegolirio.report.models.Endereco;
import com.diegolirio.report.models.NotaFiscal;
import com.diegolirio.report.models.NotaProduto;
import com.diegolirio.report.models.People;
import com.diegolirio.report.models.Produto;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws JRException {
		return "home";
	}

	@RequestMapping(value="/imprimir_pessoas")
	public void imprimirPessoas(HttpServletRequest request, HttpServletResponse response) throws JRException, IOException {
		List<People> list = new ArrayList<People>();
		People p1 = new People();
		p1.setId(1);
		p1.setCpfCnpj("35235698563");
		p1.setName("Diego Lirio");
		p1.setRg("420256131");
		Endereco e1 = new Endereco(1l, "Rua Lidice", 22, "Pq Novo Mundo", "São Paulo", "SP");
		p1.setEndereco(e1);
		list.add(p1);
		People p2 = new People();
		p2.setId(1);
		p2.setCpfCnpj("35235698563");
		p2.setName("João");
		p2.setRg("5151512531");
		p2.setEndereco(e1);
		list.add(p2);
		Report report = new Report();
		byte[] generateReportPeoples = report.generateReportPeoples(list);
		response.setContentType("application/pdf");
		response.getOutputStream().write(generateReportPeoples); 
	}
	
	@RequestMapping(value = "/imprimir_nota", method = RequestMethod.GET)
	public void notas(HttpServletRequest request, HttpServletResponse response) throws JRException, IOException {
		response.setContentType("application/pdf");
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setId(1l);
		notaFiscal.setNumero(215);
		notaFiscal.setCnpj("61139432000172");
		notaFiscal.setData("12/02/2016");
		List<NotaProduto> notaProdutos = new ArrayList<NotaProduto>();
		NotaProduto np1 = new NotaProduto();
		np1.setId(1l);
		np1.setNotaFiscal(notaFiscal);
		Produto p1 = new Produto();
		p1.setCodigo("32");
		p1.setDescricao("Mouse Dell");
		p1.setValorUnitario(59.90d);
		np1.setProduto(p1 );
		np1.setQuantidade(2);
		notaProdutos.add(np1);
		NotaProduto np2 = new NotaProduto();
		np2.setId(2l);
		np2.setNotaFiscal(notaFiscal);
		Produto p2 = new Produto();
		p2.setCodigo("196");
		p2.setDescricao("Notebook Dell");
		p2.setValorUnitario(5590.90d);
		np2.setProduto(p2 );
		np2.setQuantidade(2);
		notaProdutos.add(np2);
		notaFiscal.setNotaProdutos(notaProdutos );
		Report report = new Report();
		byte[] generateReportNF = report.generateReportNF(notaFiscal);
		response.getOutputStream().write(generateReportNF); 
	}
	
	
}
