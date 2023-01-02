package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import PAYTMPE_POR.CREATE_NEW_TICKET_PAGE;
import PAYTMPE_POR.DASHBOARDPAGE;

import Sample_Util.BASECLASS_ATEST;
import Sample_Util.DATA_PROVIDERS;



public class DASHBOARD_01 extends BASECLASS_ATEST {

	
	@Test(dataProvider = "OrgData")
	public void   SUPPORTTICKET(String email,String pass) throws InterruptedException {
		DASHBOARDPAGE UDP=new DASHBOARDPAGE(driver);
		UDP.User_DashboardLink();
		UDP.User_SupportTicketsLink();
		Thread.sleep(1000);
		UDP.User_CreateNewTicketLink();
		
		CREATE_NEW_TICKET_PAGE UCNT=new CREATE_NEW_TICKET_PAGE(driver);
		UCNT.User_SubjectLink(email);
		UCNT.User_messageLink(pass);
		//UCNT.User_BrowseLink();
		UCNT.User_SubmitLink();
		
	}
	

	@DataProvider(name = "OrgData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet1");
	
}
}
