package BTS_project_major;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bts_website {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\selenium JAR\\geckodriver.exe");
		WebDriver w1 = new FirefoxDriver();
		w1.get("https://www.google.com");
		//enter URL
		w1.navigate().to("https://ibighit.com/bts/eng/");

	}

}
