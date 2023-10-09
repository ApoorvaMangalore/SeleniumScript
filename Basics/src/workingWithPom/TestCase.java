package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {
	@Test
	void run() {

		RegRepo repo = new RegRepo(driver);
		repo.getRegisterlink().click();
		repo.getFemaleradioButton().click();
		repo.getLastname().sendKeys("apoorva");
	}
}
