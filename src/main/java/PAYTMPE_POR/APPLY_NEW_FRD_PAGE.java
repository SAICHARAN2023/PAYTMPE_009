package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class APPLY_NEW_FRD_PAGE extends BaseClass {

	public APPLY_NEW_FRD_PAGE(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@name='deposit_amount']")
	WebElement user_deposit_amountLink;
	
	@FindBy(xpath="(//span[@role='presentation']//b)[1]")
	WebElement User_presentationLink;
	
	@FindBy(xpath="(//span[@role='presentation'])[2]")
	WebElement User_presentationLink_2;
	
	@FindBy(xpath="//input[@name='attachment']")
	WebElement User_attachmentLink;
	
	@FindBy(xpath="//textarea[@name='remarks']")
	WebElement User_remarksLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	
	public void  user_deposit_amountLink(String dep_amount) {
		 user_deposit_amountLink.sendKeys(dep_amount);
	}
	
	
	public void User_presentationLink_2() {
		User_presentationLink_2.click();
	}
	
	
	public void  User_attachmentLink() {
		 User_attachmentLink.click();
	}
	
	
	public void User_remarksLink(String remarks) {
		User_remarksLink.sendKeys(remarks);
	}
	
	
	
	
	public void User_presentationLink() {
		User_presentationLink.click();
	}
	

}
