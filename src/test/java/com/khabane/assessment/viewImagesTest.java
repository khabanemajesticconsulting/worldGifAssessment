package com.khabane.assessment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class viewImagesTest {
    static WebDriver driver;

    @BeforeClass
    public static void setupTest() {
        driver = new FirefoxDriver();
    }

    @Test
    public void viewImage1(){
        //Navigate to assessment
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image1 = driver.findElement(By.xpath("//img[@ src='/gifs/image1.gif']"));

        //click on image1
        image1.click();

        //Check title is correct
        assertThat(driver.getTitle(), is("giflib | image1"));
    }

    @Test
    public void viewImage2(){
        //Navigate to assessment
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image2 = driver.findElement(By.xpath("//img[@ src='/gifs/image2.gif']"));

        image2.click();

        assertThat(driver.getTitle(), is("giflib | image2"));

    }

    @Test
    public void viewImage3(){
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image3 = driver.findElement(By.xpath("//img[@ src='/gifs/image3.gif']"));

        image3.click();

        assertThat(driver.getTitle(), is("giflib | image3"));

    }

    @Test
    public void viewImage4(){
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image4 = driver.findElement(By.xpath("//img[@ src='/gifs/image4.gif']"));

        image4.click();

        assertThat(driver.getTitle(), is("giflib | image4"));

    }

    @Test
    public void viewImage5(){
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image5 = driver.findElement(By.xpath("//img[@ src='/gifs/image5.gif']"));

        image5.click();

        assertThat(driver.getTitle(), is("giflib | image5"));

    }

    @Test
    public void viewImage6(){
        driver.navigate().to("http://165.227.125.237:8190/");
        driver.manage().window().maximize();

        WebElement image6 = driver.findElement(By.xpath("//img[@ src='/gifs/image6.gif']"));

        image6.click();

        assertThat(driver.getTitle(), is("giflib | image6"));

    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }


}
