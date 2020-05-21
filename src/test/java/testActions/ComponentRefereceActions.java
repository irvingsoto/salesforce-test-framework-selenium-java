package testActions;

import data.TestData;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.ComponentReferecePage;
import utils.ReportUtil;

import java.util.concurrent.TimeUnit;

public class ComponentRefereceActions {

    protected WebDriver driver = null;
    ComponentReferecePage ComponentReferece = null;
    final TestData data = TestData.TEST_DATA_01;
    ReportUtil reporter = null;


    public ComponentRefereceActions (WebDriver driver, ReportUtil reporter){
        this.reporter = reporter;
        this.driver = driver;
        ComponentReferece = new ComponentReferecePage(driver);
    }

    public void setQuickFindFor(){
        try {
            ComponentReferece.getQuickFindTxt().sendKeys((data.getFindFor()));
            System.out.println("Actual result: 'Quick Find' Set");
            reporter.printActualResult("'Quick Find' Set");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to set 'Quick Find'");
            reporter.printActualResult("Not possible to set 'Quick Find'");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }

    public void clickOnDatatableLink(){
        try {
            ComponentReferece.getDatatableLink().click();
            System.out.println("Actual result: 'datatable' link clicked");
            reporter.printActualResult("'datatable' link clicked");


        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on 'datatable' link");
            System.out.println(e);
            reporter.printActualResult("Not possible to click on 'datatable' link");
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }

    public void selectOptionFromExampleDrpDwn(String drpOption){
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
            ComponentReferece.getExampleDrp1().click();
            for (WebElement exampleDrpOption : ComponentReferece.getDrpItems()){
                if (exampleDrpOption.getText().equals(drpOption)) {
                    exampleDrpOption.click();
                    break;
                }
            }
            System.out.println("Actual result: “Datatable from Inline Edit” Selected");
            reporter.printActualResult("“Datatable from Inline Edit” Selected");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(5000);
            ComponentReferece.getQuickFindTxt().click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to Select “Datatable from Inline Edit” from dropdown");
            reporter.printActualResult("Not possible to Select “Datatable from Inline Edit” from dropdown");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }

    public void clickOnOpenInPlaygroundBtn(){
        try {
            Actions action = new Actions(driver);
            action.moveToElement(ComponentReferece.getOpenInPlaygroundBtn()).build().perform();
            Thread.sleep(5000);
            ComponentReferece.getOpenInPlaygroundBtn().click();
            Thread.sleep(5000);
            System.out.println("Actual result: The “Open in Playground” button is clicked");
            reporter.printActualResult("The “Open in Playground” button is clicked");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on The “Open in Playground” button");
            reporter.printActualResult("Not possible to click on The “Open in Playground” button");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }
    public void selectDatatableFromRowActions(){
        ComponentLibraryActions componentLibrary = new ComponentLibraryActions(driver, reporter);
        ComponentRefereceActions componentReferece = new ComponentRefereceActions(driver, reporter);
        try {
            driver.navigate(). refresh();
            componentLibrary.switchToComponentReferenceTab();
            componentReferece.setQuickFindFor();
            componentReferece.clickOnDatatableLink();
            selectOptionFromExampleDrpDwn(data.getDrpExampleOption2());
        } catch (Exception e) {
            System.out.println("Actual result: Not possible select Datatable With Row Actions");
            reporter.printActualResult("Not possible select Datatable With Row Actions");
            System.out.println(e);
        }
        reporter.printImageIntoReport(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
    }
}

