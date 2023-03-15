package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import page.SupplySyncLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.Flow;

public class SupplySync {
    SupplySyncLoginPage supplySyncLoginPage = new SupplySyncLoginPage();

    @Test
    public void loginPositive() {
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("codewise@gmail.com", "123123");
        String expectedURL = "https://supplysync.us/dashboard/companies";
        Flow.wait(1500);
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());

    }

    @Test
    public void negativeLogin() {
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("random@gmail.com", "3432222");
        String errorMessage = supplySyncLoginPage.errorMessage.getText();
        String expected = "Incorrect login and/or password.";
        Assert.assertEquals(errorMessage,expected);
    }


   


}
