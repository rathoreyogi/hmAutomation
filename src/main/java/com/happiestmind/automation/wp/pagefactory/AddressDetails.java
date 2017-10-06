package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AddressDetails {
	
	WebDriver driver;

	public AddressDetails(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Home Status */
	
	@FindBy(how = How.NAME, using = "homeStatus")
	WebElement homeStatus;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[2]")
	WebElement homeStatusTenant;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[1]/select/option[3]")
	WebElement homeStatusOwner;
	
	/* Bulding Number */
	
	@FindBy(how = How.NAME, using = "buildingNumber")
	WebElement buildingNumber;
	
	/* Apartment number(if applicable) */
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[3]/div[3]/input")
	WebElement appartmnetNumber;
	
	/* Street Name */
	
	@FindBy(how = How.NAME, using = "streetName")
	WebElement streetName;
	
	/* Town/City */
	
	@FindBy(how = How.NAME, using = "city")
	WebElement townCity;
	
	/* Province */
	
	@FindBy(how = How.NAME, using = "province")
	WebElement province;
	
	/* Postal Code */
	
	@FindBy(how = How.ID, using = "postalCodeId")
	WebElement postalCode;
	
	/* How long have you lived there(year & month) */
	
	/* YEAR Dropdown */
	
	@FindBy(how = How.NAME, using = "durationOfLivingInYear")
	WebElement durationOfLivingInYear;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[0]")
	WebElement durationOfLivingInYear0;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[1]")
	WebElement durationOfLivingInYear1;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[2]")
	WebElement durationOfLivingInYear2;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[3]")
	WebElement durationOfLivingInYear3;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[4]")
	WebElement durationOfLivingInYear4;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[5]")
	WebElement durationOfLivingInYear5;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[6]")
	WebElement durationOfLivingInYear6;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[7]")
	WebElement durationOfLivingInYear7;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[8]")
	WebElement durationOfLivingInYear8;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[9]")
	WebElement durationOfLivingInYear9;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[2]/select/option[10]")
	WebElement durationOfLivingInYear10;
	
	
	/* MONTHS Dropdown */
	
	@FindBy(how = How.NAME, using = "durationOfLivingInMonths")
	WebElement durationOfLivingInMonths;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[2]")
	WebElement durationOfLivingInMonths0;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[3]")
	WebElement durationOfLivingInMonths1;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[4]")
	WebElement durationOfLivingInMonths2;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[5]")
	WebElement durationOfLivingInMonths3;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[6]")
	WebElement durationOfLivingInMonths4;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[7]")
	WebElement durationOfLivingInMonths5;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[8]")
	WebElement durationOfLivingInMonths6;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[9]")
	WebElement durationOfLivingInMonths7;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[10]")
	WebElement durationOfLivingInMonths8;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[11]")
	WebElement durationOfLivingInMonths9;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[12]")
	WebElement durationOfLivingInMonths10;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[5]/div[3]/div[3]/select/option[2]")
	WebElement durationOfLivingInMonths11;
	
	/* Continue Button on Address Details Page */
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div/div[2]/input")
	WebElement continueButtonAddressPage;
	
	/* Previous Button on Address Details Page */
	
	@FindBy(how = How.XPATH, using = ".//*[@id='uiViewDiv']/div/div[1]/div[2]/div[2]/div/form/div[6]/div/div[1]/input")
	WebElement previousButtonAddressPage;
	
	
	/***************************************METHODS******************************************/
	
	/*Select Home status*/
	public void clickHomeStatus(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(homeStatus, driver, extentLogger, extent, step, className);
	}
	/*Select Home status Tenant*/
	public void selectHomeStatustenant(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(homeStatusTenant, driver, extentLogger, extent, step, className);
	}
	/*Enter Building number*/
	public void enterBuildingNumber(String buildingnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, buildingNumber, driver, extentLogger, extent, buildingnumber, className);
	}
	/*Enter Apartment number*/
	public void enterAppartmentNumber(String appartmentnumber, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, appartmnetNumber, driver, extentLogger, extent, appartmentnumber, className);
	}
	/*Enter Street Name*/
	public void enterStreetName(String streetname, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, streetName, driver, extentLogger, extent, streetname, className);
	}
	/*Enter Town/City*/
	public void enterTownOrCity(String towncity, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, townCity, driver, extentLogger, extent, towncity, className);
	}
	/*Enter Postal Code*/
	public void enterPostalCode(String postcode, ExtentTest extentLogger, ExtentReports extent, String step,
			String className) throws Exception {
		CustomWebElement.sendKeys(step, postalCode, driver, extentLogger, extent, postcode, className);
	}
	
	/*Click "Year" for How long have you lived there*/
	public void clickDurationYearhowlong(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(durationOfLivingInYear, driver, extentLogger, extent, step, className);
	}
	/*Select Year*/
	public void selectDurationYearHowLong7(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(durationOfLivingInYear7, driver, extentLogger, extent, step, className);
	}
	/*Click Months for How long have you lived there */
	public void clickDurationMonthsHowLong(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(durationOfLivingInMonths, driver, extentLogger, extent, step, className);
	}
	/*Select Months*/
	public void selectDurationMonthsHowLong6(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(durationOfLivingInMonths6, driver, extentLogger, extent, step, className);
	}
	/*Click on Continue Button on 	address details page*/
	public void clickContinueOnAD(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(continueButtonAddressPage, driver, extentLogger, extent, step, className);
	}

}
