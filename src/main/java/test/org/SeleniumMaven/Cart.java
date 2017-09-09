package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	WebDriver driver;
	
	public Cart(WebDriver driver5){
		driver  = driver5;
	}
	
	public void cart_1BillingAddress(){
		
		driver.findElement(By.xpath("//input[@id='billingStreet']")).sendKeys("Sat Rasta");
		
	}
}
