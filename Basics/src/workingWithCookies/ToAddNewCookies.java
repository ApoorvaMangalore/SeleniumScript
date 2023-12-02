package workingWithCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddNewCookies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in");

		// add new cookies to the browser
		Cookie cobj = new Cookie("mycookie", "1234567890");
		driver.manage().addCookie(cobj);

		Set<Cookie> cookies = driver.manage().getCookies();// capture all the cookies from the browser
		int sizeOfTheCookies = cookies.size();
		System.out.println("size of the cookies:" + sizeOfTheCookies); // To print the number of cookies

		for (Cookie cookie : cookies) {
			String valueOfCookie = cookie.getValue();
			String nameOfTheCookie = cookie.getName();

			System.out.println(nameOfTheCookie + ":" + valueOfCookie);
		}

	}

}
