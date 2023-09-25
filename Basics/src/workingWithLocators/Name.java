package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("apoorva");
		driver.findElement(By.name("LastName")).sendKeys("Mangalore");
		driver.findElement(By.name("Email")).sendKeys("apoorvamangalore12@gmail.com");// change mail id
		driver.findElement(By.name("Password")).sendKeys("asdfghjk23");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("asdfghjk23");
		driver.findElement(By.name("register-button")).click();
		String currrenturl = driver.getCurrentUrl();
		System.out.println("current URL of the page" + currrenturl);
		driver.quit();

	}

}
