package com.qa.tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps=  new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3device");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		String androidAppUrl = System.getProperty("user.dir")+"/appium/src/test/resources/ApiDemos-debug.apk";
//		caps.setCapability(MobileCapabilityType.APP, "androidAppUrl");
		
		String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
//	String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
	caps.setCapability("app", androidAppUrl);
	URL url= new URL("http://0.0.0.0:4723");
	AppiumDriver driver= new AndroidDriver(url,caps);
	}

}



