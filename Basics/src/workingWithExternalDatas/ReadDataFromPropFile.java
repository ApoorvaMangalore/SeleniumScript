package workingWithExternalDatas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropFile {
	public static void main(String[] args) throws IOException {

		// create object for the FileInputSteram
		FileInputStream fis = new FileInputStream("./testData/data.properties");

		// Create object for prop file Properties
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.get("Place"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("Company"));
	}
}