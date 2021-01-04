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
import screens.HomeScreen;
import screens.SignInPage;
import utilities.CommonUtils;

public class SplashScreenTest extends TestBase {

	AppIntroNextPage appIntroNextPage;
	AppIntroGetStarted appIntroGetStarted;
	TermConditionAccept termConditionAccept;
	HomeScreen homeScreen;
	SignInPage SignInPage;

	@BeforeTest
	public void init() {

		setUp();
		appIntroNextPage = new AppIntroNextPage(driver);
		appIntroGetStarted = new AppIntroGetStarted(driver);
		termConditionAccept = new TermConditionAccept(driver);
		homeScreen = new HomeScreen(driver);
	}

	@Test(priority = 1)

	public void validateSplashScreen1() {

		appIntroNextPage.clickOnNextButton();

	}

	@Test(priority = 2)

	public void validateSplashScreen2() {

		appIntroGetStarted.clickOnGetStartedButton();

	}

	@Test(priority = 3)

	public void validateSplashScreen3() throws InterruptedException {

		Thread.sleep(5000);
		termConditionAccept.termCondition_btnAccept();
	}


	@AfterTest
	public void quitDriver() {

		quit();
	}

}
