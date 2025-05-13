package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main(String[] args)
    {
        ChromeOptions options = new ChromeOptions();

        // REMOVE this line to avoid session creation issue
        // options.addArguments("--user-data-dir=/tmp/unique-profile-" + System.currentTimeMillis());

        WebDriver d = new ChromeDriver(options);

        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize();
        d.findElement(By.id("user-name")).sendKeys("standard_user");
        d.findElement(By.id("password")).sendKeys("secret_sauce");
        d.findElement(By.id("login-button")).click();
    }
}
