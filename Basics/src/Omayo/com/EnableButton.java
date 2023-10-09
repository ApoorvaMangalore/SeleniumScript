package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableButton {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//getLocation();
		//gettagname
		//getclassname
		//submit
		//isDispalyed
		//isEnable
		//isSelected
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("apoorva");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("mangalore");
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()=' LogIn ']"));
		loginbutton.click();//submit
		Point loc = loginbutton.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		System.out.println(loginbutton.getTagName());
		System.out.println(loginbutton.getClass().getSimpleName());
		System.out.println(loginbutton.isDisplayed());
		System.out.println(loginbutton.isEnabled());
		System.out.println(loginbutton.isSelected());
	}

}
