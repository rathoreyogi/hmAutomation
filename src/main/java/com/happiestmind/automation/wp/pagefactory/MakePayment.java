package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakePayment {
	
	WebDriver driver;

	public MakePayment(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Select Full Balance Check Box */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[4]/div/div[1]/div/label")
	WebElement fullBalanceCheckBox;
	
	/* Select Other Amount Check Box */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[8]/div/div[1]/div/label")
	WebElement otherAmountCheckBox;
	
	/* Other Amount edit Box */

	@FindBy(how = How.ID, using = "otherAmount")
	WebElement otherAmountEditBox;
	
	/* Cancel Button */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[11]/div[1]/input")
	WebElement cancelButton;
	
	/* Continue Button */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[11]/div[2]/input")
	WebElement continueButton;
	
	/* Confirm payment Cancel Button */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[11]/div[1]/input")
	WebElement confirmCancelButton;
	
	/* Confirm payment Continue Button */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[11]/div[2]/input")
	WebElement confirmContinueButton;
	
	/* Go to dashboard button */

	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[2]/div[2]/div/form/div[4]/div/input")
	WebElement goToDashboard;

}
