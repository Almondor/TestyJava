package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private  final WebDriver driver;



    public MainPage(WebDriver driver) {this.driver = driver;}


    public void signIn(){
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a"));
        signInButton.click();

    }

    public void Sweater(){
        WebElement Sweater = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[2]/article/div/div[1]/a/img"));
        Sweater.click();

    }


}
