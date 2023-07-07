package com.selenium.project.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	public static String url = "https://www.facebook.com";
	static WebDriver driver = null;

	// method to select the webdriver for the browser
	public static WebDriver selectdriver(int browser) throws InterruptedException {
		if (browser == 1) {
//			System.setProperty("webdriver.chrome.driver", "C:/Users/sawan/Downloads/chromedriver_win32/chromedriver.exe");
			
			driver = new ChromeDriver();
		} else if (browser == 2) {
//		System.setProperty("webdriver.edge.driver", "C:/Users/sawan/Downloads/msedgedriver/msedgedriver.exe");
//		    EdgeDriverService service = EdgeDriverService.createDefaultService();
			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	// method to close the webdriver
	public static void closedriver(WebDriver driver) {
		driver.quit();
	}

}
