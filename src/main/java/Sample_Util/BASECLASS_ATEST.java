package Sample_Util;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PAYTMPE_POR.DASHBOARDPAGE;
import PAYTMPE_POR.HOMEPAGE;
import PAYTMPE_POR.LOGINPAGE;


//https://github.com/SAICHARAN2023/PAYTMPE_001


public class BASECLASS_ATEST {
	
	public static WebDriver driver;
       
	public static DATA_PROVIDERS UDP=new DATA_PROVIDERS();

	public static EXTENT_REPORTS UER=new EXTENT_REPORTS();
	public static WEBDRIVERUTILITY UWDU =new WEBDRIVERUTILITY();
	
	   
		public ResourceBundle rb;
		public Logger logger;
		
		String br;
		@BeforeClass
		public void setup() {
			logger=LogManager.getLogger(this.getClass());
			rb=ResourceBundle.getBundle("config");
			String br=rb.getString("browser");
			
			if(br.equals("chrome")) {
			driver=new ChromeDriver();
			}else if(br.equals("firefox")) {
				driver=new FirefoxDriver();
			}else if(br.equals("edge")){
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(rb.getString("baseurl"));
			
		}
		
		@BeforeMethod
		public void login() {
			HOMEPAGE UHP=new HOMEPAGE(driver);
			UHP.User_SigninLink();
			LOGINPAGE ULP=new  LOGINPAGE(driver);
			
			ULP.User_EmailLink(rb.getString("email"));
			ULP.User_PasswordLink(rb.getString("pass"));
			ULP.User_SubmitLink();
		}
		
		@AfterMethod
		public void logout() {
			
			DASHBOARDPAGE UDP=new DASHBOARDPAGE(driver);
			UDP.User_dropdownLinkMenu();
			UDP.User_LogoutLink();
			}
		
		@AfterClass
		public void Teardown() {
			driver.close();
		}
	
		
		}


