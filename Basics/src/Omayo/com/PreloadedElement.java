package Omayo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreloadedElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		WebElement textBox = driver.findElement(By.id("textbox1"));
		System.out.println(textBox.getAttribute("value"));
		textBox.clear();
		textBox.sendKeys("apoorva");
		System.out.println(textBox.getAttribute("value"));
		driver.quit();

	}

}
