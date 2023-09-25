package workingWithScreenshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;



public class WebElementScrnshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");

		TakesScreenshot addresstype = (TakesScreenshot) driver;
		
		WebElement src = driver.findElement(By.name("addresstype"));
		
		File element = src.getScreenshotAs(OutputType.FILE);
		Files.copy(element, new File("./errorShots/webwlement3.jpg"));//you have change the name of the scrsht

		driver.quit();
	}
}
