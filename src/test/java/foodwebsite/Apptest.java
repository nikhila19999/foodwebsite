package foodwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apptest {
	@Test
	public void pagetest() throws InterruptedException {
		System.setProperty("webdrive.driver.chrome","C:\\eclipse\\chromedriver-win64\\chrome.driver");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/HP/git/foodwebsite/index.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	}
}
