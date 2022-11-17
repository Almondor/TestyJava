package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private final WebDriver driver;
    public PaymentPage(WebDriver driver) {this.driver = driver;}


    public void check(){
        WebElement Check = driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]"));
        Check.click();
    }

    public  void wire(){
        WebElement Wire = driver.findElement(By.xpath("//*[@id=\"payment-option-2\"]"));
        Wire.click();
    }

    public void terms(){
        WebElement TermsOfService = driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]"));
        TermsOfService.click();
    }

    public void order(){
        WebElement PlaceOrder = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        PlaceOrder.click();
    }






}
