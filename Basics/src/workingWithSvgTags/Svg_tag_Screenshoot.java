package workingWithSvgTags;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Svg_tag_Screenshoot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.numbeo.com/quality-of-life/");
       // TakesScreenshot addresstype = (TakesScreenshot) driver;
		
        WebElement scrnshot = driver.findElement(By.xpath("(//*[local-name()='svg'])[2]"));
		
		File element = scrnshot.getScreenshotAs(OutputType.FILE);
		Files.copy(element, new File("./errorShots/webwlement4.jpg"));   
	
	}

}
