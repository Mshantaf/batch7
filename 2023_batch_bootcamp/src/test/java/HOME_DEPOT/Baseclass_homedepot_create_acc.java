package HOME_DEPOT;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Baseclass_homedepot_create_acc {
	public   WebDriver driver;
	
  @BeforeTest
  public  void beforeMethod() throws InterruptedException {
	  
	  String Browser= "chrome";
	  
	  if(Browser.contains("chrome") ) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();}
	  
	  else if (Browser.contains("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  }
	  
	  else {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\msedgedriver.exe");
	  driver=new EdgeDriver();
		
	  }
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	  }
  
  

 

  @AfterTest
  public  void afterMethod() {
	  
	  driver.close();  }

}
