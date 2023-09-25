package skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		driver.findElement(By.id("email")).sendKeys("acm@40gmail.com");
		driver.findElement(By.id("password")).sendKeys("acm123");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();

		driver.findElement(By.id("last")).click();
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		if (url1.equals(url2)) {
			System.out.println("user is able to login");
		}
		else {
			System.out.println("user is not able to login");
		}
		driver.quit();
	}

}
