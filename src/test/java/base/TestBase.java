package base;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

public class TestBase {

    final TestData data = TestData.TEST_DATA_01;
    protected WebDriver driver;

    public void beforeClass(String driverType, String testCaseName) {
        getDriver(driverType);
        driver.manage().window().maximize();
        driver.get(data.getUrl());
        System.out.println("Starting Test Case " + testCaseName);
    }

    public void getDriver(String driverType) {
        switch (driverType) {
            case "chrome":
                driver = getChromeDriver(driverType);
                break;
            case "firefox":
                driver =  getFirefoxDriver(driverType);
                break;
            //Add more case sentences for more drivers
            default:
                driver = getOtherDriver(driverType);
                break;
        }
    }

    public WebDriver getFirefoxDriver(String driverType) {
        System.out.println("Initializing " + driverType);
        System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        FirefoxOptions capabilities = new FirefoxOptions();
        capabilities.setCapability("marionette",true);
        driver = new FirefoxDriver(capabilities);
        return driver;
    }

    public WebDriver getChromeDriver(String driverType) {
        System.out.println("Initializing " + driverType);
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    //Add more browsers
    public WebDriver getOtherDriver(String driverType) {
        System.out.println("Initializing " + driverType);
        System.out.println("Need to add driver: " + driverType);
        // System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        return driver;
    }

    public void afterClass(String testCaseName){
        try {
            System.out.println("End Of TestCase:  " + testCaseName);
            Thread.sleep(2000);
            driver.quit();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


