package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}
	
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mainMenu']/nav/div/a/img")
	WebElement logoTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[1]/a")
	WebElement homeTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[2]/a")
	WebElement howItWorksTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[3]/a")
	WebElement bankerooJumpTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[4]/a")
	WebElement fAQTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[5]/a")
	WebElement aboutUsTAB;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='mySidenav']/li[6]/a")
	WebElement loginPageTAB;
	/**/
	@FindBy(how = How.NAME, using = "province")
	WebElement provinceDropDown;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[4]/div/form/div[1]/div[1]/select/option[2]")
	WebElement provinceOptionOntario;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='popupPaydayLoans']/div/div/div/div[2]/div[5]/span[4]/a")
	WebElement loanActPleaseClickHereLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='popupPaydayLoans']/div/div/div/div[2]/div[6]/div[1]/a")
	WebElement clickToViewLicenseLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='popupPaydayLoans']/div/div/div/div[2]/div[6]/div[2]/input")
	WebElement iAgreeButton;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[4]/div/form/div[2]/div[2]/input")
	WebElement startYourApplicationButton;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[4]/div[2]/div[2]/p[3]/a")
	WebElement payDayLoanLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[6]/div/div[1]/p[3]/a")
	WebElement learnBankerooJumpLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[9]/div/p[4]/a")
	WebElement howItWorkLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[10]/div[2]/div/p[2]/a")
	WebElement getStartWithBankerooLink;
	/**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[6]/div/div[1]/p[3]/a")
	WebElement footerHowItWork;

	// Rest footer link need to be updated.....

	/******************************** METHODS ********************************************/
	
	/* Click Logo */
	public void clickLogoTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(logoTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickHomeTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(homeTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickHowitWorksTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(howItWorksTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickJumpTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(bankerooJumpTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickFAQTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(fAQTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickAboutUsTAB(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(aboutUsTAB, driver, extentLogger, extent, step, className);
	}
	/**/
	public void clickProvince(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(provinceDropDown, driver, extentLogger, extent, step, className);
	}/**/
	public void selectOntario(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(provinceOptionOntario, driver, extentLogger, extent, step, className);
	}/**/
	public void clickIAgree(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(iAgreeButton, driver, extentLogger, extent, step, className);
	}/**/
	public void clickStratApplication(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(startYourApplicationButton, driver, extentLogger, extent, step, className);
	}
	
}
