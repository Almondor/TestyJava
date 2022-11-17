package Pages;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.DataFaker.*;

public class NewAccountPage {
    private final WebDriver driver;


    public NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sex(String sex) {
        if (sex.equals("Mr")) {
            WebElement Mr = driver.findElement(By.xpath("//*[@id=\"field-id_gender-1\"]"));
            Mr.click();
        }
        if (sex.equals("Mrs")) {
            WebElement Mrs = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/div[1]/label[2]/span"));
            Mrs.click();
        }


    }

    public void newUser(String sex) {
        if (sex.equals("Mr")) {
            WebElement Mr = driver.findElement(By.xpath("//*[@id=\"field-id_gender-1\"]"));
            Mr.click();
        }
        if (sex.equals("Mrs")) {
            WebElement Mrs = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[1]/div[1]/label[2]/span"));
            Mrs.click();
        }

        WebElement firstName = driver.findElement(By.id("field-firstname"));
        firstName.sendKeys(createRandomFirstName());

        WebElement lastName = driver.findElement(By.id("field-lastname"));
        lastName.sendKeys(createRandomLastName());

        WebElement email = driver.findElement(By.id("field-email"));
        email.sendKeys(createRandomEmail());

        WebElement password = driver.findElement(By.id("field-password"));
        password.sendKeys(createRandomPassword());

        WebElement save = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button"));
        save.click();

    }

    public void firstName() {
        WebElement firstName = driver.findElement(By.id("field-firstname"));
        firstName.sendKeys(createRandomFirstName());
    }

    public void lastName() {
        WebElement lastName = driver.findElement(By.id("field-lastname"));
        lastName.sendKeys(createRandomLastName());
    }

    public void email() {
        WebElement email = driver.findElement(By.id("field-email"));
        email.sendKeys(createRandomEmail());
    }

    public void password() {
        WebElement password = driver.findElement(By.id("field-password"));
        password.sendKeys(createRandomPassword());
    }

    public void save() {
        WebElement save = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button"));
        save.click();
    }


}







