package stepDefinitionsPOM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginLogoutPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class loginLogoutStepDefinitionsPOM {
    loginLogoutPage login;
    WebDriver driver;
    @Given("I launch chrome browser")
    public void  i_launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver", "D:/Skolan/AAA-AT/projects/final-projekt2/projectG3Owner/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Saucedemo homepage")
    public void i_open_saucedemo_homepage() {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Then("I fill in username")
    public void i_fill_in_username() {

        login = new loginLogoutPage(driver);
        login.enterUsername("standard_user");
        // driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }


    /*
    @Then("I fill in username")
    public void i_fill_in_username(String username) {

         login = new loginPage(driver);
         login.enterUsername(username);
       // driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
*/

     @And("I fill in password")
    public void i_fill_in_password() {
        login = new loginLogoutPage(driver);
        login.enterPassword("secret_sauce");

      //  driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

  /* @And("I fill in password")
    public void i_fill_in_password(String password) {
        login = new loginPage(driver);
        login.enterPassword(password);

      //  driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
*/

    @And("I click one login")
    public void i_click_one_login() {
        login.clickLogin();
       // driver.findElement(By.id("login-button")).click();
    }

    @And("I logout")
    public void i_logout() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.clickLogout();
      //  driver.findElement(By.id("logout_sidebar_link")).click();
    }
    @And("close browser")
    public void close_browser() {
        driver.quit();
    }


}
