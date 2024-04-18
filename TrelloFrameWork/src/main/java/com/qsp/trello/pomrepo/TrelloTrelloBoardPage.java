package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloTrelloBoardPage {
	WebDriver driver;
	public TrelloTrelloBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='Trelloboard']")
	WebElement trelloBoardName;
	@FindBy(xpath = "//a[text()='Trelloboard']/..//span[@data-testid='OverflowMenuHorizontalIcon']")
	WebElement trelloBoardMenu;
	
	@FindBy(xpath = "//button[@title='Close board']")
	WebElement closeBoardOption;
	@FindBy(xpath = "//button[@title='Close']")
	WebElement closeOption;
	@FindBy(xpath = "//button[text()='Permanently delete board']")
	WebElement PermanentlyDeleteBoard;
	@FindBy(xpath = "//button[text()='Delete']")
	WebElement deleteOption;
	//getter method
	
	public WebElement getTrelloBoardName() {
		return trelloBoardName;
	}
	public WebElement getTrelloBoardmenu() {
		return trelloBoardMenu;
	}
	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}
	public WebElement getCloseOption() {
		return closeOption;
	}
	public WebElement getPermanentlyDeleteBoard() {
		return PermanentlyDeleteBoard;
	}

	
	public WebElement getDeleteOption() {
		return deleteOption;
	}
	

}
