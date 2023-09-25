package workingWithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandelandHandels{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Downloads/MultipleWindow_20221207_153133525.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		
		System.out.println(parentWindow);
		System.out.println(childwindow);
	}

}
