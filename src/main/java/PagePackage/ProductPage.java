package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
    @FindBy(xpath = "//input[@id=\"buy-now-button\"]")
    WebElement Buynow;


    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public CheckoutPage clickbuynow() throws InterruptedException {
        Thread.sleep(4000);
        Buynow.click();
        return new CheckoutPage();
    }
}
