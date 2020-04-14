package testActions;

import data.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ComponentReferecePage;

import java.util.concurrent.TimeUnit;

public class ComponentRefereceActions {

    protected WebDriver driver = null;
    ComponentReferecePage ComponentReferece = null;
    final TestData data = TestData.TEST_DATA_01;

    public ComponentRefereceActions (WebDriver driver){
        this.driver = driver;
        ComponentReferece = new ComponentReferecePage(driver);
    }

    public void setQuickFindFor(){

        try {
            ComponentReferece.getQuickFindTxt().sendKeys((data.getFindFor()));
            System.out.println("Actual result: 'Quick Find' Set");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to set 'Quick Find'");
            System.out.println(e);
        }
    }

    public void clickOnDatatableLink(){

        try {
            ComponentReferece.getDatatableLink().click();
            System.out.println("Actual result: 'datatable' link clicked");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on 'datatable' link");
            System.out.println(e);
        }
    }

    public void selectDatatableFromInlineEdit(String drpOption){
        try {
            Thread.sleep(2000);
            ComponentReferece.getExampleDrp1().click();
            Thread.sleep(2000);
            for (int i=0; i<ComponentReferece.getDrpItems().size(); i++){
                System.out.println(ComponentReferece.getDrpItems().get(i).getText());
                if (ComponentReferece.getDrpItems().get(i).getText().equals(drpOption))
                    ComponentReferece.getDrpItems().get(i).click();
            }
            System.out.println("Actual result: “Datatable from Inline Edit” Selected");
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to Select “Datatable from Inline Edit” from dropdown'");
            System.out.println(e);
        }
    }

    public void clickOnOpenInPlaygroundBtn(){
        try {
            ComponentReferece.getOpenInPlaygroundBtn().click();
            System.out.println("Actual result: The “Open in Playground” button is clicked");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on The “Open in Playground” button");
            System.out.println(e);
        }
    }

    public void selectDatatableFromRowActions(){
        try {

            driver.navigate().back();
            selectDatatableFromInlineEdit(data.getDrpExampleOption2());

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on The “Open in Playground” button");
            System.out.println(e);
        }
    }
}

