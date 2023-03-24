package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {

    @FindBy(xpath = "//span[text()='256 GB & above']")
    WebElement storage;

    @FindBy(xpath = "//span[text()='Apple iPhone 14 256GB (Product) RED']")
    WebElement iphone14;
  public SearchPage(WebDriver driver){
      this.driver=driver;
      PageFactory.initElements(driver,this);
  }

  public void takeScreenshot(){



  }

  public ProductPage Clickproduct() throws InterruptedException {
      storage.click();
      Thread.sleep(5000);
      iphone14.click();
      return new ProductPage(driver);
  }

}
