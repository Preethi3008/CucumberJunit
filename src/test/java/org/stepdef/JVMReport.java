package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String json) {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
	Configuration con = new Configuration(f, "Facebook Login validation Report");
	con.addClassifications("Platform name", "Windows");
	con.addClassifications("Platform version", "10");
	con.addClassifications("Browser name", "Chrome");
	con.addClassifications("Browser version", "867.0");
	con.addClassifications("Sprint no", "21");
	
	List<String> Li = new ArrayList<String>();		
	Li.add(json);
	ReportBuilder r = new ReportBuilder(Li, con);
	r.generateReports();
	}
}
