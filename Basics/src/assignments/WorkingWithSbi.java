package assignments;

import java.awt.Dimension;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSbi {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String childwindow = "State Bank of India";

		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Username')]")).click();

		Set<String> allWindow = driver.getWindowHandles();
		for (String wimdow : allWindow) {

			driver.switchTo().window(wimdow);
			Dimension dimension=new Dimension(100,100);
			//dimension.height
			String allTitle = driver.getTitle();
			System.out.println(allTitle);
			if (allTitle.equalsIgnoreCase(childwindow)) {
				driver.findElement(By.xpath("//div[@class='common_btn text-center']")).click();
			}
		}
		driver.findElement(By.id("go")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		driver.findElement(By.id("userName")).sendKeys("apoorva");

		driver.findElement(By.id("accountNo")).sendKeys("12112112112");
		driver.findElement(By.id("go")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();

		WebElement countryDropDown = driver.findElement(By.name("countryCode"));
		Select select = new Select(countryDropDown);
		select.selectByValue("91");
		driver.findElement(By.id("go")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
		
		driver.findElement(By.id("mobileNo")).sendKeys("7259679520");
		driver.findElement(By.id("go")).click();
		Alert alert4= driver.switchTo().alert();
		System.out.println(alert4.getText());
		alert4.accept();
		
		driver.findElement(By.name("dob")).sendKeys("30/06/1998");
		driver.findElement(By.id("go")).click();
		Alert alert5= driver.switchTo().alert();
		System.out.println(alert4.getText());
		alert5.accept();
		driver.quit();

	}
}
