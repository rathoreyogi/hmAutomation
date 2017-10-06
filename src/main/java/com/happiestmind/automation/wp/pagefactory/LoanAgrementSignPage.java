package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoanAgrementSignPage {

	WebDriver driver;

	public LoanAgrementSignPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/*
	 * Tick this box to confirm that you have read the Loan Agreement and that
	 * you are happy to proceed.
	 */
	@FindBy(how = How.NAME, using = "reviewTermOne")
	WebElement firstCheckBoxAgrement;

	/* Tick this box to sign-up to our newsletter. */
	@FindBy(how = How.NAME, using = "reviewTermTwo")
	WebElement secondCheckBoxAgrement;

	/* I Agree button on agreement page */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[2]/input")
	WebElement iAgreeButton;

	/* To cancel loan application on popup */
	@FindBy(how = How.XPATH, using = "//*[@id='iAgreePopup']/div/div/div[2]/div/div[3]/div[1]/input")
	WebElement cancelLoanApplicationButton;

	/* Yes, accept and continue on popup */
	@FindBy(how = How.XPATH, using = "//*[@id='iAgreePopup']/div/div/div[2]/div/div[3]/div[2]/input")
	WebElement acceptAndContinueButton;

	/* Give Feedback */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/input")
	WebElement giveFeedBackButton;

	/* Feedback cancel button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/input")
	WebElement feedbackCancelButton;

	/* Feedback Submit button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/input")
	WebElement feecbackSubmitButton;

	/* Go to DashBoaard Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[5]/input")
	WebElement goToDashboardButton;

	/* Check loan status on dashboard */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[3]/div/div[2]/div[2]/table/tbody/tr[1]/td")
	WebElement statusOnSPL;

	/****************************************** METHODS ******************************************/

	/* Click first Check Box Agreement */
	public void clickFirstCheckBoxAgrement(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstCheckBoxAgrement, driver, extentLogger, extent, step, className);
	}

	/* Click second Check Box Agreement */
	public void clickSecondCheckBoxAgrement(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(secondCheckBoxAgrement, driver, extentLogger, extent, step, className);
	}

	/* Click I Agree Button contract page */
	public void clickIAgreeButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(iAgreeButton, driver, extentLogger, extent, step, className);
	}

	/* Click cancel Loan Application Button */
	public void clickCancelLoanApplicationButton(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(cancelLoanApplicationButton, driver, extentLogger, extent, step, className);
	}

	/* Click Accept And Continue Button */
	public void clickAcceptAndContinueButton(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(acceptAndContinueButton, driver, extentLogger, extent, step, className);
	}

	/* Click on Give Feedback */
	public void clickGiveFeedBackButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(giveFeedBackButton, driver, extentLogger, extent, step, className);
	}
	/* Enter Values in feedback edit box */

	/* Click on cancel feedback Button */
	public void clickfeedbackCancelButton(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(feedbackCancelButton, driver, extentLogger, extent, step, className);
	}

	/* Click on submit feedback button */
	public void clickFeecbackSubmitButton(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(feecbackSubmitButton, driver, extentLogger, extent, step, className);
	}

	/* Click on Go To Dashboard Button */
	public void clickGoToDashboardButton(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(goToDashboardButton, driver, extentLogger, extent, step, className);
	}

	/* Check loan is available on dashboard */
	public void clickLoanStatus(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(statusOnSPL, driver, extentLogger, extent, step, className);
	}


}
