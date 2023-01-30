package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {


    WebDriver driver;
    By btn_item = By.id("item_4_title_link");
  //  By txt_password = By.id("password");
  //  By btn_login= By.id("login-button");
  //  By btn_logout= By.id("logout_sidebar_link");

    public productPage(WebDriver driver){
        this.driver=driver;
       if(!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("This is not Login Page.The Curent Page is"+
                    driver.getCurrentUrl());
        }

    }

    public void clickItem(){
        driver.findElement(btn_item).click();
    }





}
