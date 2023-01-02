package PAYTMPE_POR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Sample_Util.BaseClass;


public class DASHBOARDPAGE extends BaseClass {

	public DASHBOARDPAGE(WebDriver driver) {
		super(driver);
		//http://paytmpe.qagithub.xyz/
	}
	
	
	//declaration
	//test-1
	@FindBy(xpath="//a[text()[normalize-space()='Dashboard']]")
	WebElement User_DashboardLink;
	
	//test-2
	@FindBy(xpath="//a[text()[normalize-space()='Send Money']]")
	WebElement User_SendMoneyLink;
	
	
	//test-3
	@FindBy(xpath="//div[@class='lines']")
	WebElement User_LinesLink;
	
	//test-4
	
	@FindBy(xpath="//a[text()[normalize-space()='Exchange Money']]")
	WebElement User_ExchangeMoneyLink;
	
	//test-5
	
	@FindBy(xpath="//a[text()[normalize-space()='Wire Transfer']]")
	WebElement User_WireTransferLink;
	
	//test-6
	
	@FindBy(xpath="//a[text()[normalize-space()='Payment Request']]")
	WebElement User_PaymentRequestLink;
	
	//test-7
	
	@FindBy(xpath="//a[text()[normalize-space()='Deposit Money']]")
	WebElement User_DepositMoneyLink;
	
	
	//test-8
	
	
	@FindBy(xpath="//a[text()[normalize-space()='Withdraw Money']]")
	WebElement WithdrawMoneyLink;
	
	
	//test-9
	
	@FindBy(xpath="//a[text()[normalize-space()='Loans']]")
	WebElement User_LoansLink;
	
	//test-10
	
	@FindBy(xpath="//a[text()[normalize-space()='Fixed Deposit']]")
	WebElement User_FixedDepositLink;
	
	//test-11
		@FindBy(xpath="//a[text()[normalize-space()='Support Tickets']]")
		WebElement User_SupportTicketsLink;
		
		//test-11-1
		@FindBy(xpath="//a[.='Create New Ticket']")
		WebElement User_CreateNewTicketLink;
		
		//test-11-2
		//test-11-3
		
		
		//test-12
		@FindBy(xpath="(//a[@data-toggle='dropdown'])[2]")
		WebElement User_dropdownLinkMenu;
		
		
		//test-13
		@FindBy(xpath="//a[text()[normalize-space()='Transactions Report']]")
		WebElement User_TransactionsReportLink;
		
		//test-14
		
		@FindBy(xpath="//a[contains(.,'Profile Overview')]")
		WebElement User_ProfileOverviewLink;
		
		//test-15
		
		@FindBy(xpath="//a[contains(.,'Profile Settings')]")
		WebElement User_ProfileSettingsLink;
		
		//test-16
		
		@FindBy(xpath="//a[contains(.,'Change Password')]")
		WebElement User_ChangePasswordLink;
		
		//test-17
		
		@FindBy(xpath="//a[contains(.,'Logout')]")
		WebElement User_LogoutLink;
		
		
		//test-18
		
		
		//@FindBy(xpath="//a[text()[normalize-space()='Dashboard']]")
		//WebElement User_DashboardLink;
		
		
		
		
		//utilzation
		public void  User_LogoutLink() {
			   JavascriptExecutor executor = (JavascriptExecutor) driver;
			    executor.executeScript("arguments[0].click();", User_LogoutLink);
			//User_LogoutLink.click();
		}
		
		public void  User_ChangePasswordLink() {
			User_ChangePasswordLink.click();
		}
		
		public void  User_ProfileSettingsLink() {
			User_ProfileSettingsLink.click();
		}
		
		public void  User_ProfileOverviewLink() {
			User_ProfileOverviewLink.click();
		}
		
		
		public void  User_dropdownLinkMenu() {
			User_dropdownLinkMenu.click();
		}
		
		
		public void  User_TransactionsReportLink() {
			User_TransactionsReportLink.click();
		}
		
		
		public void  User_SupportTicketsLink() {
			
			  User_SupportTicketsLink.click();
			
		}
		
		
		public void  User_CreateNewTicketLink() {
			
			User_CreateNewTicketLink.click();
			
		}
		
		
		
		public void  User_FixedDepositLink() {
			User_FixedDepositLink.click();
		}
		
		
		public void  User_LoansLink() {
			User_LoansLink.click();
		}
		
		
		public void  WithdrawMoneyLink() {
			WithdrawMoneyLink.click();
		}
		
		
		public void  User_DepositMoneyLink() {
			User_DepositMoneyLink.click();
		}
		
		
		public void  User_PaymentRequestLink() {
			User_PaymentRequestLink.click();
		}
		
		
		public void  User_WireTransferLink() {
			User_WireTransferLink.click();
		}
		
		
		public void  User_ExchangeMoneyLink() {
			User_ExchangeMoneyLink.click();
		}
		
		
		public void  User_SendMoneyLink() {
			User_SendMoneyLink.click();
		}
		
		
		public void  User_DashboardLink() {
			User_DashboardLink.click();
		}
		
		
		public void  User_LinesLink() {
			User_LinesLink.click();
		}
		

		
		
		
		
		
	
	

}
