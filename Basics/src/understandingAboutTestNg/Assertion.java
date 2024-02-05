package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public void demo() {

		//SoftAssert softAssert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is maximized");

		String url = "https://demowebshop.tricentis.com/login";
		driver.get("https://demowebshop.tricentis.com/login");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		 Assert.assertEquals(url, url1,"url is not valid");
		//softAssert.assertEquals(url, url1, "test fail");

		driver.findElement(By.id("Email")).sendKeys("acm@123.com");
		driver.findElement(By.id("Password")).sendKeys("12345");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("Email")).sendKeys("acm@123.com");
		driver.findElement(By.name("send-email")).click();
		driver.quit();
		//softAssert.assertAll();

	}
}