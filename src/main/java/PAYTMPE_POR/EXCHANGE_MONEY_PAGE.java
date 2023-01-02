package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Sample_Util.BaseClass;
import Sample_Util.WEBDRIVERUTILITY;

public class EXCHANGE_MONEY_PAGE extends BaseClass {

	public EXCHANGE_MONEY_PAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WEBDRIVERUTILITY WDU=new WEBDRIVERUTILITY();
	
	@FindBy(xpath="//select[@name='currency_from']")
	WebElement User_Currency_FromLink;
	

	
	//input[@role='textbox']
	
	@FindBy(xpath="//select[@name='currency_to']")
	WebElement User_Currency_ToLink;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement User_amountLink;
	
	@FindBy(xpath="//input[@id='exchange_amount']")
	WebElement User_exchange_amountLink;
	
	@FindBy(xpath="//textarea[@name='note']")
	WebElement User_noteLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	

	
	
	public void User_NoteLink(String note) {
		User_noteLink.sendKeys(note);
	}
	
	
	public void User_exchange_amountLink(String exchangeamount) {
		User_exchange_amountLink.sendKeys(exchangeamount);;
	}
	
	
	public void User_amountLink(String amount) {
		User_amountLink.sendKeys(amount);
	}
	
	public void  User_Currency_FromLink(String value1) {
	WDU.Handledropdownby(value1, User_Currency_FromLink);	
	}
	
	
	public void User_Currency_ToLink(String value2) {
	WDU.Handledropdownby(value2, User_Currency_ToLink);
		//user_presentationLink.click();
	
	}
	
}
