package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnLinks extends BaseClass{
	
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("User is able to click on BooksLink",true);
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("User is able to click on ComputersLink",true);
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("User is able to click on ElectronicsLink",true);
		driver.findElement(By.partialLinkText("Apparel & Sho")).click();
		Reporter.log("User is able to click on Apparel & ShoesLink",true);
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		Reporter.log("User is able to click on Digital downloadsLink",true);
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Reporter.log("User is able to click on JewelryLink",true);
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Reporter.log("User is able to click on Gift CardsLink",true);
	}

}
