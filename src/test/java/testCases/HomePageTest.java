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

public class HomePageTest extends TestBase {

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
		System.out.println("Calling splash screen 1..............");
	}

	@Test(priority = 2)

	public void validateSplashScreen2() {

		appIntroGetStarted.clickOnGetStartedButton();
		System.out.println("Calling splash screen 2..............");
	}

	@Test(priority = 3)

	public void validateSplashScreen3() throws InterruptedException {

		Thread.sleep(5000);
		termConditionAccept.termCondition_btnAccept();
		System.out.println("Calling splash screen 3..............");
	}

	@Test(priority = 4)
	public void VerifypageTitle() throws InterruptedException {

		System.out.println("waiting for Page title elements ");
		Thread.sleep(10000);
		// driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME,
		// TimeUnit.SECONDS);
		// System.out.println(driver.getPageSource());
		homeScreen.getHomeScreenPageTitle();
		System.out.println("Page title verified..............");
		

	}

	@Test(priority = 5)
	public void verifySignUpButton() throws InterruptedException {
		homeScreen.getSignUpButtonHomeScreen();
		System.out.println("Clicking on Sign up button from Homescreen..............");
	
	}

	@AfterTest
	public void quitDriver() {

		quit();
	}

}
