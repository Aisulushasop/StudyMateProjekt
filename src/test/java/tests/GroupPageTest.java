package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GroupsPage;
import page.LoginPage;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.Flow;

public class GroupPageTest {

    LoginPage loginPage = new LoginPage();
    GroupsPage groupsPage = new GroupsPage();

    public GroupPageTest() {
    }


    @Test
    public void deleteBtnIsPresent() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        loginPage.login(Config.getValue("studyMateLoginEmail"), Config.getValue("studyMateLoginPassword"));
        loginPage.loginButton.click();
        Thread.sleep(1000);
        groupsPage.threeDot.click();
        groupsPage.deleteGroup.click();
        String expected = "Delete";
        String actual = groupsPage.deleteBtn.getText();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void optionForDelete() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        loginPage.login(Config.getValue("studyMateLoginEmail"), Config.getValue("studyMateLoginPassword"));
        loginPage.loginButton.click();
        Thread.sleep(1000);
        groupsPage.threeDot.click();
        groupsPage.deleteGroup.click();
        String expected = "Do you want to delete";
        String actual = groupsPage.doYouWantToDeleteBtn.getText();
        Assert.assertTrue(actual.contains(expected));

    }
    @Test
    public void successfulDelete() throws InterruptedException {
        Driver.getDriver().get(Config.getValue("studyMateURL"));
        loginPage.login(Config.getValue("studyMateLoginEmail"), Config.getValue("studyMateLoginPassword"));
        loginPage.loginButton.click();
        Thread.sleep(1000);
        groupsPage.threeDot.click();
        groupsPage.deleteGroup.click();
        groupsPage.deleteBtn.click();
        Assert.assertTrue(true);
    }


}
