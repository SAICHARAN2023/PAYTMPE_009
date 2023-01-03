package sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PAYTMPE_POR.DASHBOARDPAGE;
import PAYTMPE_POR.NEW_PAYMENT_REQPAGE;
import PAYTMPE_POR.SEND_MONEY_PAGE;
import Sample_Util.BASECLASS_ATEST;
import Sample_Util.DATA_PROVIDERS;

public class PAYMENT_REQUEST extends BASECLASS_ATEST {
	
	
	@Test(dataProvider = "MONEYREQ")
	public void MONEYREQ(String U_accno1, String U_value1,String U_amount1,String Note ) {
		
		DASHBOARDPAGE UDP1=new DASHBOARDPAGE(driver);
		UDP1.User_PaymentRequestLink();
		logger.info("clicked on  money request");
		UDP1.User_newPaymentLink();
		logger.info("clicked on  money New Payment");
		NEW_PAYMENT_REQPAGE NPR=new NEW_PAYMENT_REQPAGE(driver);
		
		NPR.user_receiver_accountLink(U_accno1);
		logger.info("written accno");
		NPR.User_Currency_idLink(U_value1);
		logger.info("written currency id");
		NPR.User_amountLink(U_amount1);
		logger.info("written currency id_2");
		NPR.User_descriptionLink(Note);
		logger.info("written notes paragraph");
		NPR.User_SubmitLink();
		logger.info("clicked on submit");
	}
	
	
	@DataProvider(name = "MONEYREQ")
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{ 
		DATA_PROVIDERS dp=new DATA_PROVIDERS();
		return dp.readMultipleDataFromExcel("Sheet5");
	
}


	
}
