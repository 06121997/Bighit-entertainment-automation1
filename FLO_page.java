package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FLO_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://ibighit.com/");
		//enter URL
		//w1.navigate().to("https://ibighit.com/");
			
		
		w1.findElement(By.className("contents-obj")).click();
		Thread.sleep(2000);
		w1.findElement(By.linkText("FLO")).click();
		Thread.sleep(3000);
		
			
	    w1.findElement(By.xpath("/html/body/div/div[1]/section/footer/div/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    //song playing
	    //works manually only
	    w1.findElement(By.xpath("/html/body/div/div[1]/section/div/div[1]/div[1]/button")).click();

	}

}
