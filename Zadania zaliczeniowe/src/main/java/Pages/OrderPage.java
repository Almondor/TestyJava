package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    private final WebDriver driver;

    public OrderPage(WebDriver driver) {this.driver = driver;}

    public void AccountPage(){
        WebElement account = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]"));
        account.click();
    }








}
