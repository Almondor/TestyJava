package Utils;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.Random;

public class Utils {

    private final WebDriver driver;

    public Utils(WebDriver driver) {this.driver = driver;}

    public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);

    }

}
