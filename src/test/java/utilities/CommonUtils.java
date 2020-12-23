package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {
	
	private static AppiumDriver<MobileElement> driver;
	private static URL serverUrl;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static String APPIUM_PORT;
	public static int IMPLICIT_WAIT_TIME;
	private static int EXPLICIT_WAIT_TIME;
	private static String BASE_PKG;
	private static String APP_ACTIVITY;
	private static String APP_PATH;
	private static String BROWSER_NAME;
	private static String PLATFORM_NAME;
	private static String PLATFORM_VERSION;
	private static String DEVICE_NAME;
	private static String UDID;
	private static String BUNDLE_ID;
	private static String APP;
	private static Properties prop = new Properties();
	private static FileInputStream fis;

	public static void loadAndriodConfProp(String loadPropertyFile) {

		//File f=new File(src);
		
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+loadPropertyFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
		EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
		
		DEVICE_NAME = prop.getProperty("device.name");
		//APP_PATH = prop.getProperty("application.path");
		//BROWSER_NAME = prop.getProperty("base.pgk");
		//PLATFORM_NAME = prop.getProperty("platform.name");
		//PLATFORM_VERSION = prop.getProperty("platform.version");
		
		APPIUM_PORT = prop.getProperty("appium.server.port");
		BASE_PKG = prop.getProperty("base.pgk");
		APP_ACTIVITY = prop.getProperty("application.activity");
		
	}
	
	//setting android cap
	public static void setAndroidCapabilities() {
		
		//driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
		//capabilities.setCapability(MobileCapabilityType.PLATFORM, PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		
		
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PKG);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
		//capabilities.setCapability(MobileCapabilityType.APP, "C://Users//ce//eclipse-workspace//Mevero1//src//test//resources//properties//MEVERO_22FIx1_QA_02Dec2020_1535_v5.5.1.apk");
		//capabilities.setCapability("–session-override",true);
		//driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		//System.out.println(APP_PATH);
	}
	
	
	
	
	public static void loadIOSConfProp(String loadPropertyFile) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void setIOSCapabilities() {
		
		
		
	}
	
	
	public static AppiumDriver<MobileElement> getAndroidDriver() {
		
		try {
			serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(serverUrl,capabilities);
		return driver;
		
	}
	
	
	public static AppiumDriver<MobileElement> getIOSDriver() {
		
		
		return driver;
		
	}

}
