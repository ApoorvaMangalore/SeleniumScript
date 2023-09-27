package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleData {
	public static void main(String[] args) throws IOException   {
		
		FileInputStream fis =new FileInputStream("./testData/data.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.get(prop);
		
		Object key = prop.get("chromeKey");
		Object value = prop.get("chromeValue");
		System.out.println(key);
		System.out.println(value);
		
		System.setProperty(prop.getProperty("chromeKey"),prop.getProperty("chromeValue"));
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
}