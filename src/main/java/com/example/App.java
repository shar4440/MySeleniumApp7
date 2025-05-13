package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
    public static void main( String[] args )
    {
      
      WebDriver d = new ChromeDriver();
      d.get("https://www.saucedemo.com/");
      d.manage().window().maximize();
      d.findElement(By.id("user-name")).sendKeys("standard_user");
      d.findElement(By.id("password")).sendKeys("secret_sauce");
      d.findElement(By.id("login-button")).click();
    }
}
