package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TermConditionAccept extends ScreenBase {

	
	@AndroidFindBy(id = "termCondition_btnAccept")
	public WebElement termCondition_btnAccept;
	
	
@AndroidFindBy(id="com.wedoria.meverolearn:id/knowledgeFeed_drawer")
public WebElement navigationmenu;


	public TermConditionAccept(AppiumDriver<MobileElement> driver) {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

		
	
	public void termCondition_btnAccept()
	{
		termCondition_btnAccept.click();
		
	}
	

	
}


