package com.khabane.assessment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class viewFavoriteImagesTest {
    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void favoriteImages1() throws InterruptedException {
        //Navigate to assessment
        driver.navigate().to("");

        //please assert current url

        WebElement favorites = driver.findElement(By.linkText("Favorites"));

        favorites.click();

        //assertTrue(driver.getPageSource().contains("There was an expected error (type=Not Found, status=500)."));

        Thread.sleep(2000);
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
