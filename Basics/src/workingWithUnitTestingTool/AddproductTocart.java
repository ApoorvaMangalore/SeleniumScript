package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddproductTocart extends BaseClass {

	@Test
	public void addProductTocart() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("User is able to click on books tab", true);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	}

	@Test
	public void clickOnAwsome() {
		driver.findElement(By.linkText("awesome")).click();
		Reporter.log("User is able to click on awesome", true);
		Reporter.log("hello",true);
	}

}
