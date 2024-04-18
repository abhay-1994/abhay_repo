package com.qsp.trello.genericutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class JavaUtility {
	public String localDateAndTime() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
	
	
	/**
	 * This method will return the Robot class object
	 * @return
	 * @throws AWTException
	 */
	public Robot robotclass() throws AWTException {
		Robot robot = new Robot();
		return robot;
	}
	
		/**
		 * This method will press the Enter Key
		 * @param driver
		 */
		public void enterKeyPress() throws Throwable
		{
			robotclass().keyPress(KeyEvent.VK_ENTER);
		}
		
		/** 
		 * This method is used to Release the key
		 * @param driver
		 * @throws Throwable
		 */
		public void enterKeyRelease() throws Throwable
		{
			robotclass().keyRelease(KeyEvent.VK_ENTER);
		}
		

}
