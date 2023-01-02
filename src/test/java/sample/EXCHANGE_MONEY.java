package sample;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PAYTMPE_POR.DASHBOARDPAGE;
import PAYTMPE_POR.EXCHANGE_MONEY_PAGE;

import Sample_Util.BASECLASS_ATEST;
import Sample_Util.DATA_PROVIDERS;
public class EXCHANGE_MONEY extends BASECLASS_ATEST {
	
	@Test(dataProvider = "EXCHANGEMONEY")
	public void EXCHANGEMONEY( String U_value1, String U_value2,String U_amount1,String Note ) {
		
		DASHBOARDPAGE UDP1=new DASHBOARDPAGE(driver);
		UDP1.User_ExchangeMoneyLink();
		logger.info("clicked on exchange money");
		EXCHANGE_MONEY_PAGE  SMP=new EXCHANGE_MONEY_PAGE(driver);
		
		SMP.User_Currency_FromLink(U_value1);
		logger.info("clicked on currency_01");
		SMP.User_Currency_ToLink(U_value2);
		logger.info("clicked on currency _02");
		SMP.User_amountLink(U_amount1);
		logger.info("clicked on amount to be exchange");
		SMP.User_NoteLink(Note);
		logger.info("write on note to be");
		SMP.User_SubmitLink();
		logger.info("clicked on submit button");
	}
	
	@DataProvider(name = "EXCHANGEMONEY")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet3");

}
}
