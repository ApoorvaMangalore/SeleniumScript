package workingWithDynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddParticularProdToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Picture of Comp')]/../../..//input[@value='Add to cart']"))
				.click();

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		WebElement amountofBook = driver.findElement(By.xpath("(//span[text()='10.00'])[2]"));
		System.out.println(amountofBook);
		Thread.sleep(3000);
		System.out.println(amountofBook.getText());

		Thread.sleep(3000);
		WebElement qty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		qty.clear();
		qty.sendKeys("0");
		Thread.sleep(3000);
		//driver.quit();

	}

}
