package com.selenium.project.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpData {
	public static WebElement element = null;
	public static WebDriver driver = null;

	// method to select createAccount element
	public static WebElement createAccount(WebDriver driver) {
		element = driver.findElement(By.cssSelector("[ajaxify='/reg/spotlight/']"));
		return element;
	}

	// method to select the firstname element
	public static WebElement firstname(WebDriver driver) {
		element = driver.findElement(By.name("firstname"));
		return element;
	}

	// method to select the lastname element
	public static WebElement lastname(WebDriver driver) {
		element = driver.findElement(By.name("lastname"));
		return element;
	}

	// method to select the mobile number element
	public static WebElement mobileno(WebDriver driver) {
		element = driver.findElement(By.name("reg_email__"));
		return element;
	}

	// method to select the day element
	public static WebElement day(WebDriver driver) {
		element = driver.findElement(By.name("birthday_day"));
		return element;
	}

	// method to select the month element
	public static WebElement month(WebDriver driver) {
		element = driver.findElement(By.name("birthday_month"));
		return element;
	}

	// method to select the year element
	public static WebElement year(WebDriver driver) {
		element = driver.findElement(By.name("birthday_year"));
		return element;
	}

	// method to select the gender element
	public static WebElement gender(WebDriver driver, String gen) {
		if (gen.equalsIgnoreCase("Female")) {
			element = driver.findElement(By.cssSelector("input[value = '1']"));
		} else if (gen.equalsIgnoreCase("Male")) {
			element = driver.findElement(By.cssSelector("input[value = '2']"));
		} else {
			element = driver.findElement(By.cssSelector("input[value = '-1']"));
		}
		return element;
	}

	// method to select click element
	public static WebElement signUp(WebDriver driver) {
		element = driver.findElement(By.name("websubmit"));
		return element;
	}

	// method to solve the password error
	public static WebElement passwordError(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='_5633 _5634 _53ij'])[1]"));
		return element;
	}

	// method to navigate to other error
	public static WebElement navigateToError(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput'])[3]/following-sibling::i[1]"));
		return element;
	}

	// method to solve the mobile number and email error
	public static WebElement mobNumError(WebDriver driver) {
		element = driver.findElement(By.xpath("(//div[@class='_5633 _5634 _53ij'])[2]"));
		return element;
	}
}
