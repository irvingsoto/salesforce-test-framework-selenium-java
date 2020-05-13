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

public class SiteTracker_Assignment_01 extends TestBase {

    private String testCaseName = this.getClass().getSimpleName();
    final TestData data = TestData.TEST_DATA_01;

    @Before
    public void beforeTest() {

        beforeClass(data.getBrowser(), testCaseName);
    }

    @Test
    public void testMain()  {

        ComponentLibraryActions componentLibrary = new ComponentLibraryActions(driver);
        ComponentRefereceActions componentReferece = new ComponentRefereceActions(driver);
        PlayGroundActions pg = new PlayGroundActions(driver);

        //Step 1.- Oppen App
        System.out.println("Step 1.- Navigate to the link: https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc");
        componentLibrary.navigateToLink();
        //Step 2.- Switch to the Component Reference tab
        System.out.println("Step 2.- Switch to the Component Reference tab");
        componentLibrary.switchToComponentReferenceTab();
        //Step 3.- Search in Quick Find for “datatable”
        System.out.println("Step 3.- Search in Quick Find for “datatable”");
        componentReferece.setQuickFindFor();
        //Step 4.- Under Lightning Web Components, click on the Components>lightning>“datatable” on the left menu panel
        System.out.println("Step 4.- Under Lightning Web Components, click on the Components>lightning>“datatable” on the left menu panel");
        componentReferece.clickOnDatatableLink();
        //Step 5.-Under Example tab on the main pane > select “Datatable from Inline Edit” from the dropdown
        System.out.println("Step 5.-Under Example tab on the main pane > select “Datatable from Inline Edit” from the dropdown");
        componentReferece.selectOptionFromExampleDrpDwn(data.getDrpExampleOption());
        //Step 6.- Click on the “Open in Playground” button
        System.out.println("Step 6.- Click on the “Open in Playground” button");
        componentReferece.clickOnOpenInPlaygroundBtn();
        //Step 7.- Under the rightmost section “Preview” -> Edit/Update the values for all the columns in row 3 in the table
        System.out.println("Step 7.- Under the rightmost section “Preview” -> Edit/Update the values for all the columns in row 3 in the table");
        pg.updateAllColumnsInTable();
        //Step 8.- Assert the above have been updated in the table
        System.out.println("Step 8.- Assert the above have been updated in the table");
        pg.assertColumnsAreUptatedInTable();

        //Step 9.- Navigate back to the previous page and Repeat step 5 by selecting the “Datatable from Row Actions” from the dropdown
        System.out.println("Step 9.- Navigate back to the previous page and Repeat step 5 by selecting the “Datatable from Row Actions” from the dropdown");
        componentReferece.selectDatatableFromRowActions();
        /*
        //Step 10.- Click on the “Open in Playground” button
        System.out.println("Step 10.- Click on the “Open in Playground” button");
        componentReferece.clickOnOpenInPlaygroundBtn();
        //Step 11 .- Under the rightmost section “Preview” -> Scroll down to the end of the table
        System.out.println("Step11 .- Under the rightmost section “Preview” -> Scroll down to the end of the table");
        pg.scrollDownToTndOfTable();
        //Step 12.- Click on the down caret icon for the last row and select “Show Details”
        System.out.println("Step12.- Click on the down caret icon for the last row and select “Show Details”");
        pg.cliclkOnShowDetails();
        //Step 13.- Assert the record details “Name” and “Balance” are the same as the last row in the Blue Section below the table
        System.out.println("Step 13.- Assert the record details “Name” and “Balance” are the same as the last row in the Blue Section below the table");
        pg.assertRecords();

         */
    }

    @After
    public void tearDown() {
        afterClass(testCaseName);
    }
}
