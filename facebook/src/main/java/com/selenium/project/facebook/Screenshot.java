package com.selenium.project.facebook;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	// method to take the screenshot
	public static void screenshot(WebDriver driver) {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		String timestamp = now.format(formatter);
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\sawan\\eclipse-workspace\\facebook\\screenshot\\ss" + timestamp + ".png";
		Screenshot.renameTo(new File(path));
	}
}
