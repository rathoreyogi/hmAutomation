package com.happiestmind.automation.suite.wpregression;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.happiestmind.automation.browsers.BrowserFactory;
import com.happiestmind.automation.dataprovider.AutomationDataProvider;
import com.happiestmind.automation.domain.AfterMethodAssessmentProperties;
import com.happiestmind.automation.domain.AfterTestAssessmentProperties;
import com.happiestmind.automation.errorhandler.ExtentErrorHandler;
import com.happiestmind.automation.exception.AutomationDataProviderCustomException;
import com.happiestmind.automation.exception.ParameterReaderCustomException;
import com.happiestmind.automation.util.ErrorHandler;
import com.happiestmind.automation.util.MiscUtils;
import com.happiestmind.automation.util.TestUtil;
import com.happiestmind.automation.wp.pagefactory.ActiveAccount;
import com.happiestmind.automation.wp.pagefactory.AddressDetails;
import com.happiestmind.automation.wp.pagefactory.BankDetails;
import com.happiestmind.automation.wp.pagefactory.CreditSense;
import com.happiestmind.automation.wp.pagefactory.EmploymentDetails;
import com.happiestmind.automation.wp.pagefactory.HomePage;
import com.happiestmind.automation.wp.pagefactory.LoanAgrementSignPage;
import com.happiestmind.automation.wp.pagefactory.PersonalDetails;
import com.happiestmind.automation.wp.pagefactory.QuickCheck;
import com.happiestmind.automation.wp.pagefactory.ReviewInfoPage;
import com.happiestmind.automation.wp.pagefactory.VerifyYourIdentityPage;
import com.relevantcodes.extentreports.LogStatus;

public class WPRegistrationTest extends WPRegressionSuiteBaseImpl {

	final static Logger LOG = Logger.getLogger(WPRegistrationTest.class);

