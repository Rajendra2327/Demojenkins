package com.qa.TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
	
	@Test
	
	@BeforeTest
	public void setup() {
	System.out.println("Helloo Raju");	
	}

	
	@Test
	@AfterTest
	private void Startup() {
		
		System.out.println("Launch the browser after test");
	}
}
