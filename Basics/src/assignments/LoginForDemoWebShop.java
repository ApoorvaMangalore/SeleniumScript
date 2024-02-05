package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Test case:validate that user is able to login with valid credientials.
public class LoginForDemoWebShop {// testcaseId Tc_0001_Login

	public static void main(String[] args) {// TestCasename
		String actualUrl = "https://demowebshop.tricentis.com/";
		String actualTitle = "Demo Web Shop";
		String actualemailID = "apoorvamangalore40@gmail.com";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step1:Open the browser
		System.out.println("Browser is maximized");

		// step2: Enter the Url
		driver.get("https://demowebshop.tricentis.com");// TestSteps
		System.out.println("User is able to open Demo webshop");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url of the page " + currentUrl);
		if (actualUrl.equalsIgnoreCase(currentUrl)) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}
		String title = driver.getTitle();

		if (actualTitle.equalsIgnoreCase(title)) {
			System.out.println("Title of the page is :" + title);
			System.out.println("Title of the Application is correct");
		} else {
			System.out.println("Title of the Application is not correct");
		}
		// Step3:Click on log in link
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("User is able to click on login link");

		// step4:Enter the valid data for the emial textbox
		WebElement emailTb = driver.findElement(By.id("Email"));
		emailTb.sendKeys("apoorvamangalore40@gmail.com");
		String emailId = emailTb.getAttribute("value");
		if (actualemailID.contentEquals(emailId)) {
			System.out.println("data giveen for email Id" + emailId);
		} else {
			System.out.println("email id is wrong");
		}
		// String valueEnterdForemail = emailTb.getAttribute("value");
		// System.out.println("Value entered is " + valueEnterdForemail);

		// step5:Enter the valid data for the password textbox
		WebElement passwordTb = driver.findElement(By.id("Password"));
		passwordTb.sendKeys("apoorva123");
		String valueEnterdForPassword = passwordTb.getAttribute("value");
		System.out.println("Value entered is " + valueEnterdForPassword);

		// Step6:Click on remember me checkbox
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean check = checkBox.isSelected();
		System.out.println(check);

		// Step7:Click on Login button(capture the url title)

		driver.quit();
		System.out.println("Demo web shop is closed");
	}

}
