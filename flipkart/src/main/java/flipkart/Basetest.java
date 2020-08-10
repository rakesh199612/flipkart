package flipkart;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Basetest implements Cinstants{
	public static WebDriver driver;
	public void openBrowser(String browser) throws Throwable {
		Basetest bt=new Basetest();
		System.setProperty(bt.configValuse("browser_key"),bt.configValuse("browser_value"));
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
		driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("opera"))
		{
		driver=new OperaDriver();
		}
		driver.manage().window().maximize();
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
