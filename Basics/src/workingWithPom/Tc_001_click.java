package workingWithPom;


import org.testng.annotations.Test;

public class Tc_001_click extends BaseClass  {
	
	
	
	@Test
	public void demo() {
		
		
		RegRepo r = new RegRepo(driver);
		r.getRegisterlink().click();
		r.getFirstNameTb().sendKeys("apoorva");
		r.getLastname().sendKeys("mangalore");
	

	}
}