package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseClass {
    HomePage home;
    LoginPage login;
    LandingPage land;

    SearchPage search;
    ProductPage product;


    public ProductPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        Initialization();
        home = new HomePage(driver);
        login = new LoginPage(driver);
         login = home.clicklogin();
        land = new LandingPage(driver);
          login.Number(prop.getProperty("number"));
         login.enterpass(prop.getProperty("password"));
          land = login.clicksubmit();
         Thread.sleep(4000);
        search = land.ClickSearch(prop.getProperty("product"));
        search.Clickproduct();


    }
    @Test
    public void clickBuy() throws InterruptedException {
        product=new ProductPage(driver);
        product.clickbuynow();

    }
}

