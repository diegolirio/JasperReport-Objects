package com.diegolirio.report.generate;

import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import com.diegolirio.report.models.People;

public final class Report {

	public void generateReport(List<People> list) throws JRException {
		String arquivo = "/WEB-INF/report/report_people.jasper";
		//InputStream is = Report.class.getResourceAsStream("/WEB-INF/report/report_people.jrxml");
		//JasperReport jr = JasperCompileManager.compileReport(is);
		JasperPrint jp = JasperFillManager.fillReport(arquivo, null, new JRBeanCollectionDataSource(list));
		JasperViewer.viewReport(jp, false);
	}
	
}
