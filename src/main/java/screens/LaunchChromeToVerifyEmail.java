package screens;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class LaunchChromeToVerifyEmail extends ScreenBase {


	@AndroidFindBy(id = "com.wedoria.meverolearn:id/login_tvAlreadyHaveAccount")
	public WebElement signInLink;
	
	
	@AndroidFindBy(id="com.wedoria.meverolearn:id/toolbar_iv_menu")
	public WebElement navMenu;
	
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etEmailIdSignUp")
	public WebElement email;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etPasswordSignUp")
	public WebElement password;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etConfirmPasswordSignUp")
	public WebElement confirmPassword;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_cbPrivacyPolicy")
	public WebElement checkBox;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_tvRegister")
	public WebElement registerButton;


	public LaunchChromeToVerifyEmail(AppiumDriver<MobileElement> driver) {
		super(driver);

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void launchChromeBrowser() {

		ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

	}
	
	

	
}