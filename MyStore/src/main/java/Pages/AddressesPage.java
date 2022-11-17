package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {

    private final WebDriver driver;
    public AddressesPage(WebDriver driver) {this.driver = driver;}

    public void newAddress(){

        WebElement addAddresses = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li/a"));
        addAddresses.click();
    }

    public void MainPage(){

        WebElement MainPage = driver.findElement(By.id("_desktop_logo"));
        MainPage.click();
    }



}
