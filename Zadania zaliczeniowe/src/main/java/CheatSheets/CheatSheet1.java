package CheatSheets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheatSheet1 {
    public static void main(String[] args) {

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

        email.sendKeys("adamx10X8@wp.pl");
        password.sendKeys("SuperHasło123");
        signIn.click();

        WebElement addresses = driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a"));
        addresses.click();

     //   WebElement addAddresses = driver.findElement(By.className("addresses_footer"));
     //   addAddresses.click();
//
 //       WebElement Alias = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
  //     WebElement Address = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
  //      WebElement City = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
  //      WebElement Zip = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
   //     WebElement Country = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select"));
 //       WebElement Phone = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));

  //      Alias.sendKeys("alias");
  //      Address.sendKeys("address");
  //      City.sendKeys("city");
  //      Zip.sendKeys("zip");
   //     Country.sendKeys("city");
 //       Phone.sendKeys("phone");
//
 //       WebElement Save = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
 //       Save.click();
//

  //      WebElement email = driver.findElement(By.name("email"));
  //      WebElement password = driver.findElement(By.name("password"));
  //      WebElement signIn = driver.findElement(By.id("submit-login"));

  //      email.sendKeys("adamx10X9@gmail.com");
   //     password.sendKeys("SuperHasło123");
   //     signIn.click();


     //   WebElement Sweater = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[2]/article/div/div[1]/a/img"));
      //  Sweater.click();



    }
}
