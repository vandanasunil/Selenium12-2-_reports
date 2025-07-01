package ExtentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void CreateReport()
	{
		 String timesstamp = LocalDateTime.now().toString().replace(":", "-");
		// Step 1: Create ExtentSparkReporter Object
		ExtentSparkReporter  spark = new ExtentSparkReporter("./HTML_Reports/extentreport_"+timesstamp+".html");
		
		//step 2: Create ExtentReports Object
		ExtentReports eReport = new ExtentReports();
		
		//Step 3: attach ExtentSparkReporter to ExtentReports
		eReport.attachReporter(spark);
		
		//Step 4: Create ExtentTest Object	
		ExtentTest test = eReport.createTest("CreateReport");
		
		//Step 5: call log(Status,"message")
		test.log(Status.PASS, "log message added into report");
		
		//step 6: call flush
		eReport.flush();
		
		
		
		
		
	
	}

}
