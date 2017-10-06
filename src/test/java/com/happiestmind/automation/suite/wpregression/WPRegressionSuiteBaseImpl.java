package com.happiestmind.automation.suite.wpregression;


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

public class WPRegressionSuiteBaseImpl extends XlsSheetsLoader implements AutomationSuiteBase {

	static ExtentReports extent;
	ExtentTest extentLogger;
	
	@BeforeSuite
	public void checkSuiteSkip() throws ParameterReaderCustomException, SheetLoaderCustomException, IOException {
		initialize();
		if (!TestUtil.isSuiteRunnable(parentSuite, "WPRegression")) {
			throw new SkipException("Runmode of WPRegression Suite set to N. So Skipping all tests in WPRegression Suite");
		}
		extent = MiscUtils.getExtentObject(extent, "WPRegression");

	}

	@AfterSuite
	public void closeConnections() throws Exception {
		extent.flush();
		extent.close();
	}

}

