//package org.base;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;
//
//public class JVMReport {
//
//	
//		
//		public static void generateJVMReport(String jsonFile) throws IOException
//		{
//			File locat = new File("G:\\eclipse works\\AdactinApp\\src\\test\\resources\\Reports");
//		Configuration config = new Configuration(locat, "Adactin Hotel");
//		config.addClassifications("Sprint","20");
//		config.addClassifications("Browser","Chrome");
//		config.addClassifications("Env","UAT");
//		config.addClassifications("OS","Win-10");
//		List<String> jsonFiles = new ArrayList<String>();
//		jsonFiles.add(jsonFile);
//		
//		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
//		builder.generateReports();
//		
//		}
//
//	
//
//}
