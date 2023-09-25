package workingWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassViewAs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement selector = driver.findElement(By.id("products-orderby"));
		
		Select sel=new Select(selector);
	
		//sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		//Thread.sleep(2000);
		sel.selectByVisibleText("Name: A to Z");
		
		Thread.sleep(2000);
		driver.navigate().back();//staleelement exception due to url.
		sel.selectByVisibleText("Name: Z to A");
		driver.quit();
		
	}

}
