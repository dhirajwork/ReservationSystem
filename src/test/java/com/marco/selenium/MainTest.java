package com.marco.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class MainTest {
    private WebDriver driver;
    @Test
    public void test() {
        driver.get("http://localhost:8080/reservations");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Landon Reservations"));
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\I524849\\Downloads\\selenium-java-drivers\\browsers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
