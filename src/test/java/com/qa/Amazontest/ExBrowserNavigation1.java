package com.qa.Amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExBrowserNavigation1 {
public static void main(String[] args) throws InterruptedException {
		
		// Navigation1 - BrowserElements
        // updated Rajendra eswararaju
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJENDRA\\git\\JavaSelenium8PM\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();		//maximize the window
		driver.get("https://5movierulz.tv");
			
		Thread.sleep(5000);
		
		driver.navigate().to("https://twitter.com/login");
		
		Thread.sleep(5000);
		
		driver.navigate().back();  // one Step Back
		
		driver.navigate().forward();  // one Step fwd
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();  // reload the page
		
		Thread.sleep(5000);
		
		driver.close();
}

}
