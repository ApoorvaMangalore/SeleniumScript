package assignments;



import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToResizetheWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		
		Point poistionOftheBrowser=new Point(100,50);
		driver.manage().window().setPosition(poistionOftheBrowser);
		
		
		//Dimension tomove=new Dimension(100,50);
		//driver.manage().window().setSize(tomove);
	}
}
