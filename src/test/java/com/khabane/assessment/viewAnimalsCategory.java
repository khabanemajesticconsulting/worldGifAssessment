package com.khabane.assessment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class viewAnimalsCategory {

    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new FirefoxDriver();
    }

    @Test
    public void cartoonCategory(){
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
        categoriesLink.click();

        WebElement animalsBtn = driver.findElement(By.linkText("Animals"));
        animalsBtn.click();

        assertThat(driver.getTitle(), is("giflib | Animals"));

    }
}

