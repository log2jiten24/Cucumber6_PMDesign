package seleniumcodingchallenge;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCapabilities_Selenium {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		//get all the capabilites of the ChromeDriver 
		Capabilities capab = driver.getCapabilities();
		
		Map<String , Object> myCap = capab.asMap() ;
		
		System.out.println ("Driver capabilities :" + myCap) ;
		
//		Driver capabilities :{acceptInsecureCerts=false, browserName=chrome, browserVersion=96.0.4664.45, chrome={chromedriverVersion=96.0.4664.45 
//				(76e4c1bb2ab4671b8beba3444e61c0f17584b2fc-refs/branch-heads/4664@{#947}), 
//				userDataDir=C:\Users\ACER\AppData\Local\Temp\scoped_dir23896_37456343}, goog:chromeOptions={debuggerAddress=localhost:53472}, j
//				avascriptEnabled=true, networkConnectionEnabled=false, pageLoadStrategy=normal, platform=WINDOWS, platformName=WINDOWS, 
//				proxy=Proxy(), setWindowRect=true, strictFileInteractability=false, timeouts={implicit=0, pageLoad=300000, script=30000},
//				unhandledPromptBehavior=dismiss and notify, 
//				webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true, webauthn:virtualAuthenticators=true}

	}

}
