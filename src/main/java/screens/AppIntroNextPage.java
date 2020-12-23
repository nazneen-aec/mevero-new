package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppIntroNextPage extends ScreenBase {

	@AndroidFindBy(id = "appIntro_tvNextPage")
	public WebElement nextButton;
	
	public AppIntroNextPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void clickOnNextButton()
	{
		for (int i=0;i<5;i++)
		{
			nextButton.click();
			
		}
		
		
	}
	
	
	
}


