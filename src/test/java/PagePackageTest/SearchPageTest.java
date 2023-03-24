package PagePackageTest;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import PagePackage.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseClass {

    HomePage home;
    LoginPage login;
    LandingPage land;

    SearchPage search;

    public SearchPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        Initialization();
        home = new HomePage(driver);
        login = new LoginPage(driver);
       // login = home.clicklogin();
        land = new LandingPage(driver);
      //  login.Number(prop.getProperty("number"));
       // login.enterpass(prop.getProperty("password"));
      //  land = login.clicksubmit();
      //  Thread.sleep(4000);
        search=land.ClickSearch(prop.getProperty("product"));




    }
    @Test
    public void screenshot(){
        search.takeScreenshot();
    }
    @Test
    public void SelectStorage() throws InterruptedException {

        search.Clickproduct();
    }

}
