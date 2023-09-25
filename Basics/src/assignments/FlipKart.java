package assignments;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FlipKart {

	

	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static JavascriptExecutor js;
	public static Map<Integer,String> productDetails=new TreeMap<>();

	public static void main(String[] args) throws InterruptedException {
				//Step 1 = Open the Application And navigate to flipcart
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				explicitWait= new WebDriverWait (driver, 15);
			    driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				
				//Step 2: Search for 3 products and add to cart
				searchAndAddThe("Lipstick");
				searchAndAddThe("Lipliner");
				searchAndAddThe("Lipgloss");
				
				//Step3: Remove the product which has least value
				driver.findElement(By.linkText("Cart")).click();
				String lowestPrice="";
				List<WebElement> prices = driver.findElements(By.xpath("(//span[text()='₹'])[position() mod 2=0]"));
				for(int i=1;i<=prices.size();i++) {
					int price=Integer.parseInt(prices.get(i-1).getText().replaceAll("[^0-9]", ""));
					productDetails.put(price, "product"+i+"");
				}
				Set<Integer> costOfTheProduct = productDetails.keySet();
				for(int lowestcostProduct :costOfTheProduct ) {
					lowestPrice = productDetails.get(lowestcostProduct);
					break;
				}
				char index=lowestPrice.charAt(lowestPrice.length()-1);
				for(;;) {
					try {
						driver.findElement(By.xpath("(//div[text()='Remove'])["+index+"]")).click();
						//driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
						break;
					}
					catch(Exception e) {
						js=(JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,250);");
					}
				}
				driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
				
			}

	public static void searchAndAddThe(String product) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);
		explicitWait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("(//div[@style='height: 280px; width: 200px;'])[1]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@style='height: 280px; width: 200px;'])[1]")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for (String Window : allWindowId) {
			driver.switchTo().window(Window);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Place Order']")));
		driver.close();
		driver.switchTo().window(parentId);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.name("q")).sendKeys(Keys.DELETE);

	}
}

