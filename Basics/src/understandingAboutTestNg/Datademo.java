package understandingAboutTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Datademo {
	@Test(dataProvider = "dataDemo")
	public void test(String place, String place1) {
		System.out.println(place );
		System.out.println(place1);
		
		
	}

	@DataProvider()
	public Object[][] dataDemo() {
		Object[][] data = new Object[5][2];
		data[0][0] = "Sirsi";
		data[0][1] = "Siddapur";
		
		data[1][0] = "Kumata";
		data[1][1] = "Karwar";
		
		data[2][0] = "Gokarna";
		data[2][1] = "Mundgod";
		
		data[3][0] = "Ankola";
		data[3][1] = "Sorba";
		
		data[4][0] = "Yallapur";
		data[4][1] = "Honnavar";

		return data;
	}

}
