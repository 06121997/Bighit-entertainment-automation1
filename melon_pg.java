package BTS_project_major;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class melon_pg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/");
			
		
		w1.findElement(By.className("contents-obj")).click();
		Thread.sleep(2000);
		w1.findElement(By.linkText("MELON")).click();
		Thread.sleep(2000);
		//manual testing
		//permission to dance
		w1.findElement(By.tagName("span")).click();
		
		//search bar
		//w1.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/fieldset/input[1]")).sendKeys("bts");
		
		

	}

}
