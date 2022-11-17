package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    private final WebDriver driver;
    public SignInPage(WebDriver driver) {this.driver = driver;}

    public void loginUser(){
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement signIn = driver.findElement(By.id("submit-login"));

        email.sendKeys("natrupoydo@gufum.com");
        password.sendKeys("SuperHasło123");
        signIn.click();
    }

    public void newUser(){
        WebElement newUser = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        newUser.click();
    }


}
