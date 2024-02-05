package understandingAboutTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider1 {

	@DataProvider(name = "testdata")
	public String[][] getData() {
		String[][] data = new String[2][5];

		data[0][0] = "Apoorva";
		data[0][1] = "Mangalore";
		data[0][2] = "098abc";
		data[0][3] = "098abc";
		data[0][4] = "abc@123";

		data[1][0] = "Mangalore";
		data[1][1] = "Apoorva";
		data[1][2] = "asdffg";
		data[1][3] = "asdffg";
		data[1][4] = "xtz@123";
		return data;

	}

	@Test(dataProvider = "testdata")
	public void dataDemo(String[] registerdata) {
		System.out.println(registerdata[0]);
		System.out.println(registerdata[1]);
		System.out.println(registerdata[2]);
		System.out.println(registerdata[3]);
		System.out.println(registerdata[4]);
	}
}
