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

public class A_UnorganiseFeedTest extends TestBase {

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
		TermConditionAccept = new TermConditionAccept(driver);
		UnorganiseFeedPage = new UnorganiseFeed(driver);
	}

	@Test(priority = 1, groups = "A")

	public void ValidateNextButton1() {

		AppIntroNextPage.clickOnNextButton();
		
	}

	@Test(priority = 2,groups = "A")

	public void ValidateGetStartedButton() {

		AppIntroGetStarted.clickOnGetStartedButton();
		
	}

	@Test(priority = 3,groups = "A")

	public void ValidateTermConditionButton() {

		TermConditionAccept.termCondition_btnAccept();
	}
	
	
	@Test(priority = 4,groups = "A")
	public void VerifypageTitle() throws InterruptedException
	{
		
		
		System.out.println("waiting for Page title elements ");
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		//System.out.println(driver.getPageSource());
		UnorganiseFeedPage.getUnorganiseFeed();
		System.out.println("Page title verified");
		System.out.println("unorganise feed executed successfully..feed..feed..feed..feed...feed..feed..feed..feed..feed.");
		
	}

		
	@AfterTest
	public void quitDriver() {
		
		quit();
	}

}
