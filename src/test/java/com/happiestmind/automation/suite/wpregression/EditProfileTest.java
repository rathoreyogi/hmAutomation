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
import com.happiestmind.automation.wp.pagefactory.ChangePassword;
import com.happiestmind.automation.wp.pagefactory.Dashboard;
import com.happiestmind.automation.wp.pagefactory.EditProfile;
import com.happiestmind.automation.wp.pagefactory.WPLoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class EditProfileTest extends WPRegressionSuiteBaseImpl {

	final static Logger LOG = Logger.getLogger(EditProfileTest.class);

	private final static String TESTCASE = "Starting Edit Profile Test";
	private final static String STEP1 = "Click on login page button";
	private final static String STEP2 = "Enter Username";
	private final static String STEP3 = "Enter Password";
	private final static String STEP4 = "Click on login button";
	private final static String STEP5 = "Click on username";
	private final static String STEP6 = "";
	private final static String STEP7 = "";
	private final static String STEP8 = "";
	private final static String STEP9 = "";
	private final static String STEP10 = "";
	private final static String STEP11 = "";
	private final static String STEP12 = "";
	private final static String STEP13 = "";

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
	public void editProfileTest(String url, String browser, String username, String password, 
			String oldpassword, String newpassword, String confirmnewpassword) throws Exception {

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

			WPLoginPage wpLoginPage = PageFactory.initElements(driver, WPLoginPage.class);
			Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
			EditProfile editProfile = PageFactory.initElements(driver, EditProfile.class);
			
			/* STEP1 */
			MiscUtils.pauseForElementToBePresent(5000L);
			wpLoginPage.loginPageButton(extentLogger, extent, STEP1, className);
			/* STEP2 */
			MiscUtils.pauseForElementToBePresent(3000L);
			wpLoginPage.enterUserName(username, extentLogger, extent, STEP2, className);
			/* STEP3 */
			wpLoginPage.enterPassword(password, extentLogger, extent, STEP3, className);
			/* STEP4 */
			wpLoginPage.clickLoginButton(extentLogger, extent, STEP4, className);
			/* STEP5 */
			MiscUtils.pauseForElementToBePresent(5000L);
			dashboard.clickUserNameMenu(extentLogger, extent, STEP5, className);
			/* STEP6 */
			dashboard.clickEditProfileMenu(extentLogger, extent, STEP6, className);
			/* STEP12 */
			MiscUtils.pauseForElementToBePresent(5000L);
			dashboard.clickUserNameMenu(extentLogger, extent, STEP12, className);
			/* STEP13 */
			dashboard.clickSignOutMenu(extentLogger, extent, STEP13, className);
//TODO:  login again with changed password from updated excel
			
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
			driver.quit();

			throw new Exception(t);
			// return;

		}
		driver.quit();
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