package Admin_Testcase;






import org.testng.annotations.Test;

import Sample_Util.ADMIN_BASECLASS;
import paytmpe_porepo.WireTransferPage;


public class AddUser extends ADMIN_BASECLASS{

	@Test
	public void Wiretrasfer() throws InterruptedException {
		while(true) {
	WireTransferPage WTP=new WireTransferPage(driver);
	WTP.Admin_WireTransfer();
	Thread.sleep(3000);
	WTP.Admin_WireTransferreject();
	/*WTP.Admin_SupportTickets();

	WTP.Admin_PendingTickets();
	Thread.sleep(2000);
   WTP.Admin_Deletecontrol();
  
	WTP.Admin_Deletetransfer();
	WTP.Admin_yesdeleteit();*/
		}
}
}
