package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterYourMail {

	private static Object object;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your mail')]"));
		email.sendKeys("apoorva@123");
		WebElement subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		System.out.println(subscribe.isSelected());
		System.out.println(subscribe.isEnabled());
		System.out.println(subscribe.isDisplayed());
		driver.quit();

	}

}
