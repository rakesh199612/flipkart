package flipkart;

import org.testng.annotations.Test;

public class Login extends Basetest{
	@Test
	public void login() throws Throwable
	{
		Basetest bt=new Basetest();
		bt.openBrowser();
		driver.get("");
	}
}
