package com.send.SampleMavenWithJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	
	public void f(){
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://docs.seleniumhq.org/download/maven.jsp");
		
		driver.close();
	}

}
