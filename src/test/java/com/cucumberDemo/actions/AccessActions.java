package com.cucumberDemo.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessActions extends AbstractActions{

	public static void getPage(String url){
		
		driver.navigate().to(url);
		WebDriverWait myDynamicElement = new WebDriverWait(driver, 10);
	myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
	}
}
