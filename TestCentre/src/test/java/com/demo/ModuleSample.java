package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ModuleSample {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Titli udi ud na saki");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//yt-formatted-string[@class=\"style-scope ytd-video-renderer\"]")).click();
		
		System.out.println("Test case 2 is passed");
	}
	


}
