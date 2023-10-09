package workingWithScreenshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Webpage {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");

		TakesScreenshot takeScrn = (TakesScreenshot) driver;
		WebElement src1 = driver.findElement(By.linkText("LOGIN"));
		
		File login = src1.getScreenshotAs(OutputType.FILE);
		File file=new File("./screenshot/webelement.jpg");
		
		Files.copy(login, file);
		driver.quit();
	}
}
