package flipkart;

import org.testng.annotations.Test;

public class Login extends Basetest{
	@Test
	public void login() throws Throwable
	{
		Basetest bt=new Basetest();
		bt.openBrowser("chrome");
		driver.get("https://www.flipkart.com/");
		FlipFindby ffb=new FlipFindby();
		ffb.loginPopup();
	}
}
