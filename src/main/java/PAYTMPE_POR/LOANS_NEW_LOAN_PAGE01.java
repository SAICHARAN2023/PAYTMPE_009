package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class LOANS_NEW_LOAN_PAGE01  extends BaseClass{

	public LOANS_NEW_LOAN_PAGE01(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//span[@class='fake_datepicker']

	@FindBy(xpath="//span[@role='presentation']")
	WebElement User_presentationLink;
	
	@FindBy(xpath="//select[@name='currency_id']")
	WebElement user_currency_idLink;
	
	@FindBy(xpath="//span[@class='fake_datepicker']")
	WebElement user_fake_datepickerLink;
	
	@FindBy(xpath="//input[@name='applied_amount']")
	WebElement User_appiedamountLink;
	
	@FindBy(xpath="//button[text()='Browse']")
	WebElement  User_BrowsefileLink;
	
	
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement User_descriptionLink;
	
	@FindBy(xpath="//textarea[@name='remarks']")
	WebElement User_remarksLink;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement User_submitLink;
	
	
	
	public void User_SubmitLink() {
		User_submitLink.click();
	}
	
	
	public void User_remarksLink(String remark) {
		User_remarksLink.sendKeys(remark);
	}
	
	
	public void user_fake_datepickerLink() {
		user_fake_datepickerLink.click();
	}
	
	
	public void user_currency_idLink() {
		user_currency_idLink.click();
	}
	
	
	public void User_appiedamountLink(String applymount) {
		User_appiedamountLink.sendKeys(applymount);
	}
	
	
	public void User_BrowsefileLink() {
		User_BrowsefileLink.click();
	}
	
	
	public void User_descriptionLink(String Desc) {
		User_descriptionLink.sendKeys(Desc);
	}
	
	
	public void User_presentationLink() {
		User_presentationLink.click();
	}
	

}
