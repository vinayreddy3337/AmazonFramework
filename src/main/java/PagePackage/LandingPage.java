package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {

    @FindBy(xpath ="//input[@id=\"twotabsearchtextbox\"]")
    WebElement Searchbox;

@FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement Search;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    public SearchPage ClickSearch(String prod){
        Searchbox.click();
        Searchbox.sendKeys(prod);
        Search.click();
        return new SearchPage(driver);
    }

}
