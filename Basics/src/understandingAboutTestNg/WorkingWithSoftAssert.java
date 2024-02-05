package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is maximized");

		String actualurl = "https://demowebshop.tricentis.com/login";
		String actualEmailID = "acm@123";
		String actualpassword = "123456";
		boolean actualCheckBox = true;
		boolean actualLoginButton = true;
		SoftAssert softAssert = new SoftAssert();

		driver.get("https://demowebshop.tricentis.com/login");

		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		softAssert.assertEquals(url1, actualurl, "url is not valid");

		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("acm@123");
		String expemailId = emailId.getAttribute("value");
		System.out.println(expemailId);
		softAssert.assertEquals(actualEmailID, expemailId, "Email Id not Matching");

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456");
		String expectedPassword = password.getAttribute("value");
		System.out.println(expectedPassword);
		softAssert.assertEquals(actualpassword, expectedPassword, "Password is not Matching");

		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean expectedCheckBox = checkBox.isSelected();
		System.out.println(expectedCheckBox);
		softAssert.assertEquals(actualCheckBox, expectedCheckBox, "Check box is not selected");

		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		boolean expectedLoginnButton = loginButton.isSelected();
		System.out.println(expectedLoginnButton);
		softAssert.assertEquals(actualLoginButton, expectedLoginnButton, "Check box is not selected");

		softAssert.assertEquals(actualpassword, expectedPassword, "Password is not Matching");
		WebElement text = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
		System.out.println(text.getText());
		if (text.equals(text)) {
			System.out.println("Invaild user emailId");
		} else {
			System.out.println("User is able to Login ");
		}

		driver.quit();
		softAssert.assertAll();
	}
}
