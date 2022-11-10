package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

private final WebDriver driver;
    public AccountPage(WebDriver driver) {this.driver = driver;}

    public void addresses(){
        WebElement addresses = driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a"));
        addresses.click();

    }

    public void MainPage(){

        WebElement MainPage = driver.findElement(By.xpath("//*[@id=\"_desktop_logo\"]/a"));
        MainPage.click();
    }


    }


