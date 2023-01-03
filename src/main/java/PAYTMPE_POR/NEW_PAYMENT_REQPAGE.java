package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;
import Sample_Util.WEBDRIVERUTILITY;

public class NEW_PAYMENT_REQPAGE extends BaseClass {

	public NEW_PAYMENT_REQPAGE(WebDriver driver) {
		super(driver);
		
	}
	
	WEBDRIVERUTILITY WDU=new WEBDRIVERUTILITY();
	
	@FindBy(xpath="//input[@name='receiver_account']")
	WebElement user_receiver_accountLink;
	
	@FindBy(xpath="//select[@name='currency_id']")
	WebElement User_Currency_idLink;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement User_amountLink;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement User_descriptionLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	
	public void user_receiver_accountLink(String rece_amount) {
		user_receiver_accountLink.sendKeys(rece_amount);
	}
	
	
	public void User_descriptionLink(String desc) {
		User_descriptionLink.sendKeys(desc);
	}
	
	
	public void User_amountLink(String amount) {
		User_amountLink.sendKeys(amount);
	}
	
	
	public void User_Currency_idLink(String text) {
		WDU.Handledropdownby(text, User_Currency_idLink);
		
	}
	
	
	

}
