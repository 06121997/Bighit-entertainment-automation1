package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bts_discovery_page_subpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
		//BTS menu icon
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//DISCOVERY
		w1.findElement(By.linkText("DISCOGRAPHY")).click();
		Thread.sleep(3000);
		//BE
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[3]/a/div[1]/img")).click();
		Thread.sleep(3000);
		
		w1.navigate().back();
		Thread.sleep(3000);
		//Butter
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[1]/a/div[1]/img")).click();
		Thread.sleep(3000);
		
		w1.navigate().back();
		Thread.sleep(3000);
		//map of soul
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[5]/a/div[1]/img")).click();
		Thread.sleep(3000);
		
		w1.navigate().back();
		Thread.sleep(3000);
		//love your self
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[7]/a/div[1]/img")).click();
		Thread.sleep(3000);
		
		w1.navigate().back();
		Thread.sleep(3000);
		//young forever
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[12]/a/div[1]/img")).click();
		Thread.sleep(3000);
		
		w1.navigate().back();
		Thread.sleep(3000);
		
		//dark & wild
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[15]/a/div[1]/img")).click();
		Thread.sleep(3000);
		w1.navigate().back();
		Thread.sleep(3000);
		
		//2 cool 4 skool
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[18]/a/div[1]/img")).click();
		Thread.sleep(3000);
		w1.navigate().back();
		Thread.sleep(3000);
		
		//twitter
		w1.findElement(By.xpath("/html/body/div/footer/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		//instagram
		w1.findElement(By.xpath("//body/div[1]/footer[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(3000);
		//w1.switchTo().window("https://ibighit.com/bts/eng/discography/");
		
		//youtube
		w1.findElement(By.xpath("/html/body/div/footer/div/div[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		
		// cafe
		w1.findElement(By.xpath("/html/body/div/footer/div/div[1]/ul/li[10]/a")).click();
		Thread.sleep(3000);
		
		// bts blog
		w1.findElement(By.xpath("/html/body/div/footer/div/div[1]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w1.switchTo().window("https://ibighit.com/bts/eng/discography/");

	}

}
