package flipkart;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Basetest{
	@Test
	public void login() throws Throwable
	{
		Basetest bt=new Basetest();
		bt.openBrowser("chrome");
		Assert.assertEquals(bt.getTitle(),bt.getConfigValue("homepage") );
		FlipFindby ffb=new FlipFindby(driver);
		ffb.loginPopup();
		Thread.sleep(5000);
		ffb.logout(driver);
	}
}
