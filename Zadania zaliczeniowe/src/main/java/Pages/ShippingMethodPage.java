package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingMethodPage {

    private final WebDriver driver;
    public ShippingMethodPage(WebDriver driver) {this.driver = driver;}

    public void prestaShop(){
        WebElement pickUp = driver.findElement(By.xpath("//*[@id=\"delivery_option_1\"]"));
        pickUp.click();
    }
    public void delivery(){
        WebElement delivery = driver.findElement(By.xpath("//*[@id=\"delivery_option_2\"]"));
        delivery.click();
    }
    public void Continue(){
        WebElement AddressContinue = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        AddressContinue.click();
    }










}
