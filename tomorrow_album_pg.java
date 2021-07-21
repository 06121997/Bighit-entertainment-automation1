package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tomorrow_album_pg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
					
			// for RIGHT arrow			
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		//tomorrow x together pg
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[5]/button/div/div[2]")).click();
		Thread.sleep(3000);
		
		//album pg
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[5]/div/div/div/a")).click();
		
		//video play button
		w1.findElement(By.xpath("/html/body/div[2]/main/section[2]/div/ul/li[18]/div/button")).click();
				

	}

}
