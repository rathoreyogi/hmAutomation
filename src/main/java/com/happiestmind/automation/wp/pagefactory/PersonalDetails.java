package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class PersonalDetails {

	WebDriver driver;

	public PersonalDetails(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Title and dropdown values */
	@FindBy(how = How.NAME, using = "title")
	WebElement title;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[2]")
	WebElement titleMr;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[3]")
	WebElement titleMrs;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[4]")
	WebElement titleMs;

	/* First name */

	@FindBy(how = How.NAME, using = "firstName")
	WebElement firstName;

	/* Last name */

	@FindBy(how = How.NAME, using = "lastName")
	WebElement lastName;

	/* Date of Birth */

	@FindBy(how = How.NAME, using = "dob")
	WebElement dateOfBirth;

	/* SIN */

	@FindBy(how = How.NAME, using = "sin")
	WebElement sIN;

	/* MaritalStatus and dropdown values */

	@FindBy(how = How.NAME, using = "maritalStatus")
	WebElement maritalStatus;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[3]/select/option[2]")
	WebElement maritalStatusSingle;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[3]/select/option[3]")
	WebElement maritalStatusMarried;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[3]/select/option[4]")
	WebElement maritalStatusDivorced;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[4]/div[3]/select/option[5]")
	WebElement maritalStatusWidowed;

	/* Number Of Dependents and dropdown values */

	@FindBy(how = How.NAME, using = "numberOfDependents")
	WebElement numberOfDependents;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[2]")
	WebElement numberOfDependents0;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[3]")
	WebElement numberOfDependents1;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[4]")
	WebElement numberOfDependents2;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[1]/select/option[5]")
	WebElement numberOfDependents3;

	/* Phone Number */

	@FindBy(how = How.XPATH, using = ".//*[@id='phoneNumberId']")
	WebElement mobilePhoneNumber;

	/* Home Phoone Number */

	@FindBy(how = How.XPATH, using = ".//*[@id='homePhoneNumberId']")
	WebElement homePhoneNumber;

	/* Email */

	@FindBy(how = How.NAME, using = "email")
	WebElement email;

	/* ReEmail */

	@FindBy(how = How.NAME, using = "reEmail")
	WebElement reEmail;

	/* Reason for loan and dropdown list */

	@FindBy(how = How.NAME, using = "reasonForLoan")
	WebElement reasonForLoan;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[2]")
	WebElement reasonForLoan1;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[3]")
	WebElement reasonForLoan2;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[4]")
	WebElement reasonForLoan3;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[5]")
	WebElement reasonForLoan4;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[6]")
	WebElement reasonForLoan5;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[7]")
	WebElement reasonForLoan6;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[8]")
	WebElement reasonForLoan7;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div[3]/select/option[9]")
	WebElement reasonForLoan8;

	/* Highest level of education and dropdown list */

	@FindBy(how = How.NAME, using = "education")
	WebElement highestLevelEducation;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[2]")
	WebElement highestLevelEducation1;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[3]")
	WebElement highestLevelEducation2;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[4]")
	WebElement highestLevelEducation3;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[5]")
	WebElement highestLevelEducation4;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[6]")
	WebElement highestLevelEducation5;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[7]")
	WebElement highestLevelEducation6;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[8]")
	WebElement highestLevelEducation7;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[1]/select/option[9]")
	WebElement highestLevelEducation8;

	/* Have you failed to repay any loans in the past? and dropdown list */

	@FindBy(how = How.NAME, using = "failedToPayLoans")
	WebElement failedToPayLoans;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[2]/select/option[2]")
	WebElement failedToPayLoans1;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[2]/select/option[3]")
	WebElement failedToPayLoans2;

	/* How did you hear about us? and dropdown list */

	@FindBy(how = How.NAME, using = "knownBy")
	WebElement howDoYouHearAboutUs;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[2]")
	WebElement howDoYouHearAboutUs1;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[3]")
	WebElement howDoYouHearAboutUs2;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[4]")
	WebElement howDoYouHearAboutUs3;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[5]")
	WebElement howDoYouHearAboutUs4;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[6]")
	WebElement howDoYouHearAboutUs5;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[7]")
	WebElement howDoYouHearAboutUs6;

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[3]/select/option[8]")
	WebElement howDoYouHearAboutUs7;

	/* Continue button Personal Details */

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[8]/div/div[2]/input")
	WebElement continueButtonPersonalDetails;

	/* Previous button Personal Details */

	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[8]/div/div[1]/input")
	WebElement previousButtonPersonalDetails;

	/**************************************** Methods *********************************************/

	/* Click Title */
	public void clickOnTitle(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(title, driver, extentLogger, extent, step, className);
	}

	/* Select Title */
	public void selectTitleMr(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(titleMr, driver, extentLogger, extent, step, className);
	}

	/* Enter FirstName */
	public void enterFirstName(String firstname, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, firstName, driver, extentLogger, extent, firstname, className);
	}

	/* Enter LastName */
	public void enterLastName(String lastname, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, lastName, driver, extentLogger, extent, lastname, className);
	}

	/* Enter Date Of Birth */
	public void enterDOBOnPD(String dob, ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.sendKeys(step, dateOfBirth, driver, extentLogger, extent, dob, className);
	}

	/* Enter SIN Number */
	public void enterSinNumber(String sin, ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.sendKeys(step, sIN, driver, extentLogger, extent, sin, className);
	}

	/* Click on Marital status* */
	public void clickOnMaritalstatus(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(maritalStatus, driver, extentLogger, extent, step, className);
	}

	/* Select Marital status Widowed */
	public void selectMaritalstatusWidowed(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(maritalStatusWidowed, driver, extentLogger, extent, step, className);
	}

	/* Click on Number of dependents */
	public void clickOnNumberOfDependents(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(numberOfDependents, driver, extentLogger, extent, step, className);
	}

	/* Select Number of dependents 3 */
	public void selectNumberOfDependents3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(numberOfDependents3, driver, extentLogger, extent, step, className);
	}

	/* Enter Mobile Phone Number */
	public void enterMobileNumber(String mobilenumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, mobilePhoneNumber, driver, extentLogger, extent, mobilenumber, className);
	}

	/* Enter Home phone Number */
	public void enterHomeNumber(String numberhomephone, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, homePhoneNumber, driver, extentLogger, extent, numberhomephone, className);
	}

	/* Enter Email */
	public void enterEmail(String enteremail, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, email, driver, extentLogger, extent, enteremail, className);
	}

	/* Enter re-Confirm Email */
	public void enterreConfirmEmail(String enterconfirmemail, ExtentTest extentLogger, ExtentReports extent,
			String step, String className) throws Exception {
		CustomWebElement.sendKeys(step, reEmail, driver, extentLogger, extent, enterconfirmemail, className);
	}

	/* Reason for loan */
	public void clickReasonForLoan(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reasonForLoan, driver, extentLogger, extent, step, className);
	}

	/* Reason for loan Option 4 */
	public void selectReasonForLoan4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(reasonForLoan4, driver, extentLogger, extent, step, className);
	}

	/* Highest level of education */
	public void clickHighestLevelOfEducation(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(highestLevelEducation, driver, extentLogger, extent, step, className);
	}

	/* Highest level of education optiion 1 */
	public void selectHighestLevelOfEducation1(ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.click(highestLevelEducation1, driver, extentLogger, extent, step, className);
	}

	/* Failed to repay any loans in the past? */
	public void clickFailedToRepay(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(failedToPayLoans, driver, extentLogger, extent, step, className);
	}

	/* Failed to repay any loans in the past? NO 2 */
	public void selectFailedToRepay2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(failedToPayLoans2, driver, extentLogger, extent, step, className);
	}

	/* How did you hear about us? */
	public void clickHowHearAboutUS(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howDoYouHearAboutUs, driver, extentLogger, extent, step, className);
	}

	/* How did you hear about us? 2 */
	public void selectHowHearAboutUS2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howDoYouHearAboutUs2, driver, extentLogger, extent, step, className);
	}

	/* Click on Continue Button on Personal Details Page */
	public void clickContinueOnPD(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonPersonalDetails, driver, extentLogger, extent, step, className);
	}

}
