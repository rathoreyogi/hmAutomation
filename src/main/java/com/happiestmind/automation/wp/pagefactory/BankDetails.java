package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BankDetails {

	WebDriver driver;

	public BankDetails(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Bank Name* */

	@FindBy(how = How.NAME, using = "bankName")
	WebElement bankName;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[2]")
	WebElement bankNameOntario;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[3]")
	WebElement bankNameLaFederation;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[4]")
	WebElement bankNameAlberta;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div/select/option[9]")
	WebElement bankNameOthers;

	/* Institution number* */

	@FindBy(how = How.NAME, using = "institutionNumber")
	WebElement institutionNumber;

	/* Transit number* */

	@FindBy(how = How.NAME, using = "transitNumber")
	WebElement transitNumber;

	/* Account number* */

	@FindBy(how = How.NAME, using = "accountNumber")
	WebElement accountNumber;

	/* Continue Button On bank Details */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[8]/div/div[2]/input")
	WebElement continueButtonBankPage;
	
	/* Previous Button On bank Details */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[8]/div/div[1]/input")
	WebElement previousButtonBankPage;

	/****************************************** Methods *********************************************/
	/* Click Bank Name */
	public void clickBankName(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankName, driver, extentLogger, extent, step, className);
	}

	/* Select Bank Name as Others */
	public void selectBankNameOthers(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankNameOthers, driver, extentLogger, extent, step, className);
	}
	/*Enter Institution number*/
	public void enterInstitutionNumber(String institutionnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, institutionNumber, driver, extentLogger, extent, institutionnumber, className);
	}
	/*Enter Transit number*/
	public void enterTransitNumber(String transitnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, transitNumber, driver, extentLogger, extent, transitnumber, className);
	}
	/*Enter Account number*/
	public void enterAccountNumber(String accountnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, accountNumber, driver, extentLogger, extent, accountnumber, className);
	}
	/* Click On Continue Button On Bank Details */
	public void clickContinueButtonOnBD(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonBankPage, driver, extentLogger, extent, step, className);
	}
	

}
