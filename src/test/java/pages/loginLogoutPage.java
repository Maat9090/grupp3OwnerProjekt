package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginLogoutPage {

    WebDriver driver;
    By txt_username = By.id("user-name");
    By txt_password = By.id("password");
    By btn_login= By.id("login-button");
    By btn_logout= By.id("logout_sidebar_link");

    public loginLogoutPage(WebDriver driver){
        this.driver=driver;
        if(!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("This is not Login Page.The Curent Page is"+
                    driver.getCurrentUrl());
        }

    }



    public void enterUsername(String username){
       driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
}

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }


    public void clickLogout(){
        driver.findElement(btn_logout).click();
    }





}
