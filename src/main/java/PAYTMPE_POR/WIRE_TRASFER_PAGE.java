package PAYTMPE_POR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;
import Sample_Util.WEBDRIVERUTILITY;

public class WIRE_TRASFER_PAGE extends BaseClass {

	public WIRE_TRASFER_PAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WEBDRIVERUTILITY WDU=new WEBDRIVERUTILITY();

	
	@FindBy(xpath="//select[@name='bank']")
	WebElement User_OTHER_BANKLink;

	@FindBy(xpath="//input[@name='td[account_number]']")
	WebElement user_account_numberLink;
	
	@FindBy(xpath="//input[@name='td[account_holder_name]']")
	WebElement User_holder_nameLink;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement User_amountLink;
	
	@FindBy(xpath="//textarea[@name='note']")
	WebElement User_noteLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	public void User_SubmitLink() {
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("arguments[0].click();", User_submitLink);
		//User_submitLink.click();
	}
	
	
	public void User_NoteLink(String note) {
		User_noteLink.sendKeys(note);
	}
	
	
	public void user_account_numberLink(String ac_no) {
		user_account_numberLink.sendKeys(ac_no);
	}
	
	public void  User_holder_nameLink(String holder_name) {
		 User_holder_nameLink.sendKeys(holder_name);
	}
	
	
	public void User_amountLink(String amount) {
		User_amountLink.sendKeys(amount);
	}
	
	
	
	
	public void User_OTHER_BANKLink(String text) {
		WDU.Handledropdownby(text, User_OTHER_BANKLink);
		
	}
	

}
