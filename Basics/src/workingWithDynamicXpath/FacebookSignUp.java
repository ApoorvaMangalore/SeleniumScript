package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_b_')]")).sendKeys("apoorva");//contains
		
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_d_')]")).sendKeys("Mangalore");
		
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_s_')]")).click();
	}
}