package test.org.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BusinessLogic1 {
  
  WebDriver driver;
  
  @Test
  public void f() throws InterruptedException{
	  
	 // SignUP obj1 = new SignUP(driver);
	  //obj1.signup();
	  //Thread.sleep(3000);
	 
	  Login1 obj2 = new Login1(driver);
	  obj2.login1();
	 
	  
	  SignIn1 obj3 = new SignIn1(driver);
	  obj3.signin_1();
	  
	  Product1 obj4 = new Product1(driver);
	  obj4.product_1();
	  Thread.sleep(8000);
	  
	  Cart obj5 = new Cart(driver);
	  obj5.cart_1BillingAddress();
	  
	  
  }
  
  @BeforeTest
  
  public void b4(){
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://dev.tracko.co.in/");
  }
  
  
}
