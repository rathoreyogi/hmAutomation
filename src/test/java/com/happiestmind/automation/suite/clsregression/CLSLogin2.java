package com.happiestmind.automation.suite.clsregression;

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
import com.happiestmind.automation.cl.pagefactory.CLLoginPage;
import com.happiestmind.automation.util.ErrorHandler;
import com.happiestmind.automation.util.MiscUtils;
import com.happiestmind.automation.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CLSLogin2 extends CLSRegressionSuiteBaseImpl {

	final static Logger LOG = Logger.getLogger(CLSLogin2.class);

	private final static String TESTCASE = "Starting CLLogin Test2";
	private final static String STEP1 = "Enter Username";
	private final static String STEP2 = "Enter Password";
	private final static String STEP3 = "Click on login button";
	private final static String STEP4 = "Select Packege";
	private final static String STEP5 = "Click on Package";
	private final static String STEP6 = "Click on App Tab";
	private final static String STEP7 = "Click on new app button";

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
			MiscUtils.beforeTestRunmodeCheckUp(clsSuite, className);
			// load the runmodes off the tests
			runmodes = TestUtil.getDataSetRunmodes(clsSuite, className);

		} catch (ParameterReaderCustomException e) {
			skip = true;
			isTestPass = false;
			fail = false;
			e.printStackTrace();
		}

	}

	@Test(dataProvider = "getTestData")
	public void cllogintest(String url, String browser, String username, String password) throws Exception {

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
		LOG.info("using browser: " + browser + " with url: " + url + " providing username: " + username + " password: "
				+ password);

		WebDriver driver = null;
		try {

			driver = BrowserFactory.startBrowser(browser, url);

			CLLoginPage clLoginPage = PageFactory.initElements(driver, CLLoginPage.class);

			clLoginPage.enterUserName(username, extentLogger, extent, STEP1, className);
			clLoginPage.enterPassword(password, extentLogger, extent, STEP2, className);
			clLoginPage.clickLoginButton(extentLogger, extent, STEP3, className);
			MiscUtils.pauseForElementToBePresent(5000L);
			clLoginPage.selectPackageButton(extentLogger, extent, STEP4, className);
			// clLoginPage.cLOPackageButton(extentLogger, extent, STEP5,
			// className);
			// clLoginPage.selectAPPButton(extentLogger, extent, STEP6,
			// className);
			// clLoginPage.newAppButton(extentLogger, extent, STEP7, className);

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
		methodAssessment.setSuiteObject(clsSuite);
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
		testAssessment.setSuiteObject(clsSuite);

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
			return AutomationDataProvider.getData(clsSuite, className);
		} catch (AutomationDataProviderCustomException e) {
			ExtentErrorHandler.dataProviderErrHandler(e, extent, extentLogger, TESTCASE, "clsSuite");
		}
		return null;
	}

}
