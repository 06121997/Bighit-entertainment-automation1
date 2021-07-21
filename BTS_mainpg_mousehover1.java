package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BTS_mainpg_mousehover1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
		Actions A = new Actions(w1);
		//Hybe page
		A.moveToElement(w1.findElement(By.xpath("//button[contains(text(),'FAMILY SITES')]"))).perform();
		w1.findElement(By.xpath("//body/div[1]/div[1]/footer[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
				
		//big hit audition
		w1.navigate().to("https://ibighit.com/");
		A.moveToElement(w1.findElement(By.xpath("//button[contains(text(),'FAMILY SITES')]"))).perform();
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//weverse shop
		w1.navigate().to("https://ibighit.com/");
		A.moveToElement(w1.findElement(By.xpath("//button[contains(text(),'FAMILY SITES')]"))).perform();
		w1.findElement(By.xpath("//a[contains(text(),'WEVERSE SHOP')]")).click();
		Thread.sleep(2000);
		
		//weverse
		w1.navigate().to("https://ibighit.com/");
		A.moveToElement(w1.findElement(By.xpath("//button[contains(text(),'FAMILY SITES')]"))).perform();
		w1.findElement(By.xpath("//a[contains(text(),'Weverse')]")).click();
		Thread.sleep(2000);
		System.out.println("Title of the page is " +w1.getTitle());
		System.out.println("URL of the page is " +w1.getCurrentUrl());			
		
		//main page has to open
		
		w1.switchTo().window("https://ibighit.com/");

	}

}
