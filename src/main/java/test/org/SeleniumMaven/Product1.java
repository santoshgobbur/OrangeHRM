package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Product1 {
	
	ChromeDriver driver;
	
	public Product1(ChromeDriver driver3){
		driver = driver3;
	}
	
	public void product_1() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		//driver.findElement(By.id("cmbPlans")).click();
		
		Select plan = new Select(driver.findElement(By.id("cmbPlans"))); //list box
		plan.selectByVisibleText("WELCOMEPLAN");
		plan.selectByIndex(1);
		
		Thread.sleep(5000);
		driver.findElement(By.id("qid")).sendKeys("1");

}
}

