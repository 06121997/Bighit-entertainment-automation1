package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_menu_pg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");
		//right slider
		//w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		//Thread.sleep(2000);
		
		//w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[2]/button/div/div[1]/img")).click();
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[1]/button/div/div[1]/img")).click();
		Thread.sleep(2000);
		w1.findElement(By.linkText("MELON")).click();
		Thread.sleep(4000);
				
		w1.findElement(By.linkText("FLO")).click();
		Thread.sleep(4000);
		w1.findElement(By.linkText("GENIE")).click();
		Thread.sleep(2000);
		w1.findElement(By.linkText("BUGS")).click();
		Thread.sleep(4000);
		//apple music
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[1]/div/div/div/div/div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		//spotify
		w1.findElement(By.xpath("//body/div[1]/div[1]/main[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(2000);
		//amazon music
		w1.findElement(By.xpath("//body/div[1]/div[1]/main[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Executed sucessfully");
		
		w1.switchTo().window("https://ibighit.com/");
		
		
		
		

	}

}
