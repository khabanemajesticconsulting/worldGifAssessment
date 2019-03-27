package com.khabane.assessment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class viewAnimalsCategoryTest {

    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void cartoonCategory(){
        driver.navigate().to("http://ec2-3-9-17-39.eu-west-2.compute.amazonaws.com:8080/");

        WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
        categoriesLink.click();

        WebElement animalsBtn = driver.findElement(By.linkText("Animals"));
        animalsBtn.click();

        //Assert Here

    }
}

