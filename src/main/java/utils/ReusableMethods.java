package utils;

import drivers.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = DriverManager.getDriver().getWindowHandle();
        for (String handle : DriverManager.getDriver().getWindowHandles()) {
            DriverManager.getDriver().switchTo().window(handle);
            if (DriverManager.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        DriverManager.getDriver().switchTo().window(origin);
    }
}
