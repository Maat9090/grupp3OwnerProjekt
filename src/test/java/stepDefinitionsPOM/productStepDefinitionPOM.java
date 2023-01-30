package stepDefinitionsPOM;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.productPage;

import static org.junit.Assert.assertTrue;

public class productStepDefinitionPOM {
    WebDriver driver;
    productPage product;

    @And("I verify that i am on the products page")
    public void i_verify_that_i_am_on_the_products_page() {
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue(title.contains("Swag Labs"));

    }

    @And("I click one item")
    public void i_click_one_item() {
        product.clickItem();
        //driver.findElement(By.id("item_4_title_link")).click();

    }

    @And("I verify that the page shows the item")
    public void i_verify_that_the_page_shows_the_item() {

        WebElement strText1 = driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]"));
        String expected = "Sauce Labs Backpack";
        String actual = strText1.getText();
        assertTrue(actual.contains("Sauce Labs Backpack"));
        //  System.out.println(actual);
    }

    @And("I click add to the card")
    public void i_click_add_to_the_card() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }


    @And("I click on the card")
    public void i_click_on_the_the_card() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
    }

    @And("I verify that the card page shows")
    public void i_verify_that_the_card_page_shows() {

        WebElement strText1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String actual = strText1.getText();
        System.out.println(actual);
        assertTrue(actual.contains("YOUR CART"));

    }

    @And("I verify that item is in the card")
    public void i_verify_that_item_is_in_the_card() {
        WebElement strText1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        String actual = strText1.getText();
        System.out.println(actual);
        assertTrue(actual.contains("Sauce Labs Backpack"));
    }



}
