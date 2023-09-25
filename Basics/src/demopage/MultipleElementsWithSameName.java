package demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsWithSameName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		driver.findElement(By.xpath("(//input[@name='fname'])[1]")).sendKeys("Sirsi");
		driver.findElement(By.xpath("(//input[@name='fname'])[2]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//input[@name='fname'])[3]")).sendKeys("Mangalore");
		driver.findElement(By.xpath("(//input[@name='fname'])[4]")).sendKeys("Karwar");
		driver.findElement(By.xpath("(//input[@name='fname'])[5]")).sendKeys("Mysore");
		driver.findElement(By.xpath("(//input[@name='fname'])[6]")).sendKeys("Siddapur");
		driver.findElement(By.xpath("(//input[@name='fname'])[7]")).sendKeys("Goa");
		driver.findElement(By.xpath("(//input[@name='fname'])[8]")).sendKeys("Gokarna");
		driver.findElement(By.xpath("(//input[@name='fname'])[9]")).sendKeys("Honnavar");
		
		WebElement text = driver.findElement(By.xpath("//th[contains(text(),'Multiple Elements')]"));
		System.out.println("Text of the element:: "+ text.getText());
		driver.quit();
	}

}
