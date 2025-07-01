package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWCarTest {
	@Test
	public void BMwCarLaunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMW Car Executed",true);
	
	}

}
