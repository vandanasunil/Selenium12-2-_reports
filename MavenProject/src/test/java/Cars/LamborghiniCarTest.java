package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniCarTest {
	@Test
	public void LamborghiniCarLaunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en#val-ht");
		Reporter.log("Lamborghini Car Executed",true);
	}

}
