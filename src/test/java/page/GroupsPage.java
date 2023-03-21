package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GroupsPage {
    public GroupsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[2]/div[3]/ul/li[2]")
    public WebElement deleteGroup;

    @FindBy(xpath = "//div[8]/div[3]/div/div/p")
    public WebElement doYouWantToDeleteBtn;

    @FindBy(xpath = "(//button)[2]")
    public WebElement threeDot;

    @FindBy(xpath =  "//button[.='Delete']")
    public WebElement deleteBtn;

   // dtudumate

}

