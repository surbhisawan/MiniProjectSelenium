package com.selenium.project.facebook;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		// Select the browser to get launched
		System.out.println("Enter the name of Browser \n1:Chrome \n2:Edge");
		int browser = sc.nextInt();

		// function to launch a browser
		WebDriver driver = DriverSetup.selectdriver(browser);

		// click create new account

		SignUpData.createAccount(driver).click();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// call firstname method then enter value
		SignUpData.firstname(driver).sendKeys("Surbhi");

		// call lastname method then enter vale
		SignUpData.lastname(driver).sendKeys("Sawan");

		// call mobileno method then enter number
		SignUpData.mobileno(driver).sendKeys("987654321");

		// call day method then select day from drop-down
		Select birthday = new Select(SignUpData.day(driver));
		birthday.selectByVisibleText("22");

		// call month method then select month from drop-down
		Select birthmonth = new Select(SignUpData.month(driver));
		birthmonth.selectByIndex(6);

		// call year method then select year from drop-down
		Select birthyear = new Select(SignUpData.year(driver));
		birthyear.selectByValue("2001");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// call gender method then select gender
		SignUpData.gender(driver, "Female").click(); 

		// call signUp method then click on sign up button
		SignUpData.signUp(driver).click();

		// call the method to display the password error
		String actpass = SignUpData.passwordError(driver).getText();
		System.out.println("Password Error Message is: " + actpass);
		String exppass = "Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).";
		Assert.assertEquals(exppass, actpass);
		System.out.println("True");

		// call the method to navigate to other error
		SignUpData.navigateToError(driver).click();

		// call the method to display the mobile number error verification
		String actnumber = SignUpData.mobNumError(driver).getText();
		System.out.println("Mobile Number Error Message is: " + actnumber);
		String expnumber = "Please enter a valid mobile number or email address.";
		Assert.assertEquals(expnumber, actnumber);
		System.out.println("True");

		// call the method to take the screenshot
		Screenshot.screenshot(driver);

		// call the method to close the driver
		DriverSetup.closedriver(driver);
	}
}
