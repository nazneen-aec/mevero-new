package screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UnorganiseFeed extends ScreenBase {

	@AndroidFindBy(id = "com.wedoria.meverolearn:id/homeFeed_tvHomeHeaderWithoutLogin")

	public WebElement UnorganiseFeedHeader;
	
	
	@AndroidFindBy(id="com.wedoria.meverolearn:id/toolbar_iv_menu")
	public WebElement navMenu;

	public UnorganiseFeed(AppiumDriver<MobileElement> driver) {
		super(driver);

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void getUnorganiseFeed() {

		UnorganiseFeedHeader.getText();
		System.out.println(UnorganiseFeedHeader.getText());

	}

	

	public void getNavigationMenu() {

		navMenu.click();

	}

}