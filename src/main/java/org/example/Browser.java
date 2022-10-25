package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    static WebDriver driver = new ChromeDriver();

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void declineCookie() {
        String path = "//button[contains(@class,'button decline')]";
        WebElement declineButton = driver.findElement(By.xpath(path));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        if (declineButton.isDisplayed()) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
            declineButton.click();
        }
    }

    public static void close() {
        driver.close();
    }
}
