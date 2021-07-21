package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disco_love_yourself {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
		//menu button
		w1.findElement(By.xpath("//header/div[1]/button[1]")).click();
		Thread.sleep(3000);
		w1.findElement(By.xpath("//button[contains(text(),'BTS')]")).click();
		Thread.sleep(3000);
		//DISCOVERY
		w1.findElement(By.linkText("DISCOGRAPHY")).click();
		Thread.sleep(3000);
		
		//love your self
				w1.findElement(By.xpath("/html/body/div/main/section/div/ul/li[7]/a/div[1]/img")).click();
				Thread.sleep(3000);
				//video playing
				w1.findElement(By.xpath("/html/body/div/main/section[2]/div/ul/li[4]/div/button")).click();
		

	}

}
