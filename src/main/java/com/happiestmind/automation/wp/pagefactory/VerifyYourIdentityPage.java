package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class VerifyYourIdentityPage {

	WebDriver driver;

	public VerifyYourIdentityPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* First Question options */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[1]/ul/li[1]/input")
	WebElement firstQOption1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[1]/ul/li[2]/input")
	WebElement firstQOption2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[1]/ul/li[3]/input")
	WebElement firstQOption3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[1]/ul/li[4]/input")
	WebElement firstQOption4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[1]/ul/li[5]/input")
	WebElement firstQOption5;

	/* Second Question options */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[2]/ul/li[1]/input")
	WebElement secondQOption1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[2]/ul/li[2]/input")
	WebElement secondQOption2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[2]/ul/li[3]/input")
	WebElement secondQOption3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[2]/ul/li[4]/input")
	WebElement secondQOption4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[2]/ul/li[5]/input")
	WebElement secondQOption5;

	/* Third Question options */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[3]/ul/li[1]/input")
	WebElement thirdQOption1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[3]/ul/li[2]/input")
	WebElement thirdQOption2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[3]/ul/li[3]/input")
	WebElement thirdQOption3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[3]/ul/li[4]/input")
	WebElement thirdQOption4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[3]/ul/li[5]/input")
	WebElement thirdQOption5;

	/* Fourth Question options */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[4]/ul/li[1]/input")
	WebElement fourthQOption1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[4]/ul/li[2]/input")
	WebElement fourthQOption2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[4]/ul/li[3]/input")
	WebElement fourthQOption3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[4]/ul/li[4]/input")
	WebElement fourthQOption4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/div/form/div[3]/div/ul/li[4]/ul/li[5]/input")
	WebElement fourthQOption5;

	/** Continue Button **/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/div/form/div[4]/input")
	WebElement continueButtonIdentityQuestions;
	
	/**********************************************METHODS**********************************************/
	
	/*Click Q1 answer option 1*/
	public void clickFirstQOption1(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstQOption1, driver, extentLogger, extent, step, className);
	}
	/*Click Q1 answer option 2*/
	public void clickFirstQOption2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstQOption2, driver, extentLogger, extent, step, className);
	}
	/*Click Q1 answer option 3*/
	public void clickFirstQOption3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstQOption3, driver, extentLogger, extent, step, className);
	}
	/*Click Q1 answer option 4*/
	public void clickFirstQOption4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstQOption4, driver, extentLogger, extent, step, className);
	}
	/*Click Q1 answer option 5*/
	public void clickFirstQOption5(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(firstQOption5, driver, extentLogger, extent, step, className);
	}
	
	/**Click Q2 answer option 1*/
	public void clickSecondQOption1(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(secondQOption1, driver, extentLogger, extent, step, className);
	}
	/**Click Q2 answer option 2*/
	public void clickSecondQOption2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(secondQOption2, driver, extentLogger, extent, step, className);
	}
	/**Click Q2 answer option 3*/
	public void clickSecondQOption3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(secondQOption3, driver, extentLogger, extent, step, className);
	}
	/**Click Q2 answer option 4*/
	public void clickSecondQOption4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(secondQOption4, driver, extentLogger, extent, step, className);
	}
	/**Click Q2 answer option 5*/
	public void clickSecondQOption5(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(secondQOption5, driver, extentLogger, extent, step, className);
	}
	
	/***Click Q3 answer option 1*/
	public void clickthirdQOption1(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(thirdQOption1, driver, extentLogger, extent, step, className);
	}
	/***Click Q3 answer option 2*/
	public void clickthirdQOption2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(thirdQOption2, driver, extentLogger, extent, step, className);
	}
	/***Click Q3 answer option 3*/
	public void clickthirdQOption3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(thirdQOption3, driver, extentLogger, extent, step, className);
	}
	/***Click Q3 answer option 4*/
	public void clickthirdQOption4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(thirdQOption4, driver, extentLogger, extent, step, className);
	}
	/***Click Q3 answer option 5*/
	public void clickthirdQOption5(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(thirdQOption5, driver, extentLogger, extent, step, className);
	}
	
	/****Click Q4 answer option 1*/
	public void clickfourthQOption1(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fourthQOption1, driver, extentLogger, extent, step, className);
	}
	/****Click Q4 answer option 2*/
	public void clickfourthQOption2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fourthQOption2, driver, extentLogger, extent, step, className);
	}
	/****Click Q4 answer option 3*/
	public void clickfourthQOption3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fourthQOption3, driver, extentLogger, extent, step, className);
	}
	/****Click Q4 answer option 4*/
	public void clickfourthQOption4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fourthQOption4, driver, extentLogger, extent, step, className);
	}
	/****Click Q4 answer option 5*/
	public void clickfourthQOption5(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fourthQOption5, driver, extentLogger, extent, step, className);
	}
	
	/*Click continue button on KYC page*/
	public void clickOnContinueButtonKYC(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonIdentityQuestions, driver, extentLogger, extent, step, className);
	}

}
