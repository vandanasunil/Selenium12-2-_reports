import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestJenkins {
	@Test
	public void JenkinDemoTest()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("Excecute Jenkin Demo");
	}

}
