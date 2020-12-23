package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.TestBase;
import screens.AppIntroGetStarted;
import screens.AppIntroNextPage;
import screens.TermConditionAccept;
import screens.UnorganiseFeed;
import screens.SignInPage;
import utilities.CommonUtils;

public class SignIn extends TestBase {

	AppIntroNextPage AppIntroNextPage;
	AppIntroGetStarted AppIntroGetStarted;
	TermConditionAccept TermConditionAccept;
	UnorganiseFeed UnorganiseFeedPage;
	SignInPage SignInPage;
	
	
	@BeforeTest
	public void init() {

		setUp();
		AppIntroNextPage = new AppIntroNextPage(driver);
		AppIntroGetStarted = new AppIntroGetStarted(driver);
		//TermConditionAccept = new TermConditionAccept(driver);
		
	}

	@Test(groups = "B", dependsOnGroups = "A")

	public void ValidaSignIn() throws InterruptedException {

		System.out.println("Hello");
		Thread.sleep(5000);
		AppIntroNextPage.clickOnNextButton();
		AppIntroGetStarted.clickOnGetStartedButton();
		
	}

	
	
		
	@AfterTest
	public void quitDriver() {

		quit();
	}

}
