package com.diegolirio.report.controllers;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diegolirio.report.generate.Report;
import com.diegolirio.report.models.People;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws JRException {
		Report report = new Report();
		List<People> list = new ArrayList<People>();
		People p1 = new People();
		p1.setId(1);
		p1.setCpfCnpj("35235698563");
		p1.setName("Diego Lirio");
		p1.setRg("420256131");
		list.add(p1);
		People p2 = new People();
		p2.setId(1);
		p2.setCpfCnpj("35235698563");
		p2.setName("João");
		p2.setRg("5151512531");
		list.add(p2);
		report.generateReport(list);
		return "home";
	}
	
}
