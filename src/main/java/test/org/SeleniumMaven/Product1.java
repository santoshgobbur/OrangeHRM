package test.org.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Product1 {
	
	WebDriver driver;
	
	public Product1(WebDriver driver3){
		driver = driver3;
	}
	
	public void product_1() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'Details')]")).click();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		//driver.findElement(By.id("cmbPlans")).click();
		
		Select plan = new Select(driver.findElement(By.id("cmbPlans")));
		Thread.sleep(5000);                                             //list box syntax
		plan.selectByVisibleText("WELCOMEPLAN");
		Thread.sleep(5000);
		plan.selectByIndex(1);
		
		Thread.sleep(8000);
		driver.findElement(By.id("qid")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='vehicle_0'][@placeholder='Vehicle 1 number']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@style='width: 250px;']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-cta btn-cta-secondary'][@href='/trackoweb/productCart.html']")).click();
		Thread.sleep(3000);

}
}

