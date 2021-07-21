package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disco_blog_page {

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
		// bts blog
		w1.findElement(By.xpath("/html/body/div/footer/div/div[1]/ul/li[11]/a")).click();
		Thread.sleep(2000);
		//play button->error works only in manual
		w1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/button/svg/circle[2]")).click();
	}

}
