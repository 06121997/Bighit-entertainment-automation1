package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class naver_post {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
		Thread.sleep(2000);
		//error page
		
		w1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		//Thread.sleep(2000);
		//w1.findElement(By.xpath("//body/div[@id='wrap']/div[@id='cont']/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]")).click();
		
		//Thread.sleep(2000);
		//w1.navigate().back();

	}

}
