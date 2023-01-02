package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAYTMPE_POR.DASHBOARDPAGE;

import PAYTMPE_POR.HOMEPAGE;
import PAYTMPE_POR.LOGINPAGE;

public class Login {

	
	public static void  main(String args[]) throws InterruptedException {
	 WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://paytmpe.qagithub.xyz/");
	driver.manage().window().maximize();
	HOMEPAGE HP=new HOMEPAGE(driver);
	HP.User_SigninLink();
	LOGINPAGE LP=new LOGINPAGE(driver);
	LP.User_EmailLink("wngal46@gmail.com");
	LP.User_PasswordLink("SAICHARAN");
	LP.User_SubmitLink();
	
	DASHBOARDPAGE DBP=new DASHBOARDPAGE(driver);
	DBP.User_ExchangeMoneyLink();
	

	DBP.User_dropdownLinkMenu();
	Thread.sleep(3000);
	DBP.User_LogoutLink();
	Thread.sleep(1000);
	driver.close();
}
}
