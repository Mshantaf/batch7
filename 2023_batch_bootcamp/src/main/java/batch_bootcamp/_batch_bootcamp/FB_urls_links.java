package batch_bootcamp._batch_bootcamp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_urls_links {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//all links in the page starting with unique <a tag  , for that reason we use it to locate the element 
	List< WebElement> allLinks=  driver.findElements(By.tagName("a"));
	// print the links number (extra step)
    System.out.println("The number of Face book links is  " + allLinks.size());
	
    // use for each-loop to iterate the links and use Link as a temporary variable 
	for (WebElement link : allLinks) {
		System.out.println(link.getText() +": ");
		// use the unique attribute to print and print the link
		System.out.println(link.getAttribute("href"));

	}
		driver.close();
		
	}

}
