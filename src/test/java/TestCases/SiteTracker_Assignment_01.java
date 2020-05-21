package TestCases;

import data.TestData;
import testActions.ComponentLibraryActions;
import base.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import testActions.ComponentRefereceActions;
import testActions.PlayGroundActions;
import utils.ReportUtil;

import java.io.FileNotFoundException;

public class SiteTracker_Assignment_01 extends TestBase {

    private String testCaseName = this.getClass().getSimpleName();
    final TestData data = TestData.TEST_DATA_01;
    ReportUtil reporter = new ReportUtil(testCaseName, ".\\results");

    @Before
    public void beforeTest() {
        setReporter(reporter);
        beforeClass(data.getBrowser(), testCaseName);
    }

    @Test
    public void testMain()  {

        ComponentLibraryActions componentLibrary = new ComponentLibraryActions(driver, reporter);
        ComponentRefereceActions componentReferece = new ComponentRefereceActions(driver, reporter);
        PlayGroundActions pg = new PlayGroundActions(driver, reporter);

        System.out.println("Step 1.- Navigate to the link: https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc");
        reporter.printStep("Navigate to the link: https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc", 1);
        componentLibrary.navigateToLink();
        System.out.println("Step 2.- Switch to the Component Reference tab");
        reporter.printStep("Switch to the Component Reference tab", 2);
        componentLibrary.switchToComponentReferenceTab();
        System.out.println("Step 3.- Search in Quick Find for “datatable”");
        reporter.printStep("Search in Quick Find for 'datatable'", 3);
        componentReferece.setQuickFindFor();
        System.out.println("Step 4.- Under Lightning Web Components, click on the Components>lightning>“datatable” on the left menu panel");
        reporter.printStep("Under Lightning Web Components, click on the Components>lightning>“datatable” on the left menu panel", 4);
        componentReferece.clickOnDatatableLink();
        System.out.println("Step 5.-Under Example tab on the main pane > select “Datatable from Inline Edit” from the dropdown");
        reporter.printStep("Under Example tab on the main pane > select “Datatable from Inline Edit” from the dropdown", 5);
        componentReferece.selectOptionFromExampleDrpDwn(data.getDrpExampleOption());
        System.out.println("Step 6.- Click on the “Open in Playground” button");
        reporter.printStep("Click on the “Open in Playground” button", 6);
        componentReferece.clickOnOpenInPlaygroundBtn();
        System.out.println("Step 7.- Under the rightmost section “Preview” -> Edit/Update the values for all the columns in row 3 in the table");
        reporter.printStep("Under the rightmost section “Preview” -> Edit/Update the values for all the columns in row 3 in the table", 7);
        pg.updateAllColumnsInTable();
        System.out.println("Step 8.- Assert the above have been updated in the table");
        reporter.printStep("Assert the above have been updated in the table", 8);
        pg.assertColumnsAreUptatedInTable();
        System.out.println("Step 9.- Navigate back to the previous page and Repeat step 5 by selecting the “Datatable With Row Actions” from the dropdown");
        reporter.printStep("Navigate back to the previous page and Repeat step 5 by selecting the “Datatable With Row Actions” from the dropdown", 9);
        componentReferece.selectDatatableFromRowActions();
        System.out.println("Step 10.- Click on the “Open in Playground” button");
        reporter.printStep("Click on the “Open in Playground” button", 10);
        componentReferece.clickOnOpenInPlaygroundBtn();
        System.out.println("Step11 .- Under the rightmost section “Preview” -> Scroll down to the end of the table");
        reporter.printStep("Under the rightmost section “Preview” -> Scroll down to the end of the table", 11);
        pg.scrollDownToTndOfTable();
        System.out.println("Step12.- Click on the down caret icon for the last row and select “Show Details”");
        reporter.printStep("Click on the down caret icon for the last row and select “Show Details", 12);
        pg.cliclkOnShowDetails();
        System.out.println("Step 13.- Assert the record details “Name” and “Balance” are the same as the last row in the Blue Section below the table");
        reporter.printStep("Assert the record details “Name” and “Balance” are the same as the last row in the Blue Section below the table", 13);
        pg.assertRecords();
    }

    @After
    public void tearDown() {
        afterClass(testCaseName);
    }
}
