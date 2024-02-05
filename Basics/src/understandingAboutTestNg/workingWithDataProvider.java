package understandingAboutTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider {

	/*
	 * @Test(dataProvider = "data") public void openBrowser(String firstname, String
	 * lastname, String email, String password, String confirmPassword) {
	 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://demowebshop.tricentis.com/");
	 * driver.findElement(By.xpath("//a[text()='Register']")).click();
	 * driver.findElement(By.id("gender-female")).click();
	 * driver.findElement(By.id("FirstName")).sendKeys(firstname);
	 * driver.findElement(By.id("LastName")).sendKeys(lastname);
	 * driver.findElement(By.id("Email")).sendKeys(email);
	 * driver.findElement(By.id("Password")).sendKeys(password);
	 * driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
	 * driver.findElement(By.id("register-button")).click(); driver.quit();
	 * 
	 * }
	 */
	@Test(dataProvider = "data")
	public void openBrowser(String[] reg) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(reg[0]);
		driver.findElement(By.id("LastName")).sendKeys(reg[1]);
		driver.findElement(By.id("Email")).sendKeys(reg[2]);
		driver.findElement(By.id("Password")).sendKeys(reg[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(reg[4]);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}
	@DataProvider(name = "data")
	public Object[][] dataset() {
		return new Object[][] {

				{ "apoorva", "mangalore", "apoorvamangalore40@gmail.com", "123@#Aa", "123@#Aa" },
				{ "Abhaya", "mangalore", "abhayamangalore40@gmail.com", "123@#Aa1", "123@#Aa1" },
				{ "Mohini", "mangalore", "mohinimangalore40@gmail.com", "123@#Aa2", "123@#Aa2" },
				{ "chandrakant", "mangalore", "chandrakantmangalore40@gmail.com", "123@#Aa3", "123@#Aa3" }, };
	}
}
