package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Utils.DataFaker.*;

import java.util.Objects;

public class NewAddressPage {

    private final WebDriver driver;
    public NewAddressPage(WebDriver driver) {this.driver = driver;}

    public void newAddress(String alias, String address, String city, String zip,String country, String phone){

        WebElement Alias = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
        WebElement City = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
        WebElement Zip = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));
        WebElement Country = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select"));

        Alias.sendKeys(alias);
        Address.sendKeys(address);
        City.sendKeys(city);
        Zip.sendKeys(zip);
        Phone.sendKeys(phone);
        Country.click();
        if(Objects.equals(country, "United Kingdom")){
            WebElement UK = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]/option[2]"));
            UK.click();
        }


    }

    public void Save(){
        WebElement Save = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        Save.click();
    }

    public void fullAddress(){
        WebElement Alias = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
        WebElement City = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
        WebElement Zip = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));

        Alias.sendKeys(createRandomAlias());
        Address.sendKeys(createRandomAddress());
        City.sendKeys(createRandomCity());
        Zip.sendKeys(createRandomZip());
        Phone.sendKeys(createRandomPhoneNumber());

        WebElement UK = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]/option[2]"));
        UK.click();
    }


}
