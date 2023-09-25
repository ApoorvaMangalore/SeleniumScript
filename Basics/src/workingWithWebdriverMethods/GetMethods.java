package workingWithWebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser is launched");

		driver.manage().window().maximize();
		System.out.println("Browser is maximized");

		// To luanch the shoppersstack
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Application is launched");
		Thread.sleep(2000);

		// To capture the URL
		String url = driver.getCurrentUrl();
		System.out.println(url + "  : URL of the application");
		Thread.sleep(2000);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource + " :Page source of the application");
		Thread.sleep(2000);

		String tittleOfThepage = driver.getTitle();
		System.out.println(tittleOfThepage + " :tittle of the page");
		Thread.sleep(2000);

		// driver.close();
		driver.quit();
	}

}
