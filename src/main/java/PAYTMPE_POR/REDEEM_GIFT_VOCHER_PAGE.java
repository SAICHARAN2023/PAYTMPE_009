package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class REDEEM_GIFT_VOCHER_PAGE extends BaseClass {

	public REDEEM_GIFT_VOCHER_PAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//input[@name='code']")
	WebElement user_codeLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	public void  user_codeLink(String code) {
		 user_codeLink.sendKeys(code);
	}
	
}
