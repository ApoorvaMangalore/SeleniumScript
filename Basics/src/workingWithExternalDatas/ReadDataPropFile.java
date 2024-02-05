package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataPropFile {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testData/data.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		String chromeValue = prop.getProperty("chromeValue");
		String chromeKey = prop.getProperty("chromeKey");

		System.setProperty(chromeKey, chromeValue);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
}