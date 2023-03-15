package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;


import java.sql.SQLOutput;

public class Google {


    @Test(groups = "smoke")
    public void search() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
    }

    @Test
    public void login() {
        System.out.println("Gmail login");
    }

    @AfterMethod
    public void cleanUp() {
        Driver.quitBrowser();
    }


}
