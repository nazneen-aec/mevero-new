package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends ScreenBase {

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/navigationDrawer_tv_sign_in")
	public WebElement signInFromNav;

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/homeFeed_tvSignIn")
	public WebElement signInFromUnorganizeFeed;
	

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/navigationToolbar_ivBack")
	public WebElement backButton;
	
	

	public SignInPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void ClickOnSignIn_Navmenu() {

		signInFromNav.click();

	}

	public void ClickOnSignIn_UnorganizeFeed() {

		signInFromUnorganizeFeed.click();

	}
	public void ClickOnBackButton() {

		backButton.click();

	}
}