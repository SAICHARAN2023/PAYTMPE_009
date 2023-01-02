package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class LOGINPAGE extends BaseClass{

	public LOGINPAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//DECLARATION
	
	@FindBy(xpath="//input[@name='email']")
	WebElement User_EmailLink;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement User_PasswordLink;
	
	@FindBy(xpath="//label[@for='remember']")
	WebElement User_RememberLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_SubmitLink;
	
	@FindBy(xpath="//a[text()[normalize-space()='Forgot Password?']]")
	WebElement User_ForgetPasswordLink;
	
	//UTILIZATION
	public void User_EmailLink(String email) {
		User_EmailLink.sendKeys(email);
	}
	
	public void User_PasswordLink(String pwd) {
		User_PasswordLink.sendKeys(pwd);
	}
	
	public void User_RememberLink() {
		User_RememberLink.click();
	}
	
	public void User_SubmitLink() {
		User_SubmitLink.click();
	}
	
	
	public void User_ForgetPasswordLink() {
		User_ForgetPasswordLink.click();
	}
	

}
