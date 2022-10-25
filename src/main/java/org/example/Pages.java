package org.example;

public class Pages {
    public static HomePage homePage() {

        HomePage homePage = new HomePage();
        return homePage;
    }

    public static AuthorsPage authorsPage() {
        AuthorsPage authorsPage = new AuthorsPage();
        return authorsPage;
    }
}