package Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Base_class_Amazon {
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }
  
  @Test
  public void f() throws IOException {
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  POM_Amazon Amazon = new POM_Amazon(driver);
	  Amazon.search_tab();
	  shots_wd();
  }

  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
  public void shots_wd() throws IOException {   
	  Date dt =new Date();
	String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
 File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileHandler.copy(cap, new File("C:\\Users\\Moe\\eclipse-workspace\\2023_batch_bootcamp\\pic\\"+name_dt+".png"));
  }

}
