package MasterPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	WebDriver driver;
	
	public void login() throws IOException {
	

	
		Properties prop=new Properties();
	InputStream input= new FileInputStream("C:\\Users\\MANSI\\eclipse-workspace\\Exam\\src\\ConfigElements\\Details.properties");
		prop.load(input);
		driver.get(prop.getProperty("URL"));
	}

}
