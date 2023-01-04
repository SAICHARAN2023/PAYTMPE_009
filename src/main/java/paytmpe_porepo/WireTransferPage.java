package paytmpe_porepo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;

public class WireTransferPage extends BaseClass{

	public WireTransferPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//a[contains(.,'Wire Transfers')]")
	WebElement Admin_WireTransfer;
	
	public void Admin_WireTransfer() {
		Admin_WireTransfer.click();
	}
	
	@FindBy(xpath="//a[contains(.,'Support Tickets')]")
	WebElement Admin_SupportTickets;
	
	
	@FindBy(xpath="//a[contains(.,'Pending Tickets')]")
	WebElement Admin_PendingTickets;
	
	
	@FindBy(xpath="(//button[.=' Delete'])[2]")
	WebElement Admin_Deletetransfer;
	
	@FindBy(xpath="//button[text()='Yes, delete it!']")
	WebElement Admin_yesdeleteit;
	
	public void Admin_yesdeleteit() {
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();",Admin_yesdeleteit);
		
	}
	
	@FindBy(xpath="(//td[@class='dtr-control'])[1]")
	WebElement Admin_Deletecontrol;
	
	public void Admin_SupportTickets() {
		
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();",Admin_SupportTickets);
		
	}
	
	public void Admin_PendingTickets() {
		
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();",	Admin_PendingTickets);
		
	}
	
	public void Admin_Deletetransfer() {
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();",Admin_Deletetransfer);
	
	}
	
	public void  Admin_Deletecontrol() {
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", Admin_Deletecontrol);
		
	}
	
			
	
	
			@FindBy(xpath="(//a[contains(.,' Reject')])[1]")
			WebElement Admin_WireTransferReject;
			
			public void Admin_WireTransferreject() {
				
				  JavascriptExecutor executor = (JavascriptExecutor) driver;
				    executor.executeScript("arguments[0].click();", Admin_WireTransferReject);
				// Admin_WireTransferReject.click();
			}

}
