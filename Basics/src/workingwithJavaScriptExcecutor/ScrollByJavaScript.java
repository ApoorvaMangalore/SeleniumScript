package workingwithJavaScriptExcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//jse.executeScript("window.scrollBy(0,1500);");
		jse.executeScript("window.scrollBy(0,500);");
	}

}
