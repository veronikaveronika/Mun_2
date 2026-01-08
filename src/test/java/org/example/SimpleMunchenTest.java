package com.juneit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleMunchenTest {

    @Test
    public void testOpenMunchenSite() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.muenchen.de");
        // comment added in code
        driver.quit();
        //comment
        //new comment1111
        // i am in master
    }
}
