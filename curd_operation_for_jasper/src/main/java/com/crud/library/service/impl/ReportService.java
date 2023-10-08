package com.crud.library.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.crud.library.model.Book;
import com.crud.library.repository.ActionRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService{

	@Autowired
	private ActionRepository actionRepository;

	public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
		String path = "C:\\Users\\rajatvarshney\\Desktop\\report";
		List<Book> book = actionRepository.findAll();
		System.err.print(book);
		File file = ResourceUtils.getFile("classpath:books_details.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(book);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("createdBy","Library");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,dataSource);
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,path +"\\booksDetails.html");
		}
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\booksDetails.pdf");
		}
		return "report generated at " + path;
	}

	 
}
