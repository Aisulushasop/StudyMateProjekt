package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement emailInputBox;


    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;


    public void login (String email,String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        loginButton.click();

    }




}
