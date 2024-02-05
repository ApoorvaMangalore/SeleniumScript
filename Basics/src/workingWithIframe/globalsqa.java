package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class globalsqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement dest = driver.findElement(By.id("trash"));
		Thread.sleep(3000);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
	}
}
