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
		logger.info("clicked on dashboard login button");
		UDP.User_SupportTicketsLink();
		logger.info("clicked on support ticket");
		Thread.sleep(1000);
		UDP.User_CreateNewTicketLink();
		logger.info("clicked on new ticket");
		CREATE_NEW_TICKET_PAGE UCNT=new CREATE_NEW_TICKET_PAGE(driver);
		UCNT.User_SubjectLink(email);
		logger.info("written email id");
		UCNT.User_messageLink(pass);
		logger.info("written password id");
		//UCNT.User_BrowseLink();
		UCNT.User_SubmitLink();
		logger.info(" clicked on submit id");
		UCNT.User_ticketcreatedsucessfully();
		logger.info(" clicked on tickt created suceesfully");
	}
	

	@DataProvider(name = "OrgData")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet1");
	
}
}
