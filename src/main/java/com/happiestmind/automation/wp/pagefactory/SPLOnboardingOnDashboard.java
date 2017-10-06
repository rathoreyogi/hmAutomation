package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SPLOnboardingOnDashboard {

	WebDriver driver;

	public SPLOnboardingOnDashboard(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* SPL loan button */
	@FindBy(how = How.ID, using = "singleLoanButton")
	WebElement singleLoanButton;

	/* Select Province */
	@FindBy(how = How.NAME, using = "province")
	WebElement selectProvince;

	/* Select option for Province */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/div[5]/div/div[2]/div[2]/div/div/div[1]/select/option[2]")
	WebElement optionProvince;

	/* Click to view License */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardPopUpPaydayLoans']/div/div/div[2]/div[5]/div[1]/a")
	WebElement viewLicense;

	/* Payday Loans Act, 2008 */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardPopUpPaydayLoans']/div/div/div[2]/div[4]/span[4]/a")
	WebElement paydayLoansClickHereLink;

	/* Agree Province */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardPopUpPaydayLoans']/div/div/div[2]/div[5]/div[2]/input")
	WebElement agreeProvince;

	/* start Your Application button for SPL */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/div[5]/div/div[2]/div[3]/div[7]/input")
	WebElement startYourApplication;

	/*** Review Info Page ***/
	/** Loan Details **/
	/* Edit Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[4]/div[1]/div[2]/input")
	WebElement editButtonForLoanDetails;

	/* Loan Amount */
	@FindBy(how = How.NAME, using = "loanAmount")
	WebElement loanAmount;

	/** Personal details **/
	/* Edit Button */
	@FindBy(how = How.ID, using = "editPersonalBtn")
	WebElement editButtonForPersonaldetails;

	/* Home Phone Number */
	@FindBy(how = How.NAME, using = "homePhoneNumber")
	WebElement homePhoneNumber;

	/** Address details **/
	/* Edit Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[1]/div[2]/input")
	WebElement editButtonForAddressdetails;

	/* Building Number */
	@FindBy(how = How.NAME, using = "buildingNumber")
	WebElement buildingNumber;

	/** Employment details **/
	/* Edit Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[1]/div[2]/input")
	WebElement editButtonForEmploymentdetails;

	/* Amount Of Last Pay */
	@FindBy(how = How.NAME, using = "amountOfLastPay")
	WebElement amountOfLastPay;

	/** Check Box for review term **/
	@FindBy(how = How.NAME, using = "reviewTermOne")
	WebElement reviewTermOne;

	/** Check Box for review term **/
	@FindBy(how = How.NAME, using = "reviewTermTwo")
	WebElement reviewTermTwo;

	/** Continue Button on Review info Page **/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[14]/input")
	WebElement continueButtonReviewInfo;
	
	
	

	/************************************* METHODS *****************************************************/
	
	/*Click*/
	public void clickSPLApplication(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(singleLoanButton, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickProvinceDropdown(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(selectProvince, driver, extentLogger, extent, step, className);
	}
	/*Select*/
	public void selectProvince(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(optionProvince, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickviewLicenseProvince(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(viewLicense, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickpaydayLoansClickHereLink(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(paydayLoansClickHereLink, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickAgreeProvince(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(agreeProvince, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickStartYourApplication(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(startYourApplication, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickReviewTermOne(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reviewTermOne, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickReviewTermTwo(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reviewTermTwo, driver, extentLogger, extent, step, className);
	}
	/*Click*/
	public void clickContinueButtonReviewInfo(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonReviewInfo, driver, extentLogger, extent, step, className);
	}
	
}
