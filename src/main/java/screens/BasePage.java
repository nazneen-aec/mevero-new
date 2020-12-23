package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	WebDriver driver;
	WebDriverWait wait;
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 15);

	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locators) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement getElement(By locators) {
		// TODO Auto-generated method stub
		
		WebElement element=null;
		try {
		element=driver.findElement(locators);
		return element;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locators) {
		// TODO Auto-generated method stub

	}

	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub

	}

}
