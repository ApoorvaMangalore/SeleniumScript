package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo() {

		
		System.setProperty("webdriver.opera.driver", "./driver/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		System.out.println("browser is maximized");

		String actualurl = "https://demowebshop.tricentis.com/login";
		String actualEmailID="acm@123";
		
		driver.get("https://demowebshop.tricentis.com/login");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Assert.assertEquals(url1, actualurl, "url is not valid");
		
		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys(actualEmailID);
		String exp=emailId.getAttribute("value");
		System.out.println(exp);
		Assert.assertEquals(actualEmailID,exp,"Its correct");
		
		/*
		 * driver.findElement(By.id("Password")).sendKeys("12345");
		 * driver.findElement(By.id("RememberMe")).click();
		 * driver.findElement(By.linkText("Forgot password?")).click();
		 * driver.findElement(By.id("Email")).sendKeys("acm@123.com");
		 * driver.findElement(By.name("send-email")).click(); driver.quit();
		 */
		// softAssert.assertAll();

	}
}
