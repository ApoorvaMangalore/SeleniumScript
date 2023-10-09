package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//click on all the img or ancher tacg ang get the text  and count how mant img/a yags are present.
public class ButtonsInHotStar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hotstar.com/in/home");
		List<WebElement> buttons = driver.findElements(By.xpath("//a"));// a

		System.out.println(buttons.size());
		for (WebElement button : buttons) {
			System.out.println(button.getText());

		}
		driver.quit();
	}
	
}
