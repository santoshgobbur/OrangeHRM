package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
  WebDriver driver;	
  String title1,ExpectedTitle,
  actual_error,expected_error;
	
  @Test (priority = 2)
  public void OrangeHRMTitle() {
	  
	  driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin");
	  driver.findElement(By.id("btnLogin")).click();
	  title1=driver.getTitle(); 
	  System.out.println("Title is" +title1);
	  ExpectedTitle = "OrangeHRM";
	  
	  // verification by type1
	  Assert.assertEquals(title1, ExpectedTitle);
	 
	  //verification by type2
	 // Assert.assertTrue(title1.contains("Orange"));
	  System.out.println("test case1 passed");
  }
  
  @Test(priority = 1)
  public void VerifyErrorMessage() throws InterruptedException{
	  
	  driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("btnLogin")).click(); //LOGIN CLICK
	  Thread.sleep(2000);
	  
	                 
	  actual_error = driver.findElement(By.id("spanMessage")).getText();
	  expected_error = "Username cannot be empty"; 
	  
	  //type 1
	  Assert.assertEquals(actual_error, expected_error);
	  System.out.println("test case2 passed");
	  
	  
	  
	  
	  
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
