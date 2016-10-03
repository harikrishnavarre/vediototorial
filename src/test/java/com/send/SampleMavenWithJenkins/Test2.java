package com.send.SampleMavenWithJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	
	public void f2(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com/");
		
		driver.close();
	}

}
