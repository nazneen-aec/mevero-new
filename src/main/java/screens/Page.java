package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Page {

	// Declare abstract methods
	
		public abstract String getPageTitle();
		
		public abstract String getPageHeader(By locators);
		
		public abstract WebElement getElement(By locators);
		
		public abstract void waitForElementPresent(By locators);
		
		public abstract void waitForPageTitle(String title);
		
}
