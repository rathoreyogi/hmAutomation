package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ChangePassword {

	WebDriver driver;

	public ChangePassword(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* User Name */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[4]/div/a/span")
	WebElement userNameMenu;

	/* User Name */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[4]/div/ul/li[2]/a")
	WebElement changePasswordLink;
	
	/* Sign Out */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[4]/div/ul/li[3]/a")
	WebElement signOut;

	/* Old password */
	@FindBy(how = How.NAME, using = "oldPassword")
	WebElement oldPassword;

	/* New Password */
	@FindBy(how = How.NAME, using = "newPassword")
	WebElement newPassword;

	/* Confirm New password */
	@FindBy(how = How.NAME, using = "confirmNewpassword")
	WebElement confirmNewpassword;

	/* Submit button on Change password */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/form/div/div/div[1]/div[6]/div/input")
	WebElement submitOnChangePassword;
	
	/* Submit button on Change password */
	@FindBy(how = How.XPATH, using = "//*[@id='changePwdPopup']/div/div/div[2]/div[4]/div/input")
	WebElement submitOnPopUp;
	

	/************************************** METHODS ****************************************************/

	/* Click on User Name in menu */
	public void clickUserName(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(userNameMenu, driver, extentLogger, extent, step, className);
	}

	/* Click on change password under username */
	public void clickOnchangepassword(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(changePasswordLink, driver, extentLogger, extent, step, className);
	}

	/* Enter old password */
	public void enterOldPassword(String oldpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, oldPassword, driver, extentLogger, extent, oldpassword, className);
	}
	/* Enter new password */
	public void enterNewPassword(String newpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, newPassword, driver, extentLogger, extent, newpassword, className);
	}
	/* Enter confirm new password */
	public void enterConfirmNewpassword(String confirmnewpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, confirmNewpassword, driver, extentLogger, extent, confirmnewpassword, className);
	}
	/* Click on submit button on Change password */
	public void clicksubmitChangePasswordButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(submitOnChangePassword, driver, extentLogger, extent, step, className);
	}
	/* Click on submit on popup for Change password */
	public void clicksubmitButtonOnPopup(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(submitOnPopUp, driver, extentLogger, extent, step, className);
	}
	/* Click on sign out */
	public void clickSignOut(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(signOut, driver, extentLogger, extent, step, className);
	}

}
