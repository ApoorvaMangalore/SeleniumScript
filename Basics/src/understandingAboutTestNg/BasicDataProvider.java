package understandingAboutTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider {

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
	public void dataDemo(String firstname, String lastname, String pwd, String confirmPwd, String email) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(pwd);
		System.out.println(confirmPwd);
		System.out.println(email);
	}
}
