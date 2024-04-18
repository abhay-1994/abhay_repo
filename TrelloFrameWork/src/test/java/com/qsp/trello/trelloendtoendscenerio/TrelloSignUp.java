package com.qsp.trello.trelloendtoendscenerio;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qsp.trello.genericutility.BaseClass;
import com.qsp.trello.genericutility.FileUtility;
import com.qsp.trello.pomrepo.TrelloHomePage;
import com.qsp.trello.pomrepo.TrelloSignUpPage;

public class TrelloSignUp extends BaseClass {
	
	
	@Test
	public void VerifyUserIsAbleToSignUpToTrelloApplication() throws IOException {
		TrelloHomePage homePage= new TrelloHomePage(driver);
		TrelloSignUpPage signUpPage= new TrelloSignUpPage(driver);
		FileUtility fileUtils= new FileUtility();
		homePage.getSignUpTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("username"));
		homePage.getSignUpLink().click();
		signUpPage.getSignUpButton().click();
		
		
		
		
		
	}

}
