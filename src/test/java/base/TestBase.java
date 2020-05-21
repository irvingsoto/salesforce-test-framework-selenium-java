package base;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.ReportUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestBase {

    final TestData data = TestData.TEST_DATA_01;
    protected WebDriver driver;
    PrintStream o = null;
    PrintStream console = null;
    private ReportUtil reporter = null;

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
            //TODO Add more cases sentences to add more drivers
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
    //In Case framework not supported driver this method will print a message
    public WebDriver getOtherDriver(String driverType) {
        System.out.println("Initializing " + driverType);
        System.out.println(driverType + " is not supported");
        return driver;
    }

    //TODO add framework support for more browser drivers

    public void CreateLog (String testCaseName) throws FileNotFoundException
    {
        PrintStream o = new PrintStream(new File(".\\results\\"+testCaseName+"_log.txt"));
        PrintStream console = System.out;

    }

    public void afterClass(String testCaseName){
        if (reporter != null) {
            reporter.printReport("END");
        }
        try{
            System.out.println("End Of TestCase:  " + testCaseName);
            Thread.sleep(2000);
            //driver.quit();
        }catch (Exception e){
            System.out.println(e);
        }
        System.setOut(o);
        System.setOut(console);
    }

    public void setReporter(ReportUtil reporter) {
        this.reporter = reporter;
        this.reporter.printReport("START");
    }
}


