package HOME_DEPOT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POTest {
public static WebDriver driver;
	
	@FindBy(xpath="//*[@class='MyAccount__label SimpleFlyout__link--bold'][1]")
	WebElement MyAccount;
	
	@FindBy(xpath="//*[@id='SPSORegister']")
	WebElement Register;
	
	@FindBy(xpath="//*[@class='bttn__content'][1]")
	WebElement Select_personal;		
	
	@FindBy(xpath="//*[@class='form-input__field'][1]")
	WebElement Enter_email;	
	
	@FindBy(xpath="//*[@id='password-input-field']")
	WebElement Enter_pass;	
	
	
	@FindBy(xpath="//*[@id='zipCode']")
	WebElement ZIP_CODE;	
	
	
	@FindBy(xpath="//*[@name='phone']")
	WebElement Phone;
	
	
	@FindBy(xpath="//*[@class='bttn__content']")
	WebElement create_Account;
	
	public POTest(WebDriver driver) {
		POTest.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public void MyAccount() throws InterruptedException {
		MyAccount.click();
		Thread.sleep(3000);
	}
	
	public void Register() {
		Register.click();
}

	public void Select_personal() {
		Select_personal.click();
	}
	public void Enter_email(String Email) {
		Enter_email.sendKeys(Email);
	}
	
	public void Enter_pass(String pass) {
		Enter_pass.sendKeys(pass);
	}
	
	public void ZIP_CODE(String Zip_code) {
		ZIP_CODE.sendKeys(Zip_code);
	}
	public void Phone(String Phone_Number ) {
		Phone.sendKeys(Phone_Number);
	}
	public void create_Account() {
		create_Account.click();
	}
	
}

