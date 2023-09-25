package workingWithelementRepo;

import org.testng.annotations.Test;

public class ClickOnLinks extends BaseClass {

	@Test
	public void clickOnLinks() {
		HomePage hp=new HomePage(driver);
		hp.getNewsletterEmail().sendKeys("apoorvamangalore40@gmail.com");
		BasePage bp=new BasePage(driver);
		bp.getBooksLink().click();
		bp.getComputersLink().click();
		bp.getElectonicsLink().click();
		bp.getApparelShoes().click();
	}
	
}
