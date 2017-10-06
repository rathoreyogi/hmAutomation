package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReviewInfoPage {

	WebDriver driver;

	public ReviewInfoPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/** Loan details **/
	
	/* Click on edit button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form[1]/div/div[1]/div[2]/input")
	WebElement editButtonForLoanDetails;
	
	/* loan amount */
	@FindBy(how = How.NAME, using = "loanAmount")
	WebElement loanAmount;
	
	/* Click on save button */
	@FindBy(how = How.ID, using = "savePersonalBtn")
	WebElement saveLoanDetailsBtn;
	
	/* Click on edit editPersonalBtn */
	@FindBy(how = How.ID, using = "editPersonalBtn")
	WebElement editPersonalBtn;
	
	/* phone Number */
	@FindBy(how = How.NAME, using = "phoneNumber")
	WebElement phoneNumber;
	
	/* Click on save PersonalBtn */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form[2]/div/div[3]/div/input")
	WebElement savePersonalBtn;

	/* Review Term One */
	@FindBy(how = How.NAME, using = "reviewTermOne")
	WebElement reviewTermOneCheckBox;

	/* Review Term Two */
	@FindBy(how = How.NAME, using = "reviewTermTwo")
	WebElement reviewTermTwoCheckBox;

	/* Privacy Policy link */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form[6]/div/div[1]/label/p[2]/a[2]")
	WebElement privacyPolicy;

	/* Consent To Disclosures link */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form[6]/div/div[1]/label/p[2]/a[3]")
	WebElement consentToDisclosures;

	/* Continue Button Review Page */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/div[8]/div/input")
	WebElement continueButoonOnReviewPage;

	/* Previous Button Review Page */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[14]/div/div[1]/input")
	WebElement previousButoonOnReviewPage;

	/********************************** METHODS *************************************************/

	/* Click on edit button for loan details */
	public void clickOnEditButtonLoanDetails(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(editButtonForLoanDetails, driver, extentLogger, extent, step, className);
	}
	
	/* Clear loanAmount */
	public void clearLoanAmount(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.clear(step, loanAmount, driver, extentLogger, extent, className);
	}
	
	/*Enter loan amount*/
	public void enterLoanAmount(String loanamount, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, loanAmount, driver, extentLogger, extent, loanamount, className);
	}
	
	/* Click on save Loan Details Btn */
	public void clickOnSaveLoanDetailsBtn(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(saveLoanDetailsBtn, driver, extentLogger, extent, step, className);
	}
	
	/* Click on edit button for personal details */
	public void clickOnEditPersonalBtn(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(editPersonalBtn, driver, extentLogger, extent, step, className);
	}
	
	/* Clear Phone number */
	public void clearPhoneNumber(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.clear(step, phoneNumber, driver, extentLogger, extent, className);
	}
	
	/*Enter phone number*/
	public void enterPhoneNumber(String mphonenumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, phoneNumber, driver, extentLogger, extent, mphonenumber, className);
	}
	
	/* Click on save personal Details Btn */
	public void clickOnSavePersonalBtn(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(savePersonalBtn, driver, extentLogger, extent, step, className);
	}
	
	/* Click review Term One CheckBox */
	public void clickOnFirstCheckBox(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reviewTermOneCheckBox, driver, extentLogger, extent, step, className);
	}

	/* Click review Term Two CheckBox */
	public void clickOnSecondCheckBox(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reviewTermTwoCheckBox, driver, extentLogger, extent, step, className);
	}

	/* Click Continue button On Review Info Page */
	public void clickContinueButtonRIF(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButoonOnReviewPage, driver, extentLogger, extent, step, className);
	}

}
