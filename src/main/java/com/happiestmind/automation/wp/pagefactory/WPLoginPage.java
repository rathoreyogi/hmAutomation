package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WPLoginPage {

	WebDriver driver;

	public WPLoginPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Login fields */

	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[6]/a")
	WebElement loginPagelink;

	@FindBy(how = How.NAME, using = "userName")
	WebElement usrName;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/form/div/div[1]/div[1]/div[6]/div/input")
	WebElement loginButton;

	/* Forgot Password Link */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/form/div/div/div[1]/div[5]/div/a")
	WebElement forgotPasswordLink;
	
	
	/********************METHODS**************************/
	/*Click*/
	public void loginPageButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(loginPagelink, driver, extentLogger, extent, step, className);
	}
	/*Enter*/
	public void enterUserName(String username, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, usrName, driver, extentLogger, extent, username, className);
	}
	/*Enter*/
	public void enterPassword(String passcode, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, password, driver, extentLogger, extent, passcode, className);
	}
	/*Click*/
	public void clickLoginButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(loginButton, driver, extentLogger, extent, step, className);
	}
	/*Click Forgot password*/
	public void clickForgotpasswordLink(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(forgotPasswordLink, driver, extentLogger, extent, step, className);
	}
	// Thread.sleep(5000);
	// MiscUtils.pauseForElementToBePresent(5000L);

}
