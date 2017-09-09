package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn1 {
	
	WebDriver driver;
	
	public SignIn1(WebDriver driver2){
		
		driver = driver2;
	}
	
	
	public void signin_1(){
		
		driver.findElement(By.id("login-mobile")).sendKeys("7845821746");
		driver.findElement(By.id("login-password")).sendKeys("pgodzillaa15");
		driver.findElement(By.id("sub_btn")).click();
	}

}
