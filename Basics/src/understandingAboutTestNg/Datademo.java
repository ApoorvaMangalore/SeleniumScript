package understandingAboutTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datademo {
	@Test(dataProvider = "dataDemo")
	public void test(String place, String place1) {
		System.out.println(place);
		System.out.println(place1);
	}

	@DataProvider()
	public Object[][] dataDemo() {
		Object[][] data = new Object[5][2];
		data[0][0] = "A";
		data[0][1] = "B";

		data[1][0] = "C";
		data[1][1] = "D";

		data[2][0] = "E";
		data[2][1] = "F";

		data[3][0] = "G";
		data[3][1] = "H";

		data[4][0] = "I";
		data[4][1] = "J";

		return data;
	}
}
