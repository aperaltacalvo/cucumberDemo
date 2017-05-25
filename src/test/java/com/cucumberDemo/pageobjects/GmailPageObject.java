package com.cucumberDemo.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPageObject extends AbstractPageObject{

	private static final By usernameBox = By.id("identifierId");
	private static final By passwordBox = By.name("password");
	private static final By nextLoginButton = By.id("identifierNext");
	private static final By sendLoginButton = By.id("passwordNext");
	private static final By mailBoxHeader = By.cssSelector("div[role='banner']");
	private static final By mailBoxInput = By.className("aDP");
	private static final By mailBoxWriteNewMailButton = By.xpath("//*[@id=':ix']/div/div");

	private static WebDriverWait myDynamicElement = new WebDriverWait(driver, 10);

	public static void getPage(){
		
		driver.navigate().to("http://gmail.com");
		WebDriverWait myDynamicElement = new WebDriverWait(driver, 10);
	myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(By.id("headingText")));
	}

	public static void doLogin(String user, String password) {

		WebElement userBox=driver.findElement(usernameBox);
		userBox.sendKeys(user);
		WebElement nextButton = driver.findElement(nextLoginButton);
		nextButton.click();
		myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(passwordBox));
		WebElement pwdBox=driver.findElement(passwordBox);
		pwdBox.sendKeys(password);
		
		WebElement sendButton = driver.findElement(sendLoginButton);
		sendButton.click();
	}
	
	public static void checkMailboxHeaderIsVisible(){
		myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(mailBoxHeader));

		Assert.assertTrue(driver.findElement(mailBoxHeader).isDisplayed());
	}
	
	public static void checkMailboxInputIsVisible(){
		myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(mailBoxInput));

		Assert.assertTrue(driver.findElement(mailBoxInput).isDisplayed());
	}
	
	public static void checkMailboxWriteNewMailButtonIsVisible(){
		myDynamicElement.until(ExpectedConditions.presenceOfElementLocated(mailBoxWriteNewMailButton));

		Assert.assertTrue(driver.findElement(mailBoxWriteNewMailButton).isDisplayed());
	}
}
