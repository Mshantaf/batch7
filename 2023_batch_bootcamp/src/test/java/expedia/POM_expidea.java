package expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HOME_DEPOT.POTest;

public class POM_expidea {
	
public static WebDriver driver;
	
	@FindBy(xpath="(//*[@class='uitk-tab-text'])[2]")  //tab flight
	WebElement flights_tab;
	
	@FindBy(xpath="(//*[@class='uitk-tab-text'])[7]") // tab round trip
	WebElement Round_trip;
	
	@FindBy(xpath="//*[@aria-label='Leaving from']") // tab leaving from 
	WebElement Leaving_from;
	
	@FindBy(xpath="//*[@id='origin_select']")   // pick departure country or city   
	WebElement departure_city;
	
	@FindBy(xpath="//*[@aria-label='Going to']")  // tab going to  
	WebElement Going_to;
	
	@FindBy(xpath="//*[@id='destination_select']")  // pick destination country or city        
	WebElement destination_city;
	
	@FindBy(xpath="//*[@name='EGDSDateRange-date-selector-trigger']")   // tab date departure and arrival
	WebElement date_tab; 
	
	
	@FindBy(xpath="(//*[text()='25'])[1]")     //pick Start date
	WebElement pick_Start_date;
	
	
	@FindBy(xpath="(//*[text()='31'])[1]")     //pick end date
	WebElement pick_End_date;
	
    @FindBy(xpath="(//button[text()='Done'])[1]")                     // tab done
    WebElement done_button;
    
    @FindBy(xpath="//*[@data-stid='open-room-picker']")                     // tab Traveler
    WebElement Traveler_tab;
    
    @FindBy(xpath="//*[@id='travelers_selector_done_button']")                     // tab Traveler done
    WebElement Traveler_done;
  
  
	  
	public POM_expidea(WebDriver driver) {
		POM_expidea.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void flights_tab()  {
		flights_tab.click();
		
	}
	
	public void Round_trip()  {
		Round_trip.click();
		
	}
	
	public void Leaving_from()  {
		date_tab.click();
		Leaving_from.click();
		departure_city.sendKeys("Riyadh");
		Actions ob1 =new Actions (driver);
		ob1.sendKeys(Leaving_from, Keys.ENTER).build().perform();
	}
	
	public void Going_to()  {
		Going_to.click();
		destination_city.sendKeys("amman");
		Actions ob2 = new Actions (driver);
		ob2.sendKeys(Going_to, Keys.ENTER).build().perform();
	}
	
	public void chose_dates()  {
		date_tab.click();
		  if (pick_Start_date.isDisplayed()) {
		        System.out.println("startDate xpath is correct");
		        pick_Start_date.click();        }
		        else {
		        System.out.println("startDate xpath is wrong");
		        }
		
		 if (pick_End_date.isDisplayed()) {
		        System.out.println("startDate xpath is correct");
		        pick_End_date.click();        }
		        else {
		        System.out.println("startDate xpath is wrong");
		        }
		
		done_button.click();
	}
	
	public void Traveler() {
		
		  if (Traveler_tab.isDisplayed()) {
		        System.out.println("Traveler_tab xpath is correct");
		        Traveler_tab.click();        }
		        else {
		        System.out.println("Traveler_tabxpath is wrong");
		        }
		  Traveler_done.click();
		 
		
		
	}
}
