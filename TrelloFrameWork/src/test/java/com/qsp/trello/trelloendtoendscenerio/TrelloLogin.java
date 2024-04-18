package com.qsp.trello.trelloendtoendscenerio;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qsp.trello.genericutility.BaseClass;
import com.qsp.trello.genericutility.FileUtility;
import com.qsp.trello.pomrepo.TrelloHomePage;
import com.qsp.trello.pomrepo.TrelloLoginPage;


public class TrelloLogin extends BaseClass{
	@Test
	public void verifyUserIsAbleToLoginToTrelloApplication() throws IOException{
		TrelloHomePage homePage=new TrelloHomePage(driver);
		TrelloLoginPage loginPage= new TrelloLoginPage(driver);
		FileUtility fileUtils= new FileUtility();
		homePage.getLoginLink().click();
		loginPage.getUsernameTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("username"));
		loginPage.getContinueButton().submit();
		loginPage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		loginPage.getLoginButton().submit();
		
		
	}

}
