package HOME_DEPOT;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class new_test extends Baseclass_homedepot_create_acc {
	
	
  @Test
  @Parameters({"Email", "pass", "Zip_code", "Phone_Number"})
  public void create_account(String Email, String pass, String Zip_code, String Phone_Number) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  POTest ob =new POTest(driver);
	  ob.MyAccount();
	  ob. Register();
      ob.Select_personal();
      ob.Enter_email(Email);
      ob.Enter_pass(pass);
      ob.ZIP_CODE(Zip_code);
      ob.Phone(Phone_Number);
      ob.create_Account();


  }
  
  
  @Test
  public void f1() {
  }
  
}
