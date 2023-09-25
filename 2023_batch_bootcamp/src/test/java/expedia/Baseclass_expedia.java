package expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Baseclass_expedia {
	public WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.expedia.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
	 
	 }
	  

	
     @Test
     public void f()   {
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     POM_expidea expidea =new POM_expidea (driver);
     expidea.flights_tab();
     expidea.Round_trip();
     expidea.Leaving_from();
     expidea.Going_to();
     expidea.chose_dates(); 
     expidea.Traveler();
}
 
     @AfterClass
     public void afterClass() throws InterruptedException {
     Thread.sleep(5000);
    	 driver.close();
     }

}
