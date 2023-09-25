package workingWithUnitTestingTool;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Run {
	@Parameters({ "url", "browserName" })
	@Test
	public void browser(@Optional("https://www.hyundai.com/in/en")String url, String browserName) throws InterruptedException {

		WebDriver driver = null;

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("browser is not valid");
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(4000);

		driver.quit();
	}
}
