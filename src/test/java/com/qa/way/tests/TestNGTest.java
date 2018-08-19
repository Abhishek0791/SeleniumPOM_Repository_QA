package com.qa.way.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.way.base.Base;

public class TestNGTest extends Base{
	public TestNGTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() {
		initialization();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void demoTest(){
		String str=driver.getTitle();
		Assert.assertEquals(str,"Welcome to the Test Site");
		
	}
}
