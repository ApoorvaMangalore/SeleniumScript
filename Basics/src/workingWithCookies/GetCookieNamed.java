package workingWithCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieNamed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");

		Set<Cookie> cookies = driver.manage().getCookies();// capture all the cookies from the browser
		int sizeOfTheCookies = cookies.size();
		System.out.println("size of the cookies:" + sizeOfTheCookies); // To print the number of cookies
		
		Cookie cookieNamed = driver.manage().getCookieNamed("session-id-time");
		
		System.out.println(cookieNamed);
		/*
		 * for (Cookie cookie : cookies) { String valueOfCookie = cookie.getValue();
		 * String nameOfTheCookie = cookie.getName();
		 * 
		 * System.out.println(nameOfTheCookie + ":" + valueOfCookie); }
		 */
	
	}

}
