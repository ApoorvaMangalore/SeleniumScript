package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsRadiobutton {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			List<WebElement> radioelements = driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("number of radio button present" + radioelements.size());
			for(int i=0;i<radioelements.size();i++) {
				radioelements.get(i).click();
				Thread.sleep(2000);
			}
			driver.close();
	}

}
