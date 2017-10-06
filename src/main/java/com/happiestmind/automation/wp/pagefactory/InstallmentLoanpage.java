package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InstallmentLoanpage {
	WebDriver driver;

	public InstallmentLoanpage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Installment Loan button */
	@FindBy(how = How.ID, using = "installmentLoanButton")
	WebElement installmentLoanButton;
}
