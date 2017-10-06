package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ForgotPassword {
	
	WebDriver driver;

	public ForgotPassword(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Email field */
	@FindBy(how = How.NAME, using = "email")
	WebElement emailField;
	
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='forgotPwdPopup']/div/div/div[2]/div/form/div[5]/div/div/div[1]/input")
	WebElement cancelButton;
	
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='forgotPwdPopup']/div/div/div[2]/div/form/div[5]/div/div/div[2]/input")
	WebElement submitButton;
	
	/**/
	@FindBy(how = How.ID, using = "inboxfield")
	WebElement mailinatorInboxField;
	
	/**/
	@FindBy(how = How.XPATH, using = "/html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button")
	WebElement mailinatorInboxGoButton;
	
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='row_public_1500285998-200030796863-yogi_1498736770830']/div[2]/div[5]/div")
	WebElement mailinatorInboxForgotMail;
	
	/**/
	@FindBy(how = How.XPATH, using = "html/body/div/div[2]/div[1]/div/a")
	WebElement mailinatorInboxforgotLink;
	
	/* Email field */
	@FindBy(how = How.NAME, using = "newPassword")
	WebElement newPassword;
	
	/* Email field */
	@FindBy(how = How.NAME, using = "confirmNewpassword")
	WebElement confirmNewPassword;
	
	/* Email field */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/form/div/div/div[1]/div[5]/div/input")
	WebElement resetPasswordButton;
	
	/* Email field */
	@FindBy(how = How.XPATH, using = "//*[@id='resetPwdPopup']/div/div/div[2]/div[4]/div/input")
	WebElement submitButtonOnPopup;
	
	/**********************************************METHODS*******************************************/
	
	/*Enter email*/
	public void enterEmail(String emailfield, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, emailField, driver, extentLogger, extent, emailfield, className);
	}
	
	/*Click  on submit*/
	public void clickSubmitButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(submitButton, driver, extentLogger, extent, step, className);
	}	
	
	/*Enter email in mailinator*/
	public void enterEmailInMailinator(String mailinatorinboxField, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, mailinatorInboxField, driver, extentLogger, extent, mailinatorinboxField, className);
	}
	
	/*Click  on Go button on mailinator*/
	public void clickGoButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(mailinatorInboxGoButton, driver, extentLogger, extent, step, className);
	}
	
	/*Click  on forgot mail in mailinator*/
	public void clickForgotMail(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(mailinatorInboxForgotMail, driver, extentLogger, extent, step, className);
	}
	
	/*Click  on forgot link in mail of mailinator*/
	public void clickForgotLink(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(mailinatorInboxforgotLink, driver, extentLogger, extent, step, className);
	}
	
	/*Enter email*/
	public void enterNewPassword(String newpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, newPassword, driver, extentLogger, extent, newpassword, className);
	}
	
	/*Enter email*/
	public void enterConfirmNewPassword(String confirmnewPassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, confirmNewPassword, driver, extentLogger, extent, confirmnewPassword, className);
	}
	
	/*Click  on forgot link in mail of mailinator*/
	public void clickResetPasswordButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(resetPasswordButton, driver, extentLogger, extent, step, className);
	}
	
	/*Click  on forgot link in mail of mailinator*/
	public void clickSubmitPopupButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(submitButtonOnPopup, driver, extentLogger, extent, step, className);
	}


}
