package workingWithUnitTestingTool;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithInvocationCount {

	@Test(invocationCount = 1)
	public void run() {
		System.out.println("i am rum");
	}
	//Same test case multiple and parallel time
	//invocation= sequence
	//Thredpoolsixe= parallel//2
	@Test(invocationCount = 5,threadPoolSize = 5)
	public void openDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//Thread.sleep(2000);
		//driver.quit();
	}
}


