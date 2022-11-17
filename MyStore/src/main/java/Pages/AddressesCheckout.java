package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesCheckout {
    private final WebDriver driver;
    public AddressesCheckout(WebDriver driver) {this.driver = driver;}
public void AddAddress() {
    WebElement address = driver.findElement(By.xpath("//*[@id=\"field-address1\"]"));
    WebElement zip = driver.findElement(By.xpath("//*[@id=\"field-postcode\"]"));
    WebElement city = driver.findElement(By.xpath("//*[@id=\"field-city\"]"));
    WebElement phone = driver.findElement(By.xpath("//*[@id=\"field-phone\"]"));

    address.sendKeys("Polna 2");
    zip.sendKeys("83-231");
    city.sendKeys("Poznań");
    phone.sendKeys("12345678");

    WebElement country = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]"));
    country.click();

    WebElement UK = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]/option[2]"));
    UK.click();

}

public void Continue(){
    WebElement Continue = driver.findElement(By.name("confirm-addresses"));
    Continue.click();

}




}
