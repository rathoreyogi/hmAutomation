package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class EmploymentDetails {

	WebDriver driver;

	public EmploymentDetails(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Source of Income field and dropdown values */

	@FindBy(how = How.NAME, using = "sourceOfIncome")
	WebElement sourceOfIncome;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[2]")
	WebElement sourceOfIncomeEmployed;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[3]")
	WebElement sourceOfIncomeSelfEmployed;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[4]")
	WebElement sourceOfIncomeRetiredPension;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[5]")
	WebElement sourceOfIncomeWorkersCompensation;

	/* Type of Employment */

	@FindBy(how = How.NAME, using = "typeOfEmployment")
	WebElement typeOfEmployment;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/select/option[2]")
	WebElement typeOfEmploymentFullTime;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/select/option[3]")
	WebElement typeOfEmploymentPartTime;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/select/option[4]")
	WebElement typeOfEmploymentContract;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/select/option[5]")
	WebElement typeOfEmploymentSeasonal;

	/* Employer Name */

	@FindBy(how = How.NAME, using = "employerName")
	WebElement employerName;

	/* Length of employment(year & month) */
	/* YEAR Dropdown */

	@FindBy(how = How.NAME, using = "lengthOfEmploymentInYear")
	WebElement lengthOfEmploymentInYear;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[2]")
	WebElement lengthOfEmploymentInYear0;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[3]")
	WebElement lengthOfEmploymentInYear1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[4]")
	WebElement lengthOfEmploymentInYear2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[5]")
	WebElement lengthOfEmploymentInYear3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[6]")
	WebElement lengthOfEmploymentInYear4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[7]")
	WebElement lengthOfEmploymentInYear5;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[8]")
	WebElement lengthOfEmploymentInYear6;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[9]")
	WebElement lengthOfEmploymentInYear7;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[10]")
	WebElement lengthOfEmploymentInYear8;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[11]")
	WebElement lengthOfEmploymentInYear9;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[12]")
	WebElement lengthOfEmploymentInYear10;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[2]/select/option[13]")
	WebElement lengthOfEmploymentInYear10Plus;

	/* MONTH Dropdown */

	@FindBy(how = How.NAME, using = "lengthOfEmploymentInMonths")
	WebElement lengthOfEmploymentInMonths;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[2]")
	WebElement lengthOfEmploymentInMonths0;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[3]")
	WebElement lengthOfEmploymentInMonths1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[4]")
	WebElement lengthOfEmploymentInMonths2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[5]")
	WebElement lengthOfEmploymentInMonths3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[6]")
	WebElement lengthOfEmploymentInMonths4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[7]")
	WebElement lengthOfEmploymentInMonths5;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[8]")
	WebElement lengthOfEmploymentInMonths6;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[9]")
	WebElement lengthOfEmploymentInMonths7;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[10]")
	WebElement lengthOfEmploymentInMonths8;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[11]")
	WebElement lengthOfEmploymentInMonths9;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[12]")
	WebElement lengthOfEmploymentInMonths10;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[2]/div[3]/select/option[13]")
	WebElement lengthOfEmploymentInMonths11;

	/* How is your salary paid?* */

	@FindBy(how = How.NAME, using = "howIsSalaryPaid")
	WebElement howIsSalaryPaid;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[2]")
	WebElement howIsSalaryPaidDirectDeposit;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[3]")
	WebElement howIsSalaryPaidCheque;

	/* How often do you get paid?* */

	@FindBy(how = How.NAME, using = "frequencyOfSalaryPaid")
	WebElement howOftenSalaryPaid;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/select/option[2]")
	WebElement howOftenSalaryPaidMonthly;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/select/option[3]")
	WebElement howOftenSalaryPaidSemiMonthly;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/select/option[4]")
	WebElement howOftenSalaryPaidSemiWeekly;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/select/option[5]")
	WebElement howOftenSalaryPaidWeekly;

	/* Next pay date* */

	@FindBy(how = How.NAME, using = "nextPayDate")
	WebElement nextPayDate;

	/* Amount of last net pay(including tips if applicable)* */

	@FindBy(how = How.NAME, using = "amountOfLastPay")
	WebElement amountOfLastNetPay;

	/* Is a portion of your salary paid in cash (e.g. tips)?* */

	@FindBy(how = How.NAME, using = "paidByCash")
	WebElement portionSalaryPaidByCash;

	@FindBy(how = How.XPATH, using = "//*[@id='paidByCash']/option[2]")
	WebElement portionSalaryPaidByCashYes;

	@FindBy(how = How.XPATH, using = "//*[@id='paidByCash']/option[3]")
	WebElement portionSalaryPaidByCashNo;

	/* How much of your net pay is paid in cash?* */

	@FindBy(how = How.NAME, using = "netPayInCash")
	WebElement netPayInCash;
	
	/* Continue Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div/div[2]/input")
	WebElement continueButtonOnED;
	
	/* Previous Button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div/div[1]/input")
	WebElement previousButtonOnED;

	/*********************************** METHODS ***************************************/

	/* Click Source of income */
	public void clickSourceOfIncome(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(sourceOfIncome, driver, extentLogger, extent, step, className);
	}

	/* Select Source of income as Employed */
	public void selectSourceOfIncomeEmployed(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(sourceOfIncomeEmployed, driver, extentLogger, extent, step, className);
	}
	/* Select Source of income as SelfEmployed */
	public void selectsourceOfIncomeSelfEmployed(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(sourceOfIncomeSelfEmployed, driver, extentLogger, extent, step, className);
	}	
	/* Select Source of income as Retired Pension */
	public void selectsourceOfIncomeRetiredPension(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(sourceOfIncomeRetiredPension, driver, extentLogger, extent, step, className);
	}
	/* Select Source of income as Workers Compensation */
	public void selectsourceOfIncomeWorkersCompensation(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(sourceOfIncomeWorkersCompensation, driver, extentLogger, extent, step, className);
	}

	/* CLick Type of employment */
	public void clickTypeOfEmployment(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(typeOfEmployment, driver, extentLogger, extent, step, className);
	}

	/* Select Type of employment Full time */
	public void selectTypeOfEmploymentFullTime(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(typeOfEmploymentFullTime, driver, extentLogger, extent, step, className);
	}
	/* Select Type of employment Part time */
	public void selectTypeOfEmploymentPartTime(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(typeOfEmploymentPartTime, driver, extentLogger, extent, step, className);
	}
	/* Select Type of employment Employment Contract */
	public void selectTypeOfEmploymentContract(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(typeOfEmploymentContract, driver, extentLogger, extent, step, className);
	}
	/* Select Type of employment Employment Seasonal */
	public void selectTypeOfEmploymentSeasonal(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(typeOfEmploymentSeasonal, driver, extentLogger, extent, step, className);
	}

	/* Enter Employer name */
	public void enterEmployerName(String employername, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, employerName, driver, extentLogger, extent, employername, className);
	}

	/* Click Length of employment YEAR */
	public void clickLengthOfEmploymentYears(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(lengthOfEmploymentInYear, driver, extentLogger, extent, step, className);
	}

	/* Select Year for Length of employment */
	public void selectLengthOfEmploymentYaers5(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(lengthOfEmploymentInYear5, driver, extentLogger, extent, step, className);
	}

	/* Click Length of employment MONTHs */
	public void clickLengthOfEmploymentMonths(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(lengthOfEmploymentInMonths, driver, extentLogger, extent, step, className);
	}

	/* Select MONTHS for Length of employment */
	public void selectLengthOfEmploymentMonths4(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(lengthOfEmploymentInMonths4, driver, extentLogger, extent, step, className);
	}

	/* Click How is your salary paid */
	public void clickHowSalaryPaid(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howIsSalaryPaid, driver, extentLogger, extent, step, className);
	}

	/* Select How is your salary paid Direct Deposit */
	public void selectHowSalaryPaidDirectDeposit(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(howIsSalaryPaidDirectDeposit, driver, extentLogger, extent, step, className);
	}
	
	/* Select How is your salary paid Cheque */
	public void selectHowIsSalaryPaidCheque(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(howIsSalaryPaidCheque, driver, extentLogger, extent, step, className);
	}

	/* Click How often do you get paid */
	public void clickHowOftenPaid(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howOftenSalaryPaid, driver, extentLogger, extent, step, className);
	}

	/* Select How often do you get paid Monthly */
	public void selectHowOftenPaidMonthly(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howOftenSalaryPaidMonthly, driver, extentLogger, extent, step, className);
	}
	/* Select How often do you get paid SemiMonthly */
	public void selectHowOftenSalaryPaidSemiMonthly(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howOftenSalaryPaidSemiMonthly, driver, extentLogger, extent, step, className);
	}
	/* Select How often do you get paid SemiWeekly */
	public void selectHowOftenSalaryPaidSemiWeekly(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howOftenSalaryPaidSemiWeekly, driver, extentLogger, extent, step, className);
	}
	/* Select How often do you get paid Weekly */
	public void selectHowOftenSalaryPaidWeekly(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howOftenSalaryPaidWeekly, driver, extentLogger, extent, step, className);
	}

	/* Enter Next pay date */
	public void enterNextPayDate(String nextpaydate, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, nextPayDate, driver, extentLogger, extent, nextpaydate, className);
	}

	/* Enter Amount of last net pay(including tips if applicable) */
	public void enterAmmountLastPay(String amountoflastnetpay, ExtentTest extentLogger, ExtentReports extent,
			String step, String className) throws Exception {
		CustomWebElement.sendKeys(step, amountOfLastNetPay, driver, extentLogger, extent, amountoflastnetpay,
				className);
	}

	/* Click portion of your salary paid in cash */
	public void clickPortionSalaryPaidByCash(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(portionSalaryPaidByCash, driver, extentLogger, extent, step, className);
	}

	/* Select portion of your salary paid in cash Yes */
	public void selectPortionSalaryPaidByCashYes(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(portionSalaryPaidByCashYes, driver, extentLogger, extent, step, className);
	}
	/* Select portion of your salary paid in cash No */
	public void selectPortionSalaryPaidByCashNo(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(portionSalaryPaidByCashNo, driver, extentLogger, extent, step, className);
	}

	/* Enter How much of your net pay is paid in cash */
	public void enterHowMuchPaidInCash(String howmuchpaidcash, ExtentTest extentLogger, ExtentReports extent,
			String step, String className) throws Exception {
		CustomWebElement.sendKeys(step, netPayInCash, driver, extentLogger, extent, howmuchpaidcash, className);
	}

	/* Click On Continue Button On employment details */
	public void clickContinueButtonOnEMDT(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonOnED, driver, extentLogger, extent, step, className);
	}
}
