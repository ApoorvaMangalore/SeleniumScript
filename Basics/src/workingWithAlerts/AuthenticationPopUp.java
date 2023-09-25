package workingWithAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		//http://user:password@URL
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
