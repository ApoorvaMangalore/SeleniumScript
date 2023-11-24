package workingWithScreenshoot;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWebPage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LocalDateTime time = LocalDateTime.now();
		driver.get("https://www.hyundai.com/in");

		TakesScreenshot Take_Screenshot = (TakesScreenshot) driver;

		File src = Take_Screenshot.getScreenshotAs(OutputType.FILE);

		File file = new File("./errorShots/webpage5.jpg");
		Files.copy(src, file);

		driver.quit();
	}
}

//File src = Take_Screenshot.getScreenshotAs(OutputType.FILE);
// Files.copy(src, new File("./errorShots/WEBPAGE3.jpg"));
// driver.quit();