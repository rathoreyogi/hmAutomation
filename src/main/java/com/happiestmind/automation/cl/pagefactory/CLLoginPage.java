package com.happiestmind.automation.cl.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.happiestmind.automation.util.MiscUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CLLoginPage {

	WebDriver driver;

	public CLLoginPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	@FindBy(how = How.NAME, using = "username")
	WebElement username;

	@FindBy(how = How.NAME, using = "pw")
	WebElement password;

	@FindBy(how = How.NAME, using = "Login")
	WebElement loginbutton;

	/* Need to remove */

	@FindBy(how = How.ID, using = "tsid-arrow")
	WebElement selectPackage;

	@FindBy(how = How.XPATH, using = "//*[@id='tsid-menuItems']/a[5]")
	WebElement cloPackage;

	@FindBy(how = How.XPATH, using = "//*[@id='01r46000000UNWH_Tab']/a")
	WebElement selectAppTab;

	@FindBy(how = How.NAME, using = "new")
	WebElement newApp;

	/* Need to remove */

	/* To enter username */
	public void enterUserName(String userid, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, username, driver, extentLogger, extent, userid, className);
	}

	/* To enter password */
	public void enterPassword(String passcode, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, password, driver, extentLogger, extent, passcode, className);
	}

	/* To click login button */
	public void clickLoginButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(loginbutton, driver, extentLogger, extent, step, className);
	}

	/* Login to salesforce "With valid credentials " */
	/*
	 * public void login(String userid, String passcode, ExtentTest
	 * extentLogger, ExtentReports extent, String step) throws Exception {
	 * MiscUtils.isElementPresent(username, driver, extentLogger, extent); //
	 * MiscUtils.pauseForElementToBePresent(5000L); username.sendKeys(userid);
	 * password.sendKeys(passcode); loginbutton.click();
	 * 
	 * }
	 */

	/* To create new application */

	public void selectPackageButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(selectPackage, driver, extentLogger, extent, step, className);
	}

	/*
	 * public void cLOPackageButton(ExtentTest extentLogger, ExtentReports
	 * extent, String step, String className) throws Exception {
	 * MiscUtils.isElementPresent(cloPackage, driver, extentLogger, extent);
	 * cloPackage.click(); }
	 * 
	 * public void selectAPPButton(ExtentTest extentLogger, ExtentReports
	 * extent, String step, String className) throws Exception {
	 * MiscUtils.isElementPresent(selectAppTab, driver, extentLogger, extent);
	 * selectAppTab.click(); }
	 * 
	 * public void newAppButton(ExtentTest extentLogger, ExtentReports extent,
	 * String step, String className) throws Exception {
	 * MiscUtils.isElementPresent(newApp, driver, extentLogger, extent);
	 * newApp.click();
	 * 
	 * }
	 */

}