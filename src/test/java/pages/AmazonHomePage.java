package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {

    WebDriver driver;

    public AmazonHomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@type = 'submit']")
    public WebElement searchBtn;

}
