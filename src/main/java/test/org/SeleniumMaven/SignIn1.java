package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn1 {
	
	ChromeDriver driver;
	
	public SignIn1(ChromeDriver driver2){
		
		driver = driver2;
	}
	
	
	public void signin_1(){
		
		driver.findElement(By.id("login-mobile")).sendKeys("9545635856");
		driver.findElement(By.id("login-password")).sendKeys("s654321");
		driver.findElement(By.id("sub_btn")).click();
	}

}
