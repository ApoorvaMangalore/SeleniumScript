package workingWithScreenshoot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshootOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		TakesScreenshot tkscrnsht = (TakesScreenshot) driver;
		
		driver.get("https://in.puma.com/");
		
		File SrcFile=tkscrnsht.getScreenshotAs(OutputType.FILE);

	}

}
