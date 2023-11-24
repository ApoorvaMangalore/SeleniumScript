package workingWithSvgTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgTag_quality_of_life {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.numbeo.com/quality-of-life/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
