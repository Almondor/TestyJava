package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SweaterPage {
    private final WebDriver driver;
    public SweaterPage(WebDriver driver) {this.driver = driver;}

    public void size(String size){
        WebElement Size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
        Size.click();
        if(size.equals("S")){
            WebElement SizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[1]"));
            SizeM.click();}
        if(size.equals("M")){
            WebElement SizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
            SizeM.click();}
        if(size.equals("L")){
            WebElement SizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]"));
            SizeM.click();}
        if(size.equals("XL")){
            WebElement SizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[4]"));
            SizeM.click();}

    }

    public void ammount(int a){
        WebElement Amount  = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i"));
        for(int i=1;i<a;i++){
            Amount.click();
        }
    }

    public void addBasket(){
        WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        AddToCart.click();
    }

    public void checkout(){
        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        Checkout.click();
    }


}
