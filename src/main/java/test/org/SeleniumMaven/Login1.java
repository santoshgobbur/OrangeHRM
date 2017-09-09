package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1 {
	
	WebDriver driver;
	
	public Login1(WebDriver driver2){
		
		driver = driver2;
	}
	
    public void login1(){
		
		driver.get("https://dev.tracko.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

}
