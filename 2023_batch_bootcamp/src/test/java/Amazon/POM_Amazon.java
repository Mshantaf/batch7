package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import expedia.POM_expidea;

public class POM_Amazon {

	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@name='field-keywords']")  // search filed
	WebElement search_filed;
	
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")  //tab search
	WebElement search_tab;
	
	@FindBy(xpath="//*[text()='Summer Reading']")  //tab Summer Reading
	WebElement Summer_Reading;
	
	
	@FindBy(xpath="//*[@alt='Lessons in Chemistry: A Novel']")  //tab Lessons in Chemistry
	WebElement Lessons_in_Chemistry;
	
	
	@FindBy(xpath="//*[@value='Buy now with 1-Click']")  //tab Buy now with 1-Click
	WebElement Buy_now_with_Click;
	
	public POM_Amazon(WebDriver driver) {
		POM_Amazon.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void search_tab()  {
		search_filed.sendKeys("books");
		search_tab.click();
		Summer_Reading.click();
		Lessons_in_Chemistry.click();
		Buy_now_with_Click.click();
		
		
	}
}
