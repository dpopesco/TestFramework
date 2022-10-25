package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorsPage {
    static String url = "https://www.pluralsight.com/authors";
    static String title = "Authors | Pluralsight";

    public void goTo() {

        Browser.goTo(url);
        Browser.declineCookies();

    }

    public boolean isAt() {
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleContains(title));
        return Browser.title().equals(title);
    }
}
