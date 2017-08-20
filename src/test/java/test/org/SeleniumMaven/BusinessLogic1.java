package test.org.SeleniumMaven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusinessLogic1 {
  
  ChromeDriver driver;
  
  @Test
  public void f() throws InterruptedException{
	  
	  Login1 obj1 = new Login1(driver);
	  obj1.login1();
	 
	  
	  SignIn1 obj2 = new SignIn1(driver);
	  obj2.signin_1();
	  
	  Product1 obj3 = new Product1(driver);
	  obj3.product_1();
	  
	  Thread.sleep(8000);
	  
  }
  
  @BeforeTest
  
  public void b4(){
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://dev.tracko.co.in/");
  }
  
  
}
