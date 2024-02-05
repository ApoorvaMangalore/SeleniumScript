package workingWithMultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TohandelCalenderPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://in.via.com");
		String date = "2";
		driver.findElement(By.id("departure")).click();
		//driver.findElement(By.xpath("((//span[contains(@class,'vc-month-box-head')])[2]/../../..//div[text()='20'])[1]")).click();
		WebElement dateText = driver.findElement(By.xpath("((//span[contains(@class,'vc-month-box-head')])[2]/../../..//div[text()='"+date+"'])[1]"));
		System.out.println(dateText.getText());
		
		dateText.click();
		Thread.sleep(6000);
		//driver.quit();
	}
}
