package testActions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjects.ComponentLibraryPage;
import utils.ReportUtil;

public class ComponentLibraryActions {

    protected WebDriver driver = null;
    ComponentLibraryPage ComponentLibrary = null;
    ReportUtil reporter = null;

    public ComponentLibraryActions (WebDriver driver, ReportUtil reporter){
        this.reporter = reporter;
        this.driver = driver;
        ComponentLibrary = new ComponentLibraryPage(driver);
    }

    public void navigateToLink() {
        try {
            if (driver.getTitle().contains("Salesforce Lightning Component Library")) {
                System.out.println("Actual result: App Loaded Succesfully");
                reporter.printActualResult("App Loaded Succesfully");

            }
                else {
                    System.out.println("Actual result: App Not Loaded");
                    reporter.printActualResult("App Not Loaded");
            }
        } catch (Exception e) {
            System.out.println("Actual result: App Not Loaded");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }

    public void switchToComponentReferenceTab(){
        try {
            ComponentLibrary.getComponentReferenceTab().click();
            System.out.println("Actual result: Switched to Component Reference tab");
            reporter.printActualResult("Switched to Component Reference tab");
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to switch to Component Reference tab");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }
}





