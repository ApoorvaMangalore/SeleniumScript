package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertion {

	@Test
	public void demo() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is maximized");

		String actualurl = "https://demowebshop.tricentis.com/login";
		String actualEmailID = "acm123";
		String actualpassword = "123456";
		boolean actualCheckBox = true;
		boolean actualLoginButton = true;

		driver.get("https://demowebshop.tricentis.com/login");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Assert.assertEquals(url1, actualurl, "url is not valid");

		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("acm@123");
		String expemailId = emailId.getAttribute("value");
		System.out.println(expemailId);
		Assert.assertEquals(actualEmailID, expemailId, "Email Id not Matching");

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		String expectedPassword = password.getAttribute("value");
		System.out.println(expectedPassword);
		Assert.assertEquals(actualpassword, expectedPassword, "Password is not Matching");

		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean expectedCheckBox = checkBox.isSelected();
		System.out.println(expectedCheckBox);
		Assert.assertEquals(actualCheckBox, expectedCheckBox, "Check box is not selected");

		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		boolean expectedLoginnButton = loginButton.isSelected();
		System.out.println(expectedLoginnButton);
		Assert.assertEquals(actualLoginButton, expectedLoginnButton, "User is not able to click on login button");

		WebElement text = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
		if(text.equals(text)) {
			System.out.println("Invaild user emailId");
		}
		driver.quit();

	}
}
