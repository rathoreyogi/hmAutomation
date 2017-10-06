package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.happiestmind.automation.selenium.CustomWebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class EditProfile {
	
	WebDriver driver;

	public EditProfile(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}
	
	/***Personal Details***/
	/* Edit Personal detail button */
	@FindBy(how = How.ID, using = "editPersonalBtn")
	WebElement editPersonalBtn;
	
	/*First Name disabled*/
	@FindBy(how = How.NAME, using = "firstName")
	WebElement firstName;
	
	/*Date of birth disabled*/
	@FindBy(how = How.NAME, using = "dob")
	WebElement dob;
	
	/*SIN disabled*/
	@FindBy(how = How.NAME, using = "sin")
	WebElement sin;
	
	/*Marital status*/
	@FindBy(how = How.NAME, using = "maritalStatus")
	WebElement maritalStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[5]/div[2]/select/option[2]")
	WebElement maritalStatusSingle;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[5]/div[2]/select/option[3]")
	WebElement maritalStatusMarried;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[5]/div[2]/select/option[4]")
	WebElement maritalStatusDivorced;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[5]/div[2]/select/option[5]")
	WebElement maritalStatusWidowed;
	
	/*Number of dependents*/
	@FindBy(how = How.NAME, using = "numberOfDependents")
	WebElement numberOfDependents;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[5]/div[1]/select/option[2]")
	WebElement numberOfDependents0;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[5]/div[1]/select/option[3]")
	WebElement numberOfDependents1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[5]/div[1]/select/option[4]")
	WebElement numberOfDependents2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[5]/div[1]/select/option[5]")
	WebElement numberOfDependents3;
	
	/*Mobile phone number disabled*/
	@FindBy(how = How.ID, using = "phoneNumberId")
	WebElement mobilePhoneNumber;
	
	/*Home phone number*/
	@FindBy(how = How.NAME, using = "homePhoneNumber")
	WebElement homePhoneNumber;
	
	/*Email*/
	@FindBy(how = How.NAME, using = "email")
	WebElement email;
	
	/*Reason for loan*/
	@FindBy(how = How.NAME, using = "reasonForLoan")
	WebElement reasonForLoan;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[2]")
	WebElement reasonForLoan1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[3]")
	WebElement reasonForLoan2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[4]")
	WebElement reasonForLoan3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[5]")
	WebElement reasonForLoan4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[6]")
	WebElement reasonForLoan5;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[7]")
	WebElement reasonForLoan6;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[8]")
	WebElement reasonForLoan7;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[10]/div[2]/select/option[9]")
	WebElement reasonForLoan8;
	
	/*Highest level of education*/
	@FindBy(how = How.NAME, using = "education")
	WebElement hiestEducation;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[2]")
	WebElement higestLevelEducation1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[3]")
	WebElement higestLevelEducation2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[4]")
	WebElement higestLevelEducation3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[5]")
	WebElement higestLevelEducation4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[6]")
	WebElement higestLevelEducation5;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[7]")
	WebElement higestLevelEducation6;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[8]")
	WebElement higestLevelEducation7;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[11]/div[2]/select/option[9]")
	WebElement higestLevelEducation8;
	
	/*Have you failed to repay interest?*/
	@FindBy(how = How.NAME, using = "failedToPayLoans")
	WebElement failedToPayLoans;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[12]/div[2]/select/option[2]")
	WebElement failedToPayLoans1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[12]/div[2]/select/option[3]")
	WebElement failedToPayLoans2;
	
	/*How did you hear about us?*/
	@FindBy(how = How.ID, using = "knownBy")
	WebElement howDoYouHearAboutus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[2]")
	WebElement howDoYouHearAboutUs1;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[3]")
	WebElement howDoYouHearAboutUs2;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[4]")
	WebElement howDoYouHearAboutUs3;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[5]")
	WebElement howDoYouHearAboutUs4;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[6]")
	WebElement howDoYouHearAboutUs5;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[7]")
	WebElement howDoYouHearAboutUs6;

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[6]/div[13]/div[2]/select/option[8]")
	WebElement howDoYouHearAboutUs7;
	
	/*  */
	@FindBy(how = How.ID, using = "savePersonalBtn")
	WebElement savePersonalBtn;
	
	/***Address details***/
	/* Edit Address details button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[1]/div[2]/input")
	WebElement editAddressBtn;
	
	/*Home status*/
	@FindBy(how = How.NAME, using = "homeStatus")
	WebElement homeStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[2]/div[2]/select/option[2]")
	WebElement homeStatusTenant;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[2]/div[2]/select/option[3]")
	WebElement homeStatusOwner;
	
	/*Building number*/
	@FindBy(how = How.NAME, using = "buildingNumber")
	WebElement buildingNumber;
	
	/*Apartment number*/
	@FindBy(how = How.NAME, using = "apartmnetNumber")
	WebElement apartmnetNumber;
	
	/*Street name*/
	@FindBy(how = How.NAME, using = "streetName")
	WebElement streetName;
	
	/*Town/City*/
	@FindBy(how = How.NAME, using = "city")
	WebElement townOrCity;
	
	/*Province*/
	@FindBy(how = How.NAME, using = "province")
	WebElement province;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[7]/div[2]/select/option")
	WebElement selectProvince;
	
	/*Postal code*/
	@FindBy(how = How.ID, using = "postalCodeId")
	WebElement postalCodeId;
	
	/*How long you have lived here?*/
	/*YEAR*/
	@FindBy(how = How.NAME, using = "durationOfLivingInYear")
	WebElement durationOfLivingInYear;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[2]")
	WebElement durationOfLivingInYear0;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[3]")
	WebElement durationOfLivingInYear1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[4]")
	WebElement durationOfLivingInYear2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[5]")
	WebElement durationOfLivingInYear3;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[6]")
	WebElement durationOfLivingInYear4;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[7]")
	WebElement durationOfLivingInYear5;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[8]")
	WebElement durationOfLivingInYear6;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[9]")
	WebElement durationOfLivingInYear7;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[10]")
	WebElement durationOfLivingInYear8;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[11]")
	WebElement durationOfLivingInYear9;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[12]")
	WebElement durationOfLivingInYear10;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[1]/select/option[13]")
	WebElement durationOfLivingInYear10Plus;
	
	/*MONTH*/
	@FindBy(how = How.NAME, using = "durationOfLivingInMonths")
	WebElement durationOfLivingInMonths;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[2]")
	WebElement durationOfLivingInMonths0;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[3]")
	WebElement durationOfLivingInMonths1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[4]")
	WebElement durationOfLivingInMonths2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[5]")
	WebElement durationOfLivingInMonths3;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[6]")
	WebElement durationOfLivingInMonths4;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[7]")
	WebElement durationOfLivingInMonths5;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[8]")
	WebElement durationOfLivingInMonths6;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[9]")
	WebElement durationOfLivingInMonths7;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[10]")
	WebElement durationOfLivingInMonths8;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[11]")
	WebElement durationOfLivingInMonths9;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[12]")
	WebElement durationOfLivingInMonths10;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[8]/div[9]/div[2]/div[3]/select/option[13]")
	WebElement durationOfLivingInMonths11;
	
	
	/***Employment details***/
	/* Edit Employment details button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[1]/div[2]/input")
	WebElement editEmploymentBtn;
	
	/*Source of income*/
	@FindBy(how = How.NAME, using = "sourceOfIncome")
	WebElement sourceOfIncome;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[2]/div[2]/select/option[2]")
	WebElement sourceOfIncomeEmployed;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[2]/div[2]/select/option[3]")
	WebElement sourceOfIncomeSelfEmployed;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[2]/div[2]/select/option[4]")
	WebElement sourceOfIncomeRetiredPension;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[2]/div[2]/select/option[5]")
	WebElement sourceOfIncomeWorkersCompensation;
	
	/*Type of employment*/
	@FindBy(how = How.NAME, using = "typeOfEmployment")
	WebElement typeOfEmployment;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[3]/div[2]/select/option[2]")
	WebElement typeOfEmploymentFullTime;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[3]/div[2]/select/option[3]")
	WebElement typeOfEmploymentPartTime;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[3]/div[2]/select/option[4]")
	WebElement typeOfEmploymentContract;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[3]/div[2]/select/option[5]")
	WebElement typeOfEmploymentSeasonal;
	
	/*Employer name*/
	@FindBy(how = How.NAME, using = "employerName")
	WebElement employerName;
	
	/*Length of employment*/
	/*YEAR*/
	@FindBy(how = How.NAME, using = "lengthOfEmploymentInYear")
	WebElement lengthOfEmploymentInYear;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[2]")
	WebElement lengthOfEmploymentInYear0;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[3]")
	WebElement lengthOfEmploymentInYear1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[4]")
	WebElement lengthOfEmploymentInYear2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[5]")
	WebElement lengthOfEmploymentInYear3;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[6]")
	WebElement lengthOfEmploymentInYear4;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[7]")
	WebElement lengthOfEmploymentInYear5;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[8]")
	WebElement lengthOfEmploymentInYear6;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[9]")
	WebElement lengthOfEmploymentInYear7;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[10]")
	WebElement lengthOfEmploymentInYear8;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[11]")
	WebElement lengthOfEmploymentInYear9;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[12]")
	WebElement lengthOfEmploymentInYear10;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[1]/select/option[13]")
	WebElement lengthOfEmploymentInYear10Plus;

	/*MONTH*/
	@FindBy(how = How.NAME, using = "lengthOfEmploymentInMonths")
	WebElement lengthOfEmploymentInMonths;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[2]")
	WebElement lengthOfEmploymentInMonths0;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[3]")
	WebElement lengthOfEmploymentInMonths1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[4]")
	WebElement lengthOfEmploymentInMonths2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[5]")
	WebElement lengthOfEmploymentInMonths3;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[6]")
	WebElement lengthOfEmploymentInMonths4;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[7]")
	WebElement lengthOfEmploymentInMonths5;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[8]")
	WebElement lengthOfEmploymentInMonths6;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[9]")
	WebElement lengthOfEmploymentInMonths7;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[10]")
	WebElement lengthOfEmploymentInMonths8;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[11]")
	WebElement lengthOfEmploymentInMonths9;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[12]")
	WebElement lengthOfEmploymentInMonths10;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[5]/div[2]/div[3]/select/option[13]")
	WebElement lengthOfEmploymentInMonths11;
	
	/*How is your salary paid?*/
	@FindBy(how = How.NAME, using = "salaryType")
	WebElement howSalaryPaid;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[6]/div[2]/select/option[2]")
	WebElement howIsSalaryPaidDirectDeposit;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[6]/div[2]/select/option[3]")
	WebElement howIsSalaryPaidCheque;
	
	/*How often do you get paid?*/
	@FindBy(how = How.NAME, using = "frequencyOfSalaryPaid")
	WebElement howOftenSalaryPaid;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[7]/div[2]/select/option[2]")
	WebElement howOftenSalaryPaidMonthly;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[7]/div[2]/select/option[3]")
	WebElement howOftenSalaryPaidSemiMonthly;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[7]/div[2]/select/option[4]")
	WebElement howOftenSalaryPaidSemiWeekly;
	
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[10]/div[7]/div[2]/select/option[5]")
	WebElement howOftenSalaryPaidWeekly;
	
	
	/*Next pay date*/
	@FindBy(how = How.NAME, using = "nextPayDate")
	WebElement nextPayDate;
	
	/*Amount of last net pay (including tips if applicable)*/
	@FindBy(how = How.NAME, using = "amountOfLastPay")
	WebElement amountOfLastPay;
	
	/*Is a portion of your salary paid in cash (e.g. tips)?*/
	@FindBy(how = How.NAME, using = "paidByCash")
	WebElement paidByCash;
	
	@FindBy(how = How.XPATH, using = "//*[@id='paidByCash']/option[2]")
	WebElement portionSalaryPaidByCashYes;
	
	@FindBy(how = How.XPATH, using = "//*[@id='paidByCash']/option[3]")
	WebElement portionSalaryPaidByCashNo;
	
	/*How much of your net pay is paid in cash?*/
	@FindBy(how = How.NAME, using = "netPayInCash")
	WebElement howMuchPayInCash;
	
	/**Go to Dashboard**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[15]/div[1]/input")
	WebElement goToDashboard;
	
	/**Save Changes**/
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div/form/div/div[2]/div[15]/div[2]/input")
	WebElement saveChangesBtn;
	
	/** Dashboard navigation **/
	
	@FindBy(how = How.XPATH, using = "//*[@id='dashBoardMenu']/nav/ul/li[1]/a")
	WebElement dashboardlink;
	
	/********************************************* METHODS ***************************************/
	
	/* Click on Save Changes */
	public void clickSaveChangesBtn(ExtentTest extentLogger, ExtentReports extent, String step, String className)
			throws Exception {
		CustomWebElement.click(saveChangesBtn, driver, extentLogger, extent, step, className);
	}
	

}
