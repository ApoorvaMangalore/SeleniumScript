package workingWithWebdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println(loginbutton.isSelected());

	}

}
