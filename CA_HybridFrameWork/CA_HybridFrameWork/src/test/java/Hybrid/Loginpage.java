package Hybrid;

import org.openqa.selenium.WebDriver;

public class Loginpage {

WebDriver driver;
	
	public Loginpage(WebDriver driver )
	{
		this.driver =driver;
	}
	
	
public void LoginToCrm() throws InterruptedException 
{
		
	Thread.sleep(2000);
	Helperclass.captureScreenshots(driver);

	}
}
