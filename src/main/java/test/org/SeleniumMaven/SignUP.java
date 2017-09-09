package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUP {
	
	WebDriver driver;
	
	public SignUP(WebDriver driver4){
		
		driver = driver4;
	}
	
	public void signup() throws InterruptedException{
		
      driver.findElement(By.xpath("//a[@class='btn btn-cta btn-cta-secondary'][@href='trackoweb/signup.html']")).click();
      driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pgodzila");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pgodzila@gmail.com");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7845821746");
      Thread.sleep(5000);
      driver.findElement(By.xpath("//button[@id='sub_btn_signup']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
      driver.findElement(By.xpath("//button[@id='sub_btn_verify']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//button[@class='confirm']")).click();
     
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pgodzillaa15");
      
      driver.findElement(By.xpath("//input[@id='repassword']")).sendKeys("pgodzillaa15");
      
      //driver.findElement(By.xpath("//button[@id='sub_btn_signup']")).click();
      
     
      
      driver.findElement(By.xpath("//button[@id='sub_btn_setpass']")).click();
      
    //  driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");
      
      //driver.findElement(By.xpath("//button[@class='confirm']")).click();
     
      //driver.findElement(By.xpath("//button[@class='confirm']")).click();
      
      
      
    //  driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
      
      
      
      
      
      //driver.findElement(By.xpath("//button[@id='sub_btn_setpass']")).click();
      
      
      }

}
