package com.cucumberDemo.actions;



import com.cucumberDemo.pageobjects.AbstractPageObject;
import com.cucumberDemo.pageobjects.GmailPageObject;

public class AssertionActions extends AbstractPageObject{

		public static void checkIfMailBoxIsVisible(){
			GmailPageObject.checkMailboxHeaderIsVisible();
			GmailPageObject.checkMailboxInputIsVisible();
			//GmailPageObject.checkMailboxWriteNewMailButtonIsVisible();
		}
}
