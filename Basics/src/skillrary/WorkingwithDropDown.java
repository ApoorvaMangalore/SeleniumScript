package skillrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//https://demoapp.skillrary.com/ in drop down how many options are present and print it.
public class WorkingwithDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement searchDropDown = driver.findElement(By.name("addresstype"));
		searchDropDown.click();
		Select select = new Select(searchDropDown);
		List<WebElement> alloptions = select.getOptions();
		for (WebElement element : alloptions) {
			System.out.println(element.getAttribute("value"));
			System.out.println(element.getText());
		}

		driver.quit();
	}

}
