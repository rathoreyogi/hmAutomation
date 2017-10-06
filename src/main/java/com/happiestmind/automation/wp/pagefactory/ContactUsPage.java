package com.happiestmind.automation.wp.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage {
	
	
	WebDriver driver;

	public ContactUsPage(WebDriver local_driver) {
		super();
		this.driver = local_driver;
	}

	/* Contact Us navigation button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[1]/nav/ul/li[1]/span/i")
	WebElement contactUsLink;
	
	/* Chat with us navigation button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[1]/nav/ul/li[2]/span/i")
	WebElement chatWithUsLink;
	
	/* Email us navigation button */
	@FindBy(how = How.XPATH, using = "//*[@id='uiViewDiv']/div/div[1]/div[1]/nav/ul/li[3]/span/i")
	WebElement emailUsLink;
	
	/* Chat with our experts button */
	@FindBy(how = How.XPATH, using = "//*[@id='chatWithUs']/div/div/div/div[2]/div/input")
	WebElement chatWithOurExpertsButton;
	
	/**Contact Us fields**/
	/* Reason for contacting us */
	@FindBy(how = How.NAME, using = "contactreason")
	WebElement contactReason;
	/*Option 1*/
	@FindBy(how = How.XPATH, using = "//*[@id='sendemail']/div[2]/div/select/option[3]")
	WebElement contactReason1;
	/*Option 2*/
	@FindBy(how = How.XPATH, using = "//*[@id='sendemail']/div[2]/div/select/option[4]")
	WebElement contactReason2;
	/*Option 3*/
	@FindBy(how = How.XPATH, using = "//*[@id='sendemail']/div[2]/div/select/option[5]")
	WebElement contactReason3;
	
	/* First Name */
	@FindBy(how = How.NAME, using = "firstName")
	WebElement firstName;
	
	/* Last Name */
	@FindBy(how = How.NAME, using = "lastName")
	WebElement lastName;
	
	/* EMAIL */
	@FindBy(how = How.NAME, using = "email")
	WebElement email;
	
	/* Phone Number */
	@FindBy(how = How.NAME, using = "mobileNo")
	WebElement mobileNo;
	
	/* Province */
	@FindBy(how = How.NAME, using = "province")
	WebElement province;
	
	@FindBy(how = How.XPATH, using = "//*[@id='sendemail']/div[5]/div/select/option[3]")
	WebElement provinceOntario;
	
	/* Enter Your Comments */
	@FindBy(how = How.ID, using = "textArea")
	WebElement enterYourComments;
	
	/* Send Button */
	@FindBy(how = How.XPATH, using = "//*[@id='sendemail']/div[7]/div/input")
	WebElement sendButton;

}
