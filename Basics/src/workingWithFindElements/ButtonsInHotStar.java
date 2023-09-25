package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsInHotStar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hotstar.com/in/home");
		List<WebElement> buttons = driver.findElements(By.xpath("//img"));// a

		System.out.println(buttons.size());
		for (WebElement button : buttons) {
			System.out.println(button.getText());

		}

	}

}
