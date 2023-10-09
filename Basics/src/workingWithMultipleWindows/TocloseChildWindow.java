package workingWithMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocloseChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		
		String needToClose="Multiple popups";
		
		Set<String> windowhandels = driver.getWindowHandles();
		for(String handels:windowhandels) {
			driver.switchTo().window(handels);
			if(!needToClose.equals(driver.getTitle())) {
				driver.close();
			}
		}
	}

}
