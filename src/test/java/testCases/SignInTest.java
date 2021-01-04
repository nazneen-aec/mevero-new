package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseTest.TestBase;
import screens.AppIntroGetStarted;
import screens.AppIntroNextPage;
import screens.SignInPage;
import screens.SignUpPage;
import screens.TermConditionAccept;
import screens.HomeScreen;


public class SignInTest extends TestBase {

	AppIntroNextPage appIntroNextPage;
	AppIntroGetStarted appIntroGetStarted;
	TermConditionAccept termConditionAccept;
	HomeScreen homeScreen;
	SignInPage signInPage;
	SignUpPage signUpPage;
	@BeforeTest
	public void init() {

		setUp();
		appIntroNextPage = new AppIntroNextPage(driver);
		appIntroGetStarted = new AppIntroGetStarted(driver);
		termConditionAccept = new TermConditionAccept(driver);
		signInPage = new SignInPage(driver);
		signUpPage = new SignUpPage(driver);
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

	@Test(priority = 4)
	public void VerifypageTitle() throws InterruptedException {

		System.out.println("waiting for Page title elements ");
		Thread.sleep(10000);
		// driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME,
		// TimeUnit.SECONDS);
		// System.out.println(driver.getPageSource());
		homeScreen.getHomeScreenPageTitle();
		System.out.println("Page title verified");
		System.out.println("HomeScreen executed successfully..feed..feed..feed..feed...feed..feed..feed..feed..feed.");

	}

	@Test(priority = 5)
	public void verifySignUpButton() throws InterruptedException {
		homeScreen.getSignUpButtonHomeScreen();
	
	}

	
	@Test(priority = 6)
	public void ValidateSignInLink() throws InterruptedException
	{
		
		Thread.sleep(5000);
		signUpPage.ClickOnSignInLink();
	}
	
	@Test(priority = 7)
	public void ValidateUserCredential() throws InterruptedException
	{
		
		
		signInPage.getUserCredential();
		Thread.sleep(20000);
	}
	
					
	@AfterTest
	public void quitDriver() {

		quit();
		//driver.closeApp();
		//driver.launchApp();
	}

}
