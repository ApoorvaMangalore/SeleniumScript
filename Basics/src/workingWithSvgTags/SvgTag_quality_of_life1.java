package workingWithSvgTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgTag_quality_of_life1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.numbeo.com/quality-of-life/");
		WebElement text1 = driver.findElement(By.xpath("(//*[name()='g'])[1]"));
		System.out.println(text1.getText());
		driver.quit();
	}
}
