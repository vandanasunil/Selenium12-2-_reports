package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariCarTest {
	@Test
	
	public void FerrariCarLaunch()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("Ferrari Car Executed",true);
	}

}
