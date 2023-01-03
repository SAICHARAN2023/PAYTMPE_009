package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Sample_Util.BaseClass;
import Sample_Util.WEBDRIVERUTILITY;

public class SEND_MONEY_PAGE extends BaseClass {

	public SEND_MONEY_PAGE(WebDriver driver) {
		super(driver);
		
	}
	//*[@id="main_alert"]
	WEBDRIVERUTILITY WDU=new WEBDRIVERUTILITY();
	
	
	@FindBy(xpath="//*[@id=\"main_alert\"]']")
	WebElement user_mainalertLink;
	
	@FindBy(xpath="//input[@name='user_account']")
	WebElement user_accountLink;
	
	
	@FindBy(xpath="//select[@name='currency_id']")
	WebElement User_Currency_idLink;
	
	//select[@name='currency_id']
	@FindBy(xpath="//input[@name='amount']")
	WebElement User_amountLink;
	
	@FindBy(xpath="//textarea[@name='note']")
	WebElement User_noteLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	
	@FindBy(xpath="//span[@class='msg']")
	WebElement User_ticketcreatedsucessfully;
	
	public void  User_MoneyTransferedsucessfully() {
		String p1=User_ticketcreatedsucessfully.getText();
		Assert.assertEquals(p1, "Money Transfered Successfully");
	}
	
	
	public void user_mainalertLink() {
		user_mainalertLink.click();
	}
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	
	public void User_NoteLink(String note) {
		User_noteLink.sendKeys(note);
	}
	
	
	public void user_AccountLink(String acno) {
		user_accountLink.sendKeys(acno);
	}
	
	
	public void User_amountLink(String amount) {
		User_amountLink.sendKeys(amount);
	}
	
	
	public void User_Currency_idLink(String text) {
		WDU.Handledropdownby(text, User_Currency_idLink);
		
	}
	

}
