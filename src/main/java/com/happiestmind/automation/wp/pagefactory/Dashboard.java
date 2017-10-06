package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Dashboard button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[1]/a")
	WebElement dashBoardNavigation;

	/* FAQ button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[2]/a")
	WebElement fAQNavigation;

	/* Contact us button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[3]/a")
	WebElement contactUsNavigation;

	/* Username button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul[1]/li[4]/a/span")
	WebElement UserName;

	/* Edit profile button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul[1]/li[4]/ul/li[1]/a")
	WebElement editProfile;

	/* Change password button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul[1]/li[4]/ul/li[2]/a")
	WebElement changePassword;

	/* Sign out button */
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul[1]/li[4]/ul/li[3]/a")
	WebElement signOut;

	/* Bankeroo Jump link */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div[4]/p/a")
	WebElement bankerooJumpLink;

	/* See detail for Active loan button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[8]/input")
	WebElement activeLoanDetailsButton;
	
	/* Ok Button on Active loan detail page */
	@FindBy(how = How.XPATH, using = "//*[@id='seeDetailsPanel']/div/div[3]/div/input")
	WebElement oKButtononActiveLoan;

	/* Make Payment button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[9]/input")
	WebElement makePaymentButton;

	/* SPL loan button */
	@FindBy(how = How.ID, using = "singleLoanButton")
	WebElement singleLoanButton;

	/* Installment Loan button */
	@FindBy(how = How.ID, using = "installmentLoanButton")
	WebElement installmentLoanButton;
	
	/* partial Application */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[3]/div/div[10]/div[2]/table/tbody/tr[1]/td[3]/a")
	WebElement partialApplication;

	/********************************************* METHODS ***************************************/

	/* Click on dashboard button in menu */
	public void clickDashboardMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(dashBoardNavigation, driver, extentLogger, extent, step, className);
	}
	/* Click on FAQ button in menu */
	public void clickFAQMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fAQNavigation, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickcontactUsMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(contactUsNavigation, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickUserNameMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(UserName, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickEditProfileMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(editProfile, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickChangePasswordMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(changePassword, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickSignOutMenu(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(signOut, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickBankerooJumpLink(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankerooJumpLink, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickActiveLoanDetailsButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(activeLoanDetailsButton, driver, extentLogger, extent, step, className);
	}
	/* Click */
	public void clickOkButtonOnActiveLoan(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(oKButtononActiveLoan, driver, extentLogger, extent, step, className);
	} 
	/* Click */
	public void clickmakePaymentButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(makePaymentButton, driver, extentLogger, extent, step, className);
	} 
	/* Click */
	public void clickSingleLoanButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(singleLoanButton, driver, extentLogger, extent, step, className);
	} 
	/* Click */
	public void clickInstallmentLoanButton(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(installmentLoanButton, driver, extentLogger, extent, step, className);
	} 
	
	/* Click on partial application link */
	public void clickPartialApplication(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(partialApplication, driver, extentLogger, extent, step, className);
	}

}
