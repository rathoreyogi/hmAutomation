package com.happiestmind.automation.suite.clsregression;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.happiestmind.automation.base.AutomationSuiteBase;
import com.happiestmind.automation.exception.ParameterReaderCustomException;
import com.happiestmind.automation.exception.SheetLoaderCustomException;
import com.happiestmind.automation.loaders.XlsSheetsLoader;
import com.happiestmind.automation.util.MiscUtils;
import com.happiestmind.automation.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CLSRegressionSuiteBaseImpl extends XlsSheetsLoader implements AutomationSuiteBase {

	static ExtentReports extent;
	ExtentTest extentLogger;
	
	@BeforeSuite
	public void checkSuiteSkip() throws ParameterReaderCustomException, SheetLoaderCustomException, IOException {
		initialize();
		if (!TestUtil.isSuiteRunnable(parentSuite, "CLSRegression")) {
			throw new SkipException("Runmode of CLSRegression Suite set to N. So Skipping all tests in CLSRegression Suite");
		}
		extent = MiscUtils.getExtentObject(extent, "CLSRegression");

	}

	@AfterSuite
	public void closeConnections() throws Exception {
		extent.flush();
		extent.close();
	}

}
