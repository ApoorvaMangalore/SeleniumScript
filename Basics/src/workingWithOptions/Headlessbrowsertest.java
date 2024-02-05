package workingWithOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowsertest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
