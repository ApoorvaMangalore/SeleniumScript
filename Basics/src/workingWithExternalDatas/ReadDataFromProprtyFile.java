package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProprtyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/data.properties");
		Properties prop = new Properties();
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		String testUrl =  (String) prop.get("url");
		driver.get(testUrl);
		
		
		driver.findElement(By.name("userid")).sendKeys((String) prop.get("username"));
		driver.findElement(By.name("pswrd")).sendKeys((String) prop.get("password"));
		
	}
}
