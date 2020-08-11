package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipFindby {

	
	@FindBy(xpath="//button[.='✕']") private WebElement x;
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") private WebElement usernamePopup;
	@FindBy(xpath="//input[@class=\'_2zrpKA _3v41xv _1dBPDZ\']") private WebElement passwordPopup;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") private WebElement loginPopup;
	@FindBy(xpath="//a[@class='_3Ep39l']") private WebElement loginHome;
	@FindBy(xpath="//a[@class='_3ko_Ud']") private WebElement cartHome;
	@FindBy(xpath="//button[@class='_2AkmmA _2Z-ax5 _7UHT_c']") private WebElement cartLogin;
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") private WebElement usernameLogin;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']") private WebElement passwordLogin;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") private WebElement loginpage;
	@FindBy(xpath="//img[@class='_1e_EAo']") private WebElement flipLogo;
	@FindBy(xpath="//div[@class='_2aUbKa' and .='My Account']") private WebElement myAccount;
	@FindBy(xpath="//div[.='Logout']") private WebElement logout;
	public WebElement getX() {
		return x;
	}
	public WebElement getUsernamePopup() {
		return usernamePopup;
	}
	public WebElement getPasswordPopup() {
		return passwordPopup;
	}
	public WebElement getLoginPopup() {
		return loginPopup;
	}
	public WebElement getLoginHome() {
		return loginHome;
	}
	public WebElement getCartHome() {
		return cartHome;
	}
	public WebElement getCartLogin() {
		return cartLogin;
	}
	public WebElement getUsernameLogin() {
		return usernameLogin;
	}
	public WebElement getPasswordLogin() {
		return passwordLogin;
	}
	public WebElement getLoginpage() {
		return loginpage;
	}
	public WebElement getFlipLogo() {
		return flipLogo;
	}
	public WebElement getMyAccount() {
		return myAccount;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	public void loginPopup() throws Throwable
	{
		Basetest bt=new Basetest();
		usernamePopup.sendKeys(bt.getConfigValue("username"));
		passwordPopup.sendKeys(bt.getConfigValue("password"));
		loginPopup.click();
	}
	
	public void loginHome() throws Throwable
	{
		x.click();
		loginHome.click();
		Basetest bt=new Basetest();
		usernamePopup.sendKeys(bt.getConfigValue("username"));
		passwordPopup.sendKeys(bt.getConfigValue("password"));
		loginPopup.click();
	}
	
	public void loginCart() throws Throwable
	{
		Basetest bt=new Basetest();		
		cartLogin.click();
		Thread.sleep(5000);
		usernameLogin.sendKeys(bt.getConfigValue("username"));
		passwordLogin.sendKeys(bt.getConfigValue("password"));
		loginpage.click();
		flipLogo.click();
	}
	
	public  void logout(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(myAccount).perform();
		a.moveToElement(myAccount).moveToElement(logout).click().build().perform();
	}
	
	public FlipFindby(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
