package com.happiestmind.automation.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.happiestmind.automation.errorhandler.ExtentErrorHandler;
import com.happiestmind.automation.util.ExtentSucessLogger;
import com.happiestmind.automation.util.MiscUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomWebElement {

	public static void click(WebElement element, WebDriver driver, ExtentTest extentLogger, ExtentReports extent,
			String step, String className) throws Exception {

		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				element.click();
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
			}
		} catch (Exception e) {
			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
	}

	public static void submit(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {

		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);

			} else {
				element.submit();
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}

	}

	public static void sendKeys(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String keysToSend, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);

			} else {
				element.sendKeys(keysToSend);
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
	}

	public static void clear(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);

			} else {
				element.clear();
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}

	}

	public static String getTagName(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
				return element.getTagName();

			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);

		}
		return null;
	}

	public static String getAttribute(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String name, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
				return element.getAttribute(name);
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
		return null;
	}

	public boolean isSelected(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
				return element.isSelected();
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
		return false;
	}

	public boolean isEnabled(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
				return element.isEnabled();
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
		return false;
	}

	public static String getText(String step, WebElement element, WebDriver driver, ExtentTest extentLogger,
			ExtentReports extent, String className) throws Exception {
		try {
			if (!MiscUtils.isElementPresent(element, driver, extentLogger, extent, step)) {
				ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			} else {
				ExtentSucessLogger.elementFoundSuccess(extentLogger, extent, className, step);
				extentLogger.log(LogStatus.INFO, "Snapshot for Passed step is given below [Click it for full view]: "
						+ extentLogger.addScreenCapture(MiscUtils.selfie(driver, className)));
				return element.getText();
			}
		} catch (Exception e) {

			ExtentErrorHandler.extentHandlerForElement(driver, extent, extentLogger, element, step, className);
			throw new Exception(e);
		}
		return null;
	}

	public static void sendKeys(Keys enter) {
		// TODO Auto-generated method stub
		
	}

}
