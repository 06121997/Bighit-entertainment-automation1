package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_menu_pg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");
			
		
		//menu icon
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//home
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[1]/div[1]/a[1]")).click();
		
		//about us
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		
		//BTS
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//PROFILE
		w1.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[3]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		w1.navigate().back();
		
		
		//BTS
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//DISCOVERY
		w1.findElement(By.linkText("DISCOGRAPHY")).click();
		Thread.sleep(3000);	
		w1.navigate().back();
		Thread.sleep(3000);
		//BTS
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//SCHEDULE
		w1.findElement(By.linkText("SCHEDULE")).click();
		Thread.sleep(3000);	
		
		
		//BTS
		w1.navigate().back();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//TOUR
		w1.findElement(By.linkText("TOUR")).click();
		Thread.sleep(3000);	
		
		
//********************************************************************************************************		
		//TOMORROW
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//PROFILE
		w1.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[4]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		w1.navigate().back();
		Thread.sleep(3000);	
		
		//DISCOGRAPHY
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
		w1.findElement(By.linkText("DISCOGRAPHY")).click();
		Thread.sleep(3000);
		w1.navigate().back();
//**********************************************************************************************************
		//LEE HYUN
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[5]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//PROFILE
		w1.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[5]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		
				
		w1.navigate().to("https://ibighit.com/");
	}

}
