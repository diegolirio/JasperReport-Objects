package com.diegolirio.report.generate;

import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import com.diegolirio.report.models.People;

public final class Report {

	public void generateReport(List<People> list) throws JRException {
		System.out.println(this.getClass().getClassLoader().getResource(""));
		String arquivo = "/WEB-INF/report/report_people.jasper";
		//InputStream is = Report.class.getResourceAsStream("/WEB-INF/report/report_people.jrxml");
		//JasperReport jr = JasperCompileManager.compileReport(is);
		JasperPrint jp = JasperFillManager.fillReport(arquivo, null, new JRBeanCollectionDataSource(list));
		JasperViewer.viewReport(jp, false);
	}
	
	public void generateReport2(List<People> peoples) throws JRException {
		String path = this.getClass().getClassLoader().getResource("").getPath();
		String pathToReportPackage = path + "report/";
		System.out.println(pathToReportPackage);
		
		JasperReport report = JasperCompileManager.compileReport(pathToReportPackage + "report_people.jrxml");
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(peoples));
		 
		JasperExportManager.exportReportToPdfFile(print, pathToReportPackage+"/Relatorio_.pdf");			
	}
	
}
