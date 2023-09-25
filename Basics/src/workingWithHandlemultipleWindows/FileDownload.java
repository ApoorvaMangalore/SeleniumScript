package workingWithHandlemultipleWindows;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();//chrome options
		
		Map<String, Object> chromeprefsMap = new HashMap<String, Object>();//map to take th efile
		chromeprefsMap.put("profile.default_content_settings.popups", 0);// any download pop up  will not displayed. yes or no
		
		String downloadfilePath=System.getProperty("user.dir");// path of the file is store
		chromeprefsMap.put("download.default_directory", downloadfilePath);// folder or path
		options.setExperimentalOption("prefs", chromeprefsMap);
		
	    WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		
		driver.findElement(By.linkText("ZIP file")).click();
		Thread.sleep(5000);
		File file=new File(downloadfilePath+"/DownloadDemo-master.zip");
		
		
		if(file.exists()) {
			System.out.println("File is downloaded");
		}
		else {
			System.out.println("File is not downloaded");
		}
		
	}
}
