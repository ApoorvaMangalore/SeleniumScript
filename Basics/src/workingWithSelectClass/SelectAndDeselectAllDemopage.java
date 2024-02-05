package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAllDemopage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebElement multiSel = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSel);
		System.out.println(select.isMultiple());

		System.out.println(multiSel.getText());

		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(2);
		select.selectByIndex(3); //
		// select.deselectAll();

		WebElement firstselect = select.getFirstSelectedOption();
		System.out.println(firstselect);
		System.out.println(firstselect.getText());

		List<WebElement> alloptions = select.getAllSelectedOptions();
		System.out.println(alloptions);

		for (WebElement option : alloptions) {
			System.out.println(option.getText());
		}

	}

}
