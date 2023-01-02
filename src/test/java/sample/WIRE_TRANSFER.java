package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PAYTMPE_POR.DASHBOARDPAGE;

import PAYTMPE_POR.WIRE_TRASFER_PAGE;
import Sample_Util.BASECLASS_ATEST;
import Sample_Util.DATA_PROVIDERS;

public class WIRE_TRANSFER extends BASECLASS_ATEST {
	
	@Test(dataProvider = "WIREMONEY")
	public void WIRETRANS( String U_value1, String U_accno1,String U_name,String U_amount1,String Note) {
		
		DASHBOARDPAGE UDP1=new DASHBOARDPAGE(driver);
		UDP1.User_WireTransferLink();
		WIRE_TRASFER_PAGE  WTP=new WIRE_TRASFER_PAGE(driver);
		
		WTP.User_OTHER_BANKLink(U_value1);
		WTP.user_account_numberLink(U_accno1);
		WTP.User_holder_nameLink(U_name);
		WTP.User_amountLink(U_amount1);
		WTP.User_NoteLink(Note);
		WTP.User_SubmitLink();
	}
	
	@DataProvider(name = "WIREMONEY")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet4");

}
}
