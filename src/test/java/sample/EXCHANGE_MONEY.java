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
		EXCHANGE_MONEY_PAGE  SMP=new EXCHANGE_MONEY_PAGE(driver);
		
		SMP.User_Currency_FromLink(U_value1);
		SMP.User_Currency_ToLink(U_value2);
		SMP.User_amountLink(U_amount1);
		SMP.User_NoteLink(Note);
		SMP.User_SubmitLink();
	}
	
	@DataProvider(name = "EXCHANGEMONEY")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet3");

}
}
