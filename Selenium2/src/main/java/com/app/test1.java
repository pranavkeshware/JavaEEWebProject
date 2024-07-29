package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.instagram.com/");
		//driver.findElement(By.name("q")).sendKeys("panditkeshware");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
