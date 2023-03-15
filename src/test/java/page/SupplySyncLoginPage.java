package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SupplySyncLoginPage {

    public SupplySyncLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "input")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;

   @FindBy(tagName = "button")
    public WebElement loginBtn;

   @FindBy(tagName = "p")
   public WebElement errorMessage;


   public void login(String email,String password){
       usernameInput.sendKeys(email);
       passwordInput.sendKeys(password);
       loginBtn.click();

   }


}
