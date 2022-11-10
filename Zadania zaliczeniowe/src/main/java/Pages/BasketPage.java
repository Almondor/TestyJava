package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {
    private final WebDriver driver;
    public BasketPage(WebDriver driver) {this.driver = driver;}

    public void Checkout(){

        WebElement BasketCheckout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        BasketCheckout.click();
    }








}