	private final static String TESTCASE = "Starting user registration";
	private final static String STEP1 = "Click on province button";
	private final static String STEP2 = "Select ontario";
	private final static String STEP3 = "Click on I Agree";
	private final static String STEP4 = "Start your Application button";
	private final static String STEP5 = "Select 1st Yes option";
	private final static String STEP6 = "Select 2st Yes option";
	private final static String STEP7 = "Select 3st Yes option";
	private final static String STEP8 = "Select 4st Yes option";
	private final static String STEP9 = "Select 5st Yes option";
	private final static String STEP10 = "Click On continue button On Quick Check";
	private final static String STEP11 = "Click on Title";
	private final static String STEP12 = "Select Mr. option";
	private final static String STEP13 = "Enter First Name";
	private final static String STEP14 = "Enter Last Name";
	private final static String STEP15 = "Enter DOB";
	private final static String STEP16 = "Enter SIN";
	private final static String STEP17 = "Click on Marital Status";
	private final static String STEP18 = "Select Widowed";
	private final static String STEP19 = "Click on Number of dependents";
	private final static String STEP20 = "Select 3";
	private final static String STEP21 = "Enter Mobile Phone Number";
	private final static String STEP22 = "Enter Home phone number";
	private final static String STEP23 = "Enter Email";
	private final static String STEP24 = "Enter Reconfirm email";
	private final static String STEP25 = "Click on Reason for loan";
	private final static String STEP26 = "Select ";
	private final static String STEP27 = "Click on Highest level of education";
	private final static String STEP28 = "Select ";
	private final static String STEP29 = "Click on Have you failed to repay any loans in the past?";
	private final static String STEP30 = "Select ";
	private final static String STEP31 = "Click on How did you hear about us?";
	private final static String STEP32 = "Select ";
	private final static String STEP33 = "Click On continue Button on Personal details Page";
	private final static String STEP34 = "Click On Home Status";
	private final static String STEP35 = "Select Home Status";
	private final static String STEP36 = "Enter Building number";
	private final static String STEP37 = "Enter Apartment number(if applicable)";
	private final static String STEP38 = "Enter Street name";
	private final static String STEP39 = "Enter Town/City";
	private final static String STEP40 = "Enter Postal code";
	private final static String STEP41 = "CLick On years ";
	private final static String STEP42 = "Select Years ";
	private final static String STEP43 = "CLick ON months ";
	private final static String STEP44 = "Select Months ";
	private final static String STEP45 = "Click ON continue button on Address detils page ";
	private final static String STEP46 = "CLick Source of income";
	private final static String STEP47 = "Select Source of income Employed";
	private final static String STEP48 = "Click Type of employment";
	private final static String STEP49 = "Select Type of employment Full Time";
	private final static String STEP50 = "Enter Employeer name";
	private final static String STEP51 = "Click Length of employment years";
	private final static String STEP52 = "Select Length of employment years";
	private final static String STEP53 = "Click Length of employment Months";
	private final static String STEP54 = "Select Length of employment Months";
	private final static String STEP55 = "CLick How is your salary paid?";
	private final static String STEP56 = "Select How is your salary paid DirectDeposit";
	private final static String STEP57 = "CLick How often do you get paid?";
	private final static String STEP58 = "Select How often do you get paid? Monthly";
	private final static String STEP59 = "Enter Next pay date";
	private final static String STEP60 = "Enter Amount of last net pay(including tips if applicable)*";
	private final static String STEP61 = "CLick Is a portion of your salary paid in cash (e.g. tips)?*";
	private final static String STEP62 = "Select Yes";
	private final static String STEP63 = "Enter How much of your net pay is paid in cash?*";
	private final static String STEP64 = "Click on continue button on Employment Details page";
	private final static String STEP65 = "Click Bank Name";
	private final static String STEP66 = "Select Banak Name Others";
	private final static String STEP67 = "Enter Institution number";
	private final static String STEP68 = "Enter Transit number";
	private final static String STEP69 = "Enter Account number";
	private final static String STEP70 = "Click On continue Button on bank detail page";
	private final static String STEP71 = "Click on first check box";
	private final static String STEP72 = "Click on second check box";
	private final static String STEP73 = "Click on continue Button on review info page";
	private final static String STEP74 = "Enter on OTP";
	private final static String STEP75 = "Enter Create password";
	private final static String STEP76 = "Enter Reconfirm Password";
	private final static String STEP77 = "Click on continue button on Active your Account Page";
	private final static String STEP78 = "Click on Bank Name Drop Down";
	private final static String STEP79 = "Select Dummy standrad bank";
	private final static String STEP80 = "Enter catalog value testf";
	private final static String STEP81 = "Enter password testf";
	private final static String STEP82 = "click on submit button";
	private final static String STEP83 = "Click on I Agree Button and wait for 30 sec to fill answer :)";
	private final static String STEP84 = "Click on Q1 answer 5";
	private final static String STEP85 = "Click on Q2 answer 1";
	private final static String STEP86 = "Click on Q3 answer 2";
	private final static String STEP87 = "Click on Q4 answer 5";
	private final static String STEP88 = "Click onCountinue Button on KYC page";
	private final static String STEP89 = "Click first Check Box Agreement";
	private final static String STEP90 = "Click second Check Box Agreement";
	private final static String STEP91 = "Click I Agree Button contract page";
	private final static String STEP92 = "Click Accept And Continue Button";
	private final static String STEP93 = "Click On Give Feedback Button";
	private final static String STEP94 = "Click On Calcel Feedback Button";
	private final static String STEP95 = "Click Go to Dashboard Button";
	private final static String STEP96 = "Ckecl SPL on Dashboard Button";

	String runmodes[] = null;
	static int count = -1;
	// static boolean pass=false;
	static boolean fail = false;
	static boolean skip = false;
	static boolean isTestPass = true;
	String className = this.getClass().getSimpleName();

	// Runmode of test case in a suite
	@BeforeTest
	public void checkTestSkip() throws IOException {
		try {
			MiscUtils.beforeTestRunmodeCheckUp(wpSuite, className);
			// load the runmodes off the tests
			runmodes = TestUtil.getDataSetRunmodes(wpSuite, className);
		} catch (ParameterReaderCustomException e) {
			skip = true;
			isTestPass = false;
			fail = false;
			e.printStackTrace();
		}
	}

