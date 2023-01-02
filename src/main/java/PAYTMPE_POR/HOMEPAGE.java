package PAYTMPE_POR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class HOMEPAGE extends BaseClass {
//IMPLEMENTATION
	public HOMEPAGE(WebDriver driver) {
		super(driver);
		
	}

	//DECLARATION
	
	@FindBy(xpath="//a[.=' Sign In']")
	WebElement User_SigninLink;
	
	//UTILIZATION
	public void User_SigninLink() {
		User_SigninLink.click();
	}
}
