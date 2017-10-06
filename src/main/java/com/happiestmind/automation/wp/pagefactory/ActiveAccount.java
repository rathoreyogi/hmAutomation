package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ActiveAccount {
	
	WebDriver driver;

	public ActiveAccount(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Wrong phone number? Change it here link */
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[1]/p[2]/a[1]")
	WebElement changePhoneNumber;
	
	/* Phone Pin Resend Link */
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[1]/p[2]/a[2]")
	WebElement resendPhonePin;
	
	/* Phone Pin Number Field */
	
	@FindBy(how = How.NAME, using = "pinNumber")
	WebElement oTPNumber;
	
	/* UserName Field */
	
	@FindBy(how = How.NAME, using = "userName")
	WebElement userName;
	
	/* Create a password* */
	
	@FindBy(how = How.NAME, using = "password")
	WebElement createPassword;
	
	/* Reconfirm password* */
	
	@FindBy(how = How.NAME, using = "reconfirmPassword")
	WebElement reconfirmPassword;
	
	/* Continue Button On Active account Page */
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/input")
	WebElement continueButtonActiveAccount;
	
	/*************************************METHODS***************************************/
	
	/*Enter OTP Number*/
	public void enterOneTimePinNumber(String otppinnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, oTPNumber, driver, extentLogger, extent, otppinnumber, className);
	}
	/*Enter Create a password*/
	public void enterCreatePassword(String createpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, createPassword, driver, extentLogger, extent, createpassword, className);
	}
	/*Enter Reconfirm password*/
	public void enterReconfirmPassword(String reconfirmpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, reconfirmPassword, driver, extentLogger, extent, reconfirmpassword, className);
	}
	/*Click on continue button on Active your account page*/
	public void clickContinueButtonOnAYA(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonActiveAccount, driver, extentLogger, extent, step, className);
	}

}
