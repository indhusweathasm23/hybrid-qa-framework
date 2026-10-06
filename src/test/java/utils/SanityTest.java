package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SanityTest {

    @Test
    public void openSauceDemo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}