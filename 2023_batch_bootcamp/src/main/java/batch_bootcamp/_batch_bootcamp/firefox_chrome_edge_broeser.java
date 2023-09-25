package batch_bootcamp._batch_bootcamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_chrome_edge_broeser {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		
		
		  String Browser= " ";
		  
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
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      driver.close();

	}
		
		
	}


