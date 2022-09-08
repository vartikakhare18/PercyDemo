package com.netspend

import io.percy.selenium.Percy
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class TestRun {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\dev\\Project\\ns_tester\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver()
        Percy percy;
        percy = new Percy(driver);
        driver.get("http://localhost:8080")
        percy.snapshot("Home Page");
        driver.close();
    }
}
