package com.qa.Amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

	public static void main(String[] args) throws InterruptedException {
		
		// TC001 - Verify that when unauth user access the homepage, cart Item should be displayed as zero
		// Launch Browser and enter the site  - www.amazon.in
		
		// this method is to learn , how to launch the browser , pass the endpoint and capture the tile
		// Created by Srini on 08/09
		// Updated by Rajendra on 10/09
		//rajendra eswararaju updated 11/09
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJENDRA\\SeleniumMaven\\Seleniumpractice\\src\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://www.amazon.in");
		String pageTitle = driver.getTitle(); //title of the page.
		System.out.println(pageTitle);
		
		String value  = driver.findElement(By.id("nav-cart-count")).getText();
		System.out.println(value);
		
		driver.close(); // Selenium code opened
		
		//Convert String to Integer using parser
		//do Assert! - Expected Vs Actual
		


	}

}