	@Test(dataProvider = "getTestData")
	public void wpregistrationtest(String url, String browser, String firstname, String lastname, String dob,
			String sin, String mobilenumber, String homephonenumber, String email, String reconfirmemail,
			String buildingnumber, String apartmentnumber, String streetname, String towncity, String postalcode,
			String employername, String nextpaydate, String amountlastpay, String howmuchpaycash,
			String institutionnumber, String transitnumber, String accountnumber,String loanamount, String phonenumber, String otppinnumber, String createpassword,
			String reconfirmpassword, String banknameEditBox, String catalog, String catalogpassword, String jSONData) throws Exception {

		extentLogger = extent.startTest(TESTCASE);

		// test the runmode of current dataset
		// String ABC;
		count++;
		if (!runmodes[count].equalsIgnoreCase("Y")) {
			skip = true;
			isTestPass = false;
			fail = false;
			extentLogger.log(LogStatus.SKIP, "This test case is skipped");
			extent.endTest(extentLogger);
			throw new SkipException("Runmode for test set data set to no " + count);
		}

		LOG.info(" Executing : " + className);
		LOG.info("using browser: " + browser + " with url: " + url);

		WebDriver driver = null;
		try {

			driver = BrowserFactory.startBrowser(browser, url);

			HomePage homePage = PageFactory.initElements(driver, HomePage.class);
			QuickCheck quickCheck = PageFactory.initElements(driver, QuickCheck.class);
			PersonalDetails personalDetails = PageFactory.initElements(driver, PersonalDetails.class);
			AddressDetails addressDetails = PageFactory.initElements(driver, AddressDetails.class);
			EmploymentDetails employmentDetails = PageFactory.initElements(driver, EmploymentDetails.class);
			BankDetails bankDetails = PageFactory.initElements(driver, BankDetails.class);
			ReviewInfoPage reviewInfoPage = PageFactory.initElements(driver, ReviewInfoPage.class);
			ActiveAccount activeAccount = PageFactory.initElements(driver, ActiveAccount.class);
			CreditSense creditSense = PageFactory.initElements(driver, CreditSense.class);
			VerifyYourIdentityPage verifyYourIdentityPage = PageFactory.initElements(driver, VerifyYourIdentityPage.class);
			LoanAgrementSignPage loanAgrementSignPage = PageFactory.initElements(driver, LoanAgrementSignPage.class);

			/**/
			MiscUtils.pauseForElementToBePresent(3000L);
			/* STEP1 */
			homePage.clickProvince(extentLogger, extent, STEP1, className);
			/* STEP2 */
			homePage.selectOntario(extentLogger, extent, STEP2, className);
			/* STEP3 */
			MiscUtils.pauseForElementToBePresent(1000L);
			homePage.clickIAgree(extentLogger, extent, STEP3, className);
			/* STEP4 */
			MiscUtils.pauseForElementToBePresent(2000L);
			homePage.clickStratApplication(extentLogger, extent, STEP4, className);
			MiscUtils.pauseForElementToBePresent(2000L);
			/* STEP5 */
			quickCheck.selectOptionYes1(extentLogger, extent, STEP5, className);
			/* STEP6 */
			quickCheck.selectOptionYes2(extentLogger, extent, STEP6, className);
			/* STEP7 */
			quickCheck.selectOptionYes3(extentLogger, extent, STEP7, className);
			/* STEP8 */
			quickCheck.selectOptionYes4(extentLogger, extent, STEP8, className);
			/* STEP9 */
			quickCheck.selectOptionYes5(extentLogger, extent, STEP9, className);
			/* STEP10 */
			quickCheck.clickContinueOnQC(extentLogger, extent, STEP10, className);
			MiscUtils.pauseForElementToBePresent(1000L);
			/* STEP11 */
			personalDetails.clickOnTitle(extentLogger, extent, STEP11, className);
			/* STEP12 */
			personalDetails.selectTitleMr(extentLogger, extent, STEP12, className);
			/* STEP13 */
			personalDetails.enterFirstName(firstname, extentLogger, extent, STEP13, className);
			/* STEP14 */
			personalDetails.enterLastName(lastname, extentLogger, extent, STEP14, className);
			/* STEP15 */
			personalDetails.enterDOBOnPD(dob, extentLogger, extent, STEP15, className);
			/* STEP16 */
			personalDetails.enterSinNumber(sin, extentLogger, extent, STEP16, className);
			/* STEP17 */
			personalDetails.clickOnMaritalstatus(extentLogger, extent, STEP17, className);
			/* STEP18 */
			personalDetails.selectMaritalstatusWidowed(extentLogger, extent, STEP18, className);
			/* STEP19 */
			personalDetails.clickOnNumberOfDependents(extentLogger, extent, STEP19, className);
			/* STEP20 */
			personalDetails.selectNumberOfDependents3(extentLogger, extent, STEP20, className);
			/* STEP21 */
			personalDetails.enterMobileNumber(mobilenumber, extentLogger, extent, STEP21, className);
			/* STEP22 */
			personalDetails.enterHomeNumber(homephonenumber, extentLogger, extent, STEP22, className);
			MiscUtils.pauseForElementToBePresent(10000L);
			/* STEP23 */
			// UUID uniqueValue = UUID.randomUUID();
			String emaildomain = "@mailinator.com";
			String newemail = email + "_" + System.currentTimeMillis() + emaildomain;
			personalDetails.enterEmail(newemail, extentLogger, extent, STEP23, className);
			/* STEP24 */
			personalDetails.enterreConfirmEmail(newemail, extentLogger, extent, STEP24, className);
			/* STEP25 */
			personalDetails.clickReasonForLoan(extentLogger, extent, STEP25, className);
			/* STEP26 */
			personalDetails.selectReasonForLoan4(extentLogger, extent, STEP26, className);
			/* STEP27 */
			personalDetails.clickHighestLevelOfEducation(extentLogger, extent, STEP27, className);
			/* STEP28 */
			personalDetails.selectHighestLevelOfEducation1(extentLogger, extent, STEP28, className);
			/* STEP29 */
			personalDetails.clickFailedToRepay(extentLogger, extent, STEP29, className);
			/* STEP30 */
			personalDetails.selectFailedToRepay2(extentLogger, extent, STEP30, className);
			/* STEP31 */
			personalDetails.clickHowHearAboutUS(extentLogger, extent, STEP31, className);
			/* STEP32 */
			personalDetails.selectHowHearAboutUS2(extentLogger, extent, STEP32, className);
			/* STEP33 */
			personalDetails.clickContinueOnPD(extentLogger, extent, STEP33, className);
			MiscUtils.pauseForElementToBePresent(1000L);
			/* STEP34 */
			addressDetails.clickHomeStatus(extentLogger, extent, STEP34, className);
			/* STEP35 */
			addressDetails.selectHomeStatustenant(extentLogger, extent, STEP35, className);
			/* STEP36 */
			addressDetails.enterBuildingNumber(buildingnumber, extentLogger, extent, STEP36, className);
			/* STEP37 */
			addressDetails.enterAppartmentNumber(apartmentnumber, extentLogger, extent, STEP37, className);
			/* STEP38 */
			addressDetails.enterStreetName(streetname, extentLogger, extent, STEP38, className);
			/* STEP39 */
			addressDetails.enterTownOrCity(towncity, extentLogger, extent, STEP39, className);
			/* STEP40 */
			addressDetails.enterPostalCode(postalcode, extentLogger, extent, STEP40, className);
			/* STEP41 */
			addressDetails.clickDurationYearhowlong(extentLogger, extent, STEP41, className);
			/* STEP42 */
			addressDetails.selectDurationYearHowLong7(extentLogger, extent, STEP42, className);
			/* STEP43 */
			addressDetails.clickDurationMonthsHowLong(extentLogger, extent, STEP43, className);
			/* STEP44 */
			addressDetails.selectDurationMonthsHowLong6(extentLogger, extent, STEP44, className);
			/* STEP45 */
			addressDetails.clickContinueOnAD(extentLogger, extent, STEP45, className);
			MiscUtils.pauseForElementToBePresent(1000L);
			/* STEP46 */
			employmentDetails.clickSourceOfIncome(extentLogger, extent, STEP46, className);
			/* STEP47 */
			employmentDetails.selectSourceOfIncomeEmployed(extentLogger, extent, STEP47, className);
			/* STEP48 */
			employmentDetails.clickTypeOfEmployment(extentLogger, extent, STEP48, className);
			/* STEP49 */
			employmentDetails.selectTypeOfEmploymentFullTime(extentLogger,extent, STEP49, className);
			/* STEP50 */
			employmentDetails.enterEmployerName(employername, extentLogger,extent, STEP50, className);
			/* STEP51 */
			employmentDetails.clickLengthOfEmploymentYears(extentLogger,extent, STEP51, className);
			/* STEP52 */
			employmentDetails.selectLengthOfEmploymentYaers5(extentLogger,extent, STEP52, className);
			/* STEP53 */
			employmentDetails.clickLengthOfEmploymentMonths(extentLogger,extent, STEP53, className);
			/* STEP54 */
			employmentDetails.selectLengthOfEmploymentMonths4(extentLogger,	extent, STEP54, className);
			/* STEP55 */
			employmentDetails.clickHowSalaryPaid(extentLogger, extent, STEP55, className);
			/* STEP56 */
			employmentDetails.selectHowSalaryPaidDirectDeposit(extentLogger, extent, STEP56, className);
			/* STEP57 */
			employmentDetails.clickHowOftenPaid(extentLogger, extent, STEP57, className);
			/* STEP58 */
			employmentDetails.selectHowOftenPaidMonthly(extentLogger, extent, STEP58, className);
			/* STEP59 */
			employmentDetails.enterNextPayDate(nextpaydate, extentLogger, extent, STEP59, className);
			/* STEP60 */
			employmentDetails.enterAmmountLastPay(amountlastpay, extentLogger, extent, STEP60, className);
			/* STEP61 */
			employmentDetails.clickPortionSalaryPaidByCash(extentLogger,extent, STEP61, className);
			/* STEP62 */
			employmentDetails.selectPortionSalaryPaidByCashYes(extentLogger,extent, STEP62, className);
			/* STEP63 */
			employmentDetails.enterHowMuchPaidInCash(howmuchpaycash,extentLogger, extent, STEP63, className);
			/* STEP64 */
			employmentDetails.clickContinueButtonOnEMDT(extentLogger, extent, STEP64, className);
			MiscUtils.pauseForElementToBePresent(3000L);
			/* STEP65 */
			bankDetails.clickBankName(extentLogger, extent, STEP65, className);
			/* STEP66 */
			bankDetails.selectBankNameOthers(extentLogger, extent, STEP66, className);
			/* STEP67 */
			//bankDetails.enterInstitutionNumber(institutionnumber, extentLogger, extent, STEP67, className);
			/* STEP68 */
			bankDetails.enterTransitNumber(transitnumber, extentLogger, extent, STEP68, className);
			/* STEP69 */
			bankDetails.enterAccountNumber(accountnumber, extentLogger, extent, STEP69, className);
			/* STEP70 */
			bankDetails.clickContinueButtonOnBD(extentLogger, extent, STEP70, className);
			MiscUtils.pauseForElementToBePresent(3000L);
			/* STEP71 */
			reviewInfoPage.clickOnEditButtonLoanDetails(extentLogger, extent, STEP71, className);
			reviewInfoPage.clearLoanAmount(extentLogger, extent, STEP71, className);
			reviewInfoPage.enterLoanAmount(loanamount, extentLogger, extent, STEP71, className);
			reviewInfoPage.clickOnSaveLoanDetailsBtn(extentLogger, extent, STEP71, className);
			reviewInfoPage.clickOnFirstCheckBox(extentLogger, extent, STEP71, className);
		/*	reviewInfoPage.clickOnEditPersonalBtn(extentLogger, extent, STEP71, className);
			reviewInfoPage.clearPhoneNumber(extentLogger, extent, STEP71, className);
			reviewInfoPage.enterPhoneNumber(phonenumber, extentLogger, extent, STEP71, className);
			//MiscUtils.pauseForElementToBePresent(10000L);
			reviewInfoPage.clickOnSavePersonalBtn(extentLogger, extent, STEP71, className);*/
			/* STEP72 */
			reviewInfoPage.clickOnSecondCheckBox(extentLogger, extent, STEP72, className);
			/* STEP73 */
			reviewInfoPage.clickContinueButtonRIF(extentLogger, extent, STEP73, className);
			MiscUtils.pauseForElementToBePresent(4000L);
			/* STEP74 */
			activeAccount.enterOneTimePinNumber(otppinnumber, extentLogger, extent, STEP74, className);
			/* STEP75 */
			activeAccount.enterCreatePassword(createpassword, extentLogger, extent, STEP75, className);
			/* STEP76 */
			activeAccount.enterReconfirmPassword(reconfirmpassword, extentLogger, extent, STEP76, className);
			/* STEP77 */
			activeAccount.clickContinueButtonOnAYA(extentLogger, extent, STEP77, className);
			MiscUtils.pauseForElementToBePresent(15000L);

			/* STEP78 */
			//** Switch to iframe **//

			driver.switchTo().frame("creditSenseIFrame");
			creditSense.clickBankNameDropdown(extentLogger, extent, STEP78, className);
			/* STEP79 */
			creditSense.SelectBankNameFromDropDown(extentLogger, extent, STEP79, className);
			MiscUtils.pauseForElementToBePresent(3000L);
			/* STEP80 */
			creditSense.enterCatalog(catalog, extentLogger, extent, STEP80, className);
			/* STEP81 */
			creditSense.enterCatalogPassword(catalogpassword, extentLogger, extent, STEP81, className);
			creditSense.enterJSON(jSONData, extentLogger, extent, STEP81, className);
			/* STEP82 */
			creditSense.clickSubmitDetails(extentLogger, extent, STEP82, className);
			MiscUtils.pauseForElementToBePresent(2000L);
			/* STEP83 */
			creditSense.clickIAgreeOnTremsAndCondition(extentLogger, extent, STEP83, className);
			driver.switchTo().defaultContent();

			/* STEP84 */
			MiscUtils.pauseForElementToBePresent(20000L);
			//verifyYourIdentityPage.clickFirstQOption5(extentLogger, extent, STEP84, className);
			/* STEP85 */
			//verifyYourIdentityPage.clickSecondQOption1(extentLogger, extent, STEP85, className);
			/* STEP86 */
			//verifyYourIdentityPage.clickthirdQOption3(extentLogger, extent, STEP86, className);
			/* STEP87 */
			//verifyYourIdentityPage.clickfourthQOption5(extentLogger, extent, STEP87, className);
			/* STEP88 */
			verifyYourIdentityPage.clickOnContinueButtonKYC(extentLogger, extent, STEP88, className);
			MiscUtils.pauseForElementToBePresent(16000L);
			/* STEP89 */
			loanAgrementSignPage.clickFirstCheckBoxAgrement(extentLogger, extent, STEP89, className);
			/* STEP90 */
			loanAgrementSignPage.clickSecondCheckBoxAgrement(extentLogger, extent, STEP90, className);
			/* STEP91 */
			loanAgrementSignPage.clickIAgreeButton(extentLogger, extent, STEP91, className);
			/* STEP92 */
			MiscUtils.pauseForElementToBePresent(3000L);
			loanAgrementSignPage.clickAcceptAndContinueButton(extentLogger, extent, STEP92, className);
			/* STEP93 */
			MiscUtils.pauseForElementToBePresent(4000L);
			//loanAgrementSignPage.clickGiveFeedBackButton(extentLogger, extent, STEP93, className);
			/* STEP94 */
			//loanAgrementSignPage.clickfeedbackCancelButton(extentLogger, extent, STEP94, className);
			/* STEP95 */
			loanAgrementSignPage.clickGoToDashboardButton(extentLogger, extent, STEP95, className);
			/* STEP96 */
			MiscUtils.pauseForElementToBePresent(4000L);
			loanAgrementSignPage.clickLoanStatus(extentLogger, extent, STEP96, className);

		} catch (Throwable t) {
			// code to report the error in testng
			ErrorHandler.setVerificationFailure(t);
			// report the error in xlxs files
			fail = true;
			isTestPass = false;
			extentLogger.log(LogStatus.FATAL, t);
			extentLogger.log(LogStatus.INFO, "Snapshot for failed step is given below [Click it for full view]: "
					+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
			extent.endTest(extentLogger);
			//driver.quit();

			throw new Exception(t);
			// return;

		}
		//driver.quit();
		extent.endTest(extentLogger);
	}

	@AfterMethod
	public void reportDataSetResult(ITestResult result) {

		AfterMethodAssessmentProperties methodAssessment = new AfterMethodAssessmentProperties();
		methodAssessment.setSuiteObject(wpSuite);
		methodAssessment.setClassName(className);
		methodAssessment.setFail(fail);
		methodAssessment.setSkip(skip);
		methodAssessment.setTestPass(isTestPass);
		methodAssessment.setExtentLogger(extentLogger);
		methodAssessment.setResult(result);

		isTestPass = MiscUtils.afterMethodAssessment(methodAssessment);
	}

	@AfterTest
	public void reportTestResult() {
		AfterTestAssessmentProperties testAssessment = new AfterTestAssessmentProperties();
		testAssessment.setTestPass(isTestPass);
		testAssessment.setClassName(className);
		testAssessment.setExtent(extent);
		testAssessment.setSuiteObject(wpSuite);

		try {
			MiscUtils.afterTestAssessment(testAssessment);
		} catch (ParameterReaderCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DataProvider
	public Object[][] getTestData() throws IOException {
		try {
			return AutomationDataProvider.getData(wpSuite, className);
		} catch (AutomationDataProviderCustomException e) {
			ExtentErrorHandler.dataProviderErrHandler(e, extent, extentLogger, TESTCASE, "wpSuite");
		}
		return null;
	}

}
