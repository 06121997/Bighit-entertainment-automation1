package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class tomorrow_x_together {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");
		Thread.sleep(2000);
		//menu icon
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		//TOMORROW
				
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/button[1]")).click();
		Thread.sleep(3000);
							
		//DISCOGRAPHY
				
				
		w1.findElement(By.linkText("DISCOGRAPHY")).click();
		Thread.sleep(3000);
		
		//not working in automation
		w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[1]/a/div[2]/div/div")).click();
				
		
		
		
		
		
		
		
		// for RIGHT arrow			
		//w1.findElement(By.xpath("/html/body/div/div/main/section/div[1]/button[2]/span")).click();
		//Thread.sleep(2000);
		//w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		//Thread.sleep(1000);
		//w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		//Thread.sleep(1000);
		//w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		//Thread.sleep(1000);
		
		//tomorrow x together pg
		//w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[2]/button/div/div[1]/img")).click();
		//Thread.sleep(2000);
		
		//melon pg
		//w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[2]/div/div/div/div/div/ul/li[1]/a")).click();
		//Thread.sleep(4000);
		//w1.switchTo().window("https://ibighit.com/");
		

	}

}
