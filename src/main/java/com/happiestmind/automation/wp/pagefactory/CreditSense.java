package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CreditSense {

	WebDriver driver;

	public CreditSense(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Bank Name Dropdown Button */

	@FindBy(how = How.XPATH, using = ".//*[@id='bankaccount-div']/div/button")
	WebElement bankNameDropDownButton;

	@FindBy(how = How.XPATH, using = "//*[@id='ui-id-63']") // *[@id="ui-id-63"]
	WebElement bankNameStandardDummy;

	@FindBy(how = How.ID, using = "bankaccount")
	WebElement bankNameEditBox;

	/* Select bank */
	@FindBy(how = How.XPATH, using = "//*[@id='bankaccountmob']/option[63]")
	WebElement selectDummybank;

	/* "New page" with catalog and password */

	/* Catalog */
	@FindBy(how = How.ID, using = "cs-bank-LOGIN")
	WebElement catalogDummyBank;

	/* Password */
	@FindBy(how = How.ID, using = "cs-bank-PASSWORD")
	WebElement passwordDummyBank;
	
	/*Test report data*/
	@FindBy(how = How.ID, using = "test-report-data")
	WebElement jSONData;

	/* Change bank button */
	@FindBy(how = How.ID, using = "//*[@id='BankCredentials']/div[4]/button[2]")
	WebElement changeBank;

	/* Submit Button */
	@FindBy(how = How.ID, using = "submitdetails")
	WebElement submitDummyBankButton;

	/* "New page" Terms & Conditions */

	/* Decline and Logout */
	@FindBy(how = How.XPATH, using = "//*[@id='accept-terms']/button[2]")
	WebElement declineAndLogout;

	/* I Agree Button */
	@FindBy(how = How.XPATH, using = "//*[@id='accept-terms']/button[1]")
	WebElement iAgreeButtonTC;

	/*************************************** METHODS ************************************/

	/* Click Bank Name Button */
	public void clickBankNameDropdown(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankNameDropDownButton, driver, extentLogger, extent, step, className);
	}

	/* Select Dummy Bank Name */
	public void SelectBankNameFromDropDown(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankNameStandardDummy, driver, extentLogger, extent, step, className);
	}

	public void enterBankName(String banknameEditBox, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, bankNameEditBox, driver, extentLogger, extent, banknameEditBox, className);
	}

	/* Select Bank Name */
	public void SelectBankNameDummyStandard(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(selectDummybank, driver, extentLogger, extent, step, className);
	}

	/* Enter Catalog */
	public void enterCatalog(String catalog, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, catalogDummyBank, driver, extentLogger, extent, catalog, className);
	}

	/* Enter Password */
	public void enterCatalogPassword(String catalogpassword, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, passwordDummyBank, driver, extentLogger, extent, catalogpassword, className);
	}
	
	/* Enter JSON */
	public void enterJSON(String jsONData, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, jSONData, driver, extentLogger, extent, jsONData, className);
	}


	/* Click Submit Details */
	public void clickSubmitDetails(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(submitDummyBankButton, driver, extentLogger, extent, step, className);
	}

	/* Click I Agree Button on terms and condition */
	public void clickIAgreeOnTremsAndCondition(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(iAgreeButtonTC, driver, extentLogger, extent, step, className);
	}
	// TODO: Need to update some more Methods
}
