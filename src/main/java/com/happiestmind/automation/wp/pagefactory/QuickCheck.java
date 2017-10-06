package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class QuickCheck {
	WebDriver driver;

	public QuickCheck(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[1]/div/p[2]/a")
	WebElement pleaseLoginLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/label[1]/div")
	WebElement checkBox1Yes;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/label[1]/div")
	WebElement checkBox2Yes;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[2]/label[1]/div")
	WebElement checkBox3Yes;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[9]/div[2]/label[1]/div")
	WebElement checkBox4Yes;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[11]/div[2]/label[1]/div")
	WebElement checkBox5Yes;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/label[2]/div")
	WebElement checkBox1No;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[2]/label[2]/div")
	WebElement checkBox2No;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[7]/div[2]/label[2]/div")
	WebElement checkBox3No;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[9]/div[2]/label[2]/div")
	WebElement checkBox4No;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[11]/div[2]/label[2]/div")
	WebElement checkBox5No;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[13]/div/div[2]/input")
	WebElement continueButton;
	/**/
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[13]/div/div[1]/input")
	WebElement previoueButton;
	
	
	/*****************************************METHODS***********************************************/

	/* Select Option 1 Yes */
	public void selectOptionYes1(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(checkBox1Yes, driver, extentLogger, extent, step, className);
	}
	/* Select Option 2 Yes */
	public void selectOptionYes2(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(checkBox2Yes, driver, extentLogger, extent, step, className);
	}
	/* Select Option 3 Yes */
	public void selectOptionYes3(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(checkBox3Yes, driver, extentLogger, extent, step, className);
	}
	/* Select Option 4 Yes */
	public void selectOptionYes4(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(checkBox4Yes, driver, extentLogger, extent, step, className);
	}
	/* Select Option 5 Yes */
	public void selectOptionYes5(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(checkBox5Yes, driver, extentLogger, extent, step, className);
	}
	/* Click  on Continue Button */
	public void clickContinueOnQC(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButton, driver, extentLogger, extent, step, className);
	}
}
