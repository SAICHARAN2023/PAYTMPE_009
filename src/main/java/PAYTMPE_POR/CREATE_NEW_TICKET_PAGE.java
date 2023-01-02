package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class CREATE_NEW_TICKET_PAGE extends BaseClass{

	public CREATE_NEW_TICKET_PAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	

	@FindBy(xpath="//input[@name='subject']")
	WebElement User_SubjectLink;
	
	@FindBy(xpath="//button[text()='Browse']")
	WebElement User_BrowseLink;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement User_messageLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	
	public void  User_messageLink(String msg) {
		User_messageLink.sendKeys(msg);
	}
	
	
	public void  User_BrowseLink() {
		 User_BrowseLink.click();
	}
	
	
	public void  User_SubjectLink(String subject) {
		User_SubjectLink.sendKeys(subject);
	}
	
	

	

}
