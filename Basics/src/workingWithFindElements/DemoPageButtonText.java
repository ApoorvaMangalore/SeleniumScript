package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageButtonText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		
		for(WebElement element:buttons) {
			System.out.println(element.getText());
		}
		/*
		 * for(int i=0;i<button.size();i++) { String text = button.get(i).getText();
		 * System.out.println(text); }
		 */
		driver.quit();
	}

}

