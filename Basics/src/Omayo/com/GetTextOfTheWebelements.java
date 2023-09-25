package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfTheWebelements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		WebElement text1 = driver.findElement(By.xpath("//div[@itemprop='description articleBody']"));
		System.out.println(text1.getText());
		WebElement text2 = driver
				.findElement(By.xpath("//div[contains(text(),' This is a sample Text on this page')]"));
		System.out.println(text2.getText());
		WebElement textarea2 = driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing')]"));

		System.out.println(textarea2.getText());
	}
}
