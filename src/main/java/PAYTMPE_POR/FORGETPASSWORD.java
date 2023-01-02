package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class FORGETPASSWORD  extends BaseClass{

	public FORGETPASSWORD(WebDriver driver) {
		super(driver);
		
	}
	
	//declaration
	@FindBy(xpath="//a[text()[normalize-space()='Forgot Password?']]")
	WebElement User_ForgetPasswordLink;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement User_EmailLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_SubmitLink;
	
	//utilization:
	
	public void User_ForgetPasswordLink() {
		User_ForgetPasswordLink.click();
	}
	
	
	public void User_EmailLink(String email) {
		User_EmailLink.sendKeys(email);
	}
	
	public void User_SubmitLink() {
		User_SubmitLink.click();
	}
	
	
	

}
