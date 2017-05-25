package com.cucumberDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class AbstractPageObject {
	private static ChromeDriver chromedriver = null;
	private static FirefoxDriver firefoxdriver = null;
	private static String driverSelected=System.getProperty("driver", "chrome");
	public static WebDriver driver=getDriver();
	

	private static ChromeDriver getChromedriver() {
		chromedriver = new ChromeDriver();
		return chromedriver;
	}

	private static FirefoxDriver getFirefoxdriver() {
		firefoxdriver = new FirefoxDriver();
		return firefoxdriver;
	}

	private static RemoteWebDriver getDriver(){
		if(driverSelected.equalsIgnoreCase("chrome")){
			return getChromedriver();
		}else if(driverSelected.equalsIgnoreCase("firefox")){
			return getFirefoxdriver();
		}else{
			return getChromedriver();
		}
	}
}
