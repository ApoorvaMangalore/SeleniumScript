package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("forcheckbox")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.className("text-box.single-line")).sendKeys("acm");
		
	   
		driver.findElement(By.className("button-1 register-next-step-button")).click();
		
	}

}
