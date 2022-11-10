package CheatSheets;

import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheatSheet2 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        WebElement Login = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        Login.click();

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement signIn = driver.findElement(By.id("submit-login"));

        email.sendKeys("adamx10X9@wp.pl");
        password.sendKeys("SuperHasło123");
        signIn.click();

        WebElement MainPage = driver.findElement(By.xpath("//*[@id=\"_desktop_logo\"]/a"));
        MainPage.click();

        WebElement Sweater = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[2]/article/div/div[1]/a/img"));
        Sweater.click();

        WebElement Size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
        Size.click();
        WebElement SizeM = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
        SizeM.click();

        WebElement Amount  = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i"));
        for(int i=0;i<4;i++){
        Amount.click();
        }

        WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        AddToCart.click();

        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        Checkout.click();

        WebElement BasketCheckout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        BasketCheckout.click();

        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button"));
        Continue.click();

        WebElement AddressContinue = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        AddressContinue.click();

        WebElement Check = driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]"));
        Check.click();

        WebElement TermsOfService = driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]"));
        TermsOfService.click();

        WebElement PlaceOrder = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        PlaceOrder.click();

        ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);



    }
}
