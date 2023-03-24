package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import PagePackage.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {

    HomePage home;
    LoginPage login;
    LandingPage land;

    SearchPage product;

    public LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
        home = new HomePage(driver);
        login = new LoginPage(driver);
        login = home.clicklogin();
        land = new LandingPage(driver);
        login.Number(prop.getProperty("number"));
        login.enterpass(prop.getProperty("password"));
        land = login.clicksubmit();


    }
    @Test
    public void Search() throws InterruptedException {
        product=new SearchPage(driver);
       Thread.sleep(4000);
        product=land.ClickSearch(prop.getProperty("product"));
    }


}