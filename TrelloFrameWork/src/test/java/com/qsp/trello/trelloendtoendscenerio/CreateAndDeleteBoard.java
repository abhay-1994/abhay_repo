package com.qsp.trello.trelloendtoendscenerio;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qsp.trello.genericutility.BaseClass;
import com.qsp.trello.genericutility.FileUtility;
import com.qsp.trello.pomrepo.TrelloBoardPage;
import com.qsp.trello.pomrepo.TrelloCreateBoardPage;
import com.qsp.trello.pomrepo.TrelloHomePage;
import com.qsp.trello.pomrepo.TrelloLoginPage;
import com.qsp.trello.pomrepo.TrelloTrelloBoardPage;

public class CreateAndDeleteBoard extends BaseClass{
	@Test
	public void verifyUserIsAbleToCreateAndDeleteTheBoard() throws IOException {
		TrelloHomePage homePage=new TrelloHomePage(driver);
		TrelloLoginPage loginPage= new TrelloLoginPage(driver);
		TrelloCreateBoardPage createPage=new TrelloCreateBoardPage(driver);
		TrelloBoardPage boardPage=new TrelloBoardPage(driver);
		TrelloTrelloBoardPage trelloBoardPage= new TrelloTrelloBoardPage(driver);
		FileUtility fileUtils= new FileUtility();
		Actions actions= new Actions(driver); 
		homePage.getLoginLink().click();
		loginPage.getUsernameTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("username"));
		loginPage.getContinueButton().submit();
		loginPage.getPasswordTextField().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
		loginPage.getLoginButton().submit();
		boardPage.getCreateOption().click();
		boardPage.getCreateBoard().click();
		createPage.getBoardTitle().sendKeys(fileUtils.readTheDataFromPropertyFile("boardname"));
		createPage.getCreateOption().click();
		actions.moveToElement(trelloBoardPage.getTrelloBoardName());
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(trelloBoardPage.getTrelloBoardmenu()));
		trelloBoardPage.getTrelloBoardmenu().click();
		trelloBoardPage.getCloseBoardOption().click();
		trelloBoardPage.getCloseOption().click();
		trelloBoardPage.getPermanentlyDeleteBoard().click();
	    trelloBoardPage.getDeleteOption().click();
		
		
		
	}

}
