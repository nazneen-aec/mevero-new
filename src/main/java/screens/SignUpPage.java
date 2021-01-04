package screens;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class SignUpPage extends ScreenBase {


	@AndroidFindBy(id = "com.wedoria.meverolearn:id/login_tvAlreadyHaveAccount")
	public WebElement signInLink;
	
	
	@AndroidFindBy(id="com.wedoria.meverolearn:id/toolbar_iv_menu")
	public WebElement navMenu;
	
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etEmailIdSignUp")
	public WebElement email;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etPasswordSignUp")
	public WebElement password;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_etConfirmPasswordSignUp")
	public WebElement confirmPassword;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_cbPrivacyPolicy")
	public WebElement checkBox;
	@AndroidFindBy(id="com.wedoria.meverolearn:id/login_tvRegister")
	public WebElement registerButton;


	public SignUpPage(AppiumDriver<MobileElement> driver) {
		super(driver);

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void ClickOnSignInLink() {

		signInLink.click();

	}
	
	public void sendEmailId(String randomUserEmail) {
		email.sendKeys(randomUserEmail);
				
	}

	public void sendPassword() {
		password.sendKeys("12345678");
				
	}
	
	public void sendConfirmPassword() {
		confirmPassword.sendKeys("12345678");
				
	}
	
	public void clickOnCheckBox() throws Exception {
		//checkBox.click();
		Thread.sleep(5000);
		//AndroidDriver driver = null;;
		
		//boolean p = checkBox.isSelected() ;
		//if(p = false) {
		//	p = true;
		//}
		//checkBox.getAttribute("checked");
		//checkBox.isEnabled();	
		//checkBox.isSelected();	
		//String a=checkBox.getAttribute("checked");
		//System.out.println("checked is" + a);
		//a="true";
		//System.out.println("checked is chnaged value" + a);
		//if(a=true)
		checkBox.getLocation();
		System.out.println(checkBox.getLocation());
		
		
		int x=checkBox.getLocation().getX();
		int y=checkBox.getLocation().getY();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(new PointOption().withCoordinates(45, 645));
		touchAction.release().perform();
		System.out.println("Checkbox State Pressed");
		Thread.sleep(500);
		//checkBox.click();
		//SignUpPage.touchUsingCoOrdinates(x, y, 0, 0, (AndroidDriver) driver); 
	}
	
	
     
	public void clickonSubmit() throws InterruptedException {
		registerButton.click();
		Thread.sleep(10000);
				
	}

	
	public String fetchEmailList(String randomUserEmail) {
		String verification_code = null;
		
		try {
			
			String url1 = "https://mailsac.com/api/addresses/"+ randomUserEmail + "/messages";
			
			HttpResponse<String> response = (HttpResponse<String>)  Unirest.get(url1)
					  .header("Mailsac-Key", "k_CaRNton4z702RqNpy237k50ztJvQS1hNgQwh")
					  .asString();
			
			String bodyForID = response.toString();
			JSONArray jsonArr = new JSONArray(bodyForID);
			JSONObject jsonObj = jsonArr.getJSONObject(0); // first json object in the array
			// find value of _id field; use json
			String msg_id = jsonObj.getString("_id"); 
			
			String url2 = "https://mailsac.com/api/text/"+ randomUserEmail +"/" + msg_id;
			HttpResponse<String> response2 = (HttpResponse<String>) 
					Unirest.get(url2)
					  .header("Mailsac-Key", "k_CaRNton4z702RqNpy237k50ztJvQS1hNgQwh")
					  .asString();
			
			verification_code =  response.toString().replace("Your verification code is ", "").replace(".", "");
			System.out.println("Verification Code is : " + verification_code);
			//return verification_code;
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return verification_code;
		
		
	}
	
}