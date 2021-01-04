package screens;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends ScreenBase {

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/login_etEmailIdSignIn")
	public WebElement emailId;

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/login_etPasswordSignIn")
	public WebElement password;

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/login_tvContinue")
	public WebElement continueButton;
	
	@AndroidFindBy(id = "com.wedoria.meverolearn:id/toolbar_iv_menu")
	public WebElement navmenu;
	
	
	@AndroidFindBy(id = "com.wedoria.meverolearn:id/navigationDrawer_tv_usrName")
	public WebElement userName;
	

	public SignInPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void getUserCredential() {

		emailId.sendKeys("testmevero11225@mailsac.com");
		password.sendKeys("12345678");
		continueButton.click();
	}

	public void clickOnNavMenu() {

		navmenu.click();
	}

	
	public void getUserName() {

		String fetchedUsername=userName.getText();
		
		System.out.println("Print fetched Item:"+fetchedUsername);
		
		String[] username = fetchedUsername.split("\\s+");
		
		System.out.println("Print User Name:"+username[1]);
		
		String actualValue="ritika";
		
		Assert.assertEquals(username[1], actualValue,"username verified");
	}
	
	

}