package flipkart;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest implements Cinstants{
	public static WebDriver driver;
	public void openBrowser() throws Throwable {
		Basetest bt=new Basetest();
		System.setProperty(bt.configValuse("browser_key"),bt.configValuse("browser_value"));
		driver=new ChromeDriver();
	}
	public String configValuse(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(property_path);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
