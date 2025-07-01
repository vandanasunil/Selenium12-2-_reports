package ExtentReports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AssignmentJune23 {
	@Test
	public void loginScreenShot()
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   //1.open demo workshop app
	   driver.get("https://demowebshop.tricentis.com/");
	   //2.click on login link 
	   driver.findElement(By.linkText("Log in")).click();
	   //3.enter invalid email n password
	   driver.findElement(By.id("Email")).sendKeys("vandana12@gmal.com");
	   driver.findElement(By.id("Password")).sendKeys("vandana123");
	   //4.click on login button
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   
	   //5. take screenshot add it in extent report  n add timestamp 
	   String timestamp = LocalDateTime.now().toString().replace(":", "-");
	   
	    TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/screenshotReport_"+timestamp+".html");
		ExtentReports eReport = new  ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test = eReport.createTest("loginScreenShot");
		test.log(Status.INFO, "Add login Screenshot");
		test.addScreenCaptureFromBase64String(screenshot);
		eReport.flush();
	}

}
