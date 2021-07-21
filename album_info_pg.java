package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class album_info_pg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");
		Thread.sleep(1000);
		//left scroll
		//w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[1]/button[2]/span[1]")).click();
		//Thread.sleep(1000);
		
		//album sub part
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[1]/button/div/div[1]/img")).click();
		Thread.sleep(2000);
		//album info
		w1.findElement(By.xpath("/html/body/div/div/main/section/ul/li[1]/div/div/div/a")).click();
		Thread.sleep(3000);
		
		//video playing1
		w1.findElement(By.xpath("/html/body/div/main/section[2]/div/ul/li[1]/div/button")).click();
		Thread.sleep(18000);
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) w1;
		Thread.sleep(1000);
		//js.executeAsyncScript("window.scrollBy(0,2000)","");
		
		js.executeScript("window.scrollBy(0,4000)","");
		Thread.sleep(1000);
		
		//video playing2
		w1.findElement(By.xpath("//*[@id=\"albumVideo2\"]/div/ul/li[2]/div/button")).click();
		Thread.sleep(80000);
		w1.navigate().back();
	}

}
