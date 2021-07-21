package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sub_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
		Thread.sleep(2000);
		
		// twitter 
		w1.findElement(By.xpath("/html/body/div/div/footer/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		
		//facebook
		Thread.sleep(2000);
		w1.findElement(By.xpath("/html/body/div/div/footer/div/div[1]/ul/li[2]/a")).click();
		
		
		//youtube 
		Thread.sleep(2000);
		w1.findElement(By.className("youtube")).click();
		Thread.sleep(2000);
		
		
		//naver post
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(2000);
		
		w1.switchTo().window("https://ibighit.com/bts/eng/");
		
	}

}
