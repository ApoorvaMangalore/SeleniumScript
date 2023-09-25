package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableButton {

	private static Object object;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("apoorva");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("mangalore");
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()=' LogIn ']"));
		loginbutton.click();
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println(loginbutton.isSelected());
		driver.quit();
	}

}
