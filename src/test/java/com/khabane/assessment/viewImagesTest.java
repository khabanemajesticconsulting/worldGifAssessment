package com.khabane.assessment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class viewImagesTest {
    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void viewImage1(){
        //Navigate to assessment
        driver.navigate().to("http://ec2-3-9-17-39.eu-west-2.compute.amazonaws.com:8080/");

        WebElement image1 = driver.findElement(By.xpath("//img[@ src='/gifs/image1.gif']"));

        //click on image1
        image1.click();

        //Check title is correct
        assertThat(driver.getTitle(), is("giflib | image1"));
    }

    @Test
    public void viewImage2(){
        //Navigate to assessment
        driver.navigate().to("http://ec2-3-9-17-39.eu-west-2.compute.amazonaws.com:8080/");
        driver.manage().window().maximize();

        WebElement image2 = driver.findElement(By.xpath(""));

        image2.click();

        assertThat(driver.getTitle(), is(""));

    }
    //create tests for all the other images
}
