package demopage;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/demo.html");
		
		 List<WebElement> allcheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int sizeOftheCheckBox = allcheckBox.size();
		System.out.println(sizeOftheCheckBox);
		
		for(int i=0;i<allcheckBox.size();i++) {
			
		}
	}

}
