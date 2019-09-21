package com.demo.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/workspace/Demo/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.close();
	}

}
