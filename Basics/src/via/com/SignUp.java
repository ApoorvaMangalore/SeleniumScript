package via.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);

		System.out.println("Empty browser has launched");

		driver.manage().window().maximize();
		System.out.println("Browser has maximized");

		// To luanch the via.com
		driver.get("https://in.via.com");
		System.out.println("Application has launched");
		Thread.sleep(2000);

		// To remove the popUp
		// driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		// System.out.println("User is able to click on pop-up");

		// To click on SignIn button
		WebElement signIn = driver.findElement(By.xpath("//div[contains(text(),'Sign In')]"));
		signIn.click();
		System.out.println("User is able to click on Sign-In Button");

		// To click on signUp button
		driver.findElement(By.xpath("//span[contains(text(),'SIGN UP')]")).click();
		System.out.println("User is able to click on Sign-Up Button");

		// To Enter email_Id
		WebElement emailId = driver.findElement(By.id("emailIdSignUp"));
		emailId.sendKeys("apoorvamangalore30@gmail.com");
		String dataForEmailId = emailId.getAttribute("value");// Value
		System.out.println(dataForEmailId + " : " + "data enter for email text box");

		// To Enter Name
		WebElement nameTextBox = driver.findElement(By.id("nameSignUp"));
		nameTextBox.sendKeys("Apoorva");
		String dataForName = nameTextBox.getAttribute("value");
		System.out.println(dataForName + " : " + "data enter for name text box");

		WebElement passwordTextBox = driver.findElement(By.id("passwordSignUp"));
		passwordTextBox.sendKeys("apoorva123@A");
		String dataforPassword = passwordTextBox.getAttribute("value");
		System.out.println(dataforPassword + " : " + "data enter forpassword text box");

		WebElement mobilenumTextBox = driver.findElement(By.id("mobileNoSignUp"));
		mobilenumTextBox.sendKeys("7259679520");
		String dataforMobileNum = mobilenumTextBox.getAttribute("value");
		System.out.println(dataforMobileNum + " : " + "data enter mobileNum text box");

		driver.quit();

	}

}
