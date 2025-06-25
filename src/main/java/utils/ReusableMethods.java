package utils;

import com.github.javafaker.Faker;
import drivers.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ReusableMethods {

    WebDriver driver = DriverManager.getDriver();

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


    public static void bekle(int saniye) {

        try {

            Thread.sleep(saniye*1000);

        } catch (InterruptedException e) {
            System.out.println("Thread.sleep komutu calismadi");
        }

    }

    public static String getElementText(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText().trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isWebElementDisplayed(WebElement element) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeSingleFakeUser(String filePath) {
        Faker faker = new Faker();
        ExcelReader excel = new ExcelReader(filePath);

        // Header row
        excel.writeCell("Users", 0, 0, "Email", filePath);
        excel.writeCell("Users", 0, 1, "Password", filePath);

        // Generate fake user info
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 16, true, true, true);

        // Write to the second row
        excel.writeCell("Users", 1, 0, email, filePath);
        excel.writeCell("Users", 1, 1, password, filePath);

        excel.close();
        System.out.println("User written to: " + filePath);
    }

    public static User readSingleFakeUser(String filePath) {
        ExcelReader excel = new ExcelReader(filePath);
        List<List<String>> data = excel.readSheet("Users");

        if (data.size() < 2 || data.get(1).size() < 2) {
            throw new RuntimeException("User data not found or incomplete in Excel file.");
        }

        String email = data.get(1).get(0);
        String password = data.get(1).get(1);

        excel.close();
        return new User(email, password);
    }



}
