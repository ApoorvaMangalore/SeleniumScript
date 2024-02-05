package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDependesOnGroups {

	public class Cabs {
		@Test(groups = "cabs")
		public void launchOla() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ola.com/");
			driver.quit();
		}

		@Test(groups = "cabs")
		public void launchUber() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.uber.com/");
			driver.quit();
		}

		@Test(groups = "cabs")
		public void launchRapido() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rapido.com/");
			driver.quit();
		}
	}
}
