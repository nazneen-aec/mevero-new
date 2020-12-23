package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppIntroGetStarted extends ScreenBase {

	
	@AndroidFindBy(id = "appIntro_tvGetStarted")
	public WebElement GetStartedButton;
	@AndroidFindBy(id = "termCondition_btnAccept")
	public WebElement termCondition_btnAccept;

	public AppIntroGetStarted(AppiumDriver<MobileElement> driver) {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

		
	public void clickOnGetStartedButton()
	{
		GetStartedButton.click();
		
	}
	public void termCondition_btnAccept()
	{
		termCondition_btnAccept.click();
		
	}
	
	
}


