package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    static String url = "https://www.pluralsight.com";
    static String title = "Pluralsight - The tech workforce development company";

    public void goTo() {

        Browser.goTo(url);
        String path = "//button[contains(@class,'button decline')]";
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

        WebElement declineCookie = Browser.driver.findElement(By.xpath(path));
        declineCookie.click();

    }

    public boolean isAt() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleContains(title));
        return Browser.title().equals(title);
    }
}
