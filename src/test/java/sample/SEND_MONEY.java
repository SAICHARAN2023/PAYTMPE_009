package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PAYTMPE_POR.DASHBOARDPAGE;
import PAYTMPE_POR.SEND_MONEY_PAGE;
import Sample_Util.BASECLASS_ATEST;
import Sample_Util.DATA_PROVIDERS;

public class SEND_MONEY extends BASECLASS_ATEST {
	
	
	@Test(dataProvider = "SENDMONEY")
	public void SENDMONEY(String U_accno1, String U_value1,String U_amount1,String Note ) {
		
		DASHBOARDPAGE UDP1=new DASHBOARDPAGE(driver);
		UDP1.User_SendMoneyLink();
		SEND_MONEY_PAGE  SMP=new SEND_MONEY_PAGE(driver);
		
		SMP.user_AccountLink(U_accno1);
		SMP.User_Currency_idLink(U_value1);
		SMP.User_amountLink(U_amount1);
		SMP.User_NoteLink(Note);
		SMP.User_SubmitLink();
	}
	
	
	@DataProvider(name = "SENDMONEY")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet2");
	
}

}
