package com.khabane.assessment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;

public class viewFavoriteImagesTest {
    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new FirefoxDriver();
    }

    @Test
    public void favoriteImages1() throws InterruptedException {
        //Navigate to assessment
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        //click on the favorites button

        //assert current url

        WebElement favorites = driver.findElement(By.linkText("Favorites"));

        favorites.click();

        assertTrue(driver.getPageSource().contains("There was an unexpected error (type=Not Found, status=404)."));

        Thread.sleep(2000);
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}
