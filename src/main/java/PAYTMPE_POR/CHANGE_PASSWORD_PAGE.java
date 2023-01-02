package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class CHANGE_PASSWORD_PAGE extends BaseClass{

	public CHANGE_PASSWORD_PAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='oldpassword']")
	WebElement User_OldpasswordLink;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement User_PasswordLink;
	@FindBy(xpath="//input[@name='password_confirmation']")
	WebElement User_password_confirmationLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	public void User_OldpasswordLink(String opwd) {
		User_OldpasswordLink.sendKeys(opwd);
	}
	
	public void User_PasswordLink(String pwd) {
		User_PasswordLink.sendKeys(pwd);
	}
	
	public void User_password_confirmationLink(String cpwd) {
		User_password_confirmationLink.sendKeys(cpwd);
	}
	
	
	

}
