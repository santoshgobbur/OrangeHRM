package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	
	ChromeDriver driver;
	
	public Login1(ChromeDriver driver1){
		
		driver = driver1;
	}
	
    public void login1(){
		
		driver.get("https://dev.tracko.co.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	}

}
