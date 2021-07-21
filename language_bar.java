package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class language_bar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");
		Actions A = new Actions(w1);
		A.moveToElement(w1.findElement(By.xpath("//header/div[2]/button[1]"))).perform();
		
		//only one lang works
		w1.findElement(By.xpath("//button[contains(text(),'JPN')]")).click();
		Thread.sleep(2000);
		w1.navigate().back(); //-> english
		//w1.findElement(By.xpath("//button[contains(text(),'ENG')]")).click();
		//Thread.sleep(2000);
		//w1.findElement(By.xpath("/html/body/div/header/div[2]/div/ul/li[2]/button")).click();
		//Thread.sleep(2000);
		//w1.navigate().back();
		//Thread.sleep(2000);
		//w1.findElement(By.xpath("//button[contains(text(),'CHN')]")).click();
		//Thread.sleep(2000);
		//w1.navigate().back();
		
		//Thread.sleep(4000);
		
		//A.moveToElement(w1.findElement(By.xpath("//header/div[2]/button[1]"))).perform();
		
	}

}
