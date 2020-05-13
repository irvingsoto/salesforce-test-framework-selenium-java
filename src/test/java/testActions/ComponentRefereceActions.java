package testActions;

import data.TestData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void selectOptionFromExampleDrpDwn(String drpOption){
        //Actions actions = new Actions(driver);
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
            //actions.sendKeys(Keys.TAB).perform();
            ComponentReferece.getQuickFindTxt().click();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to Select “Datatable from Inline Edit” from dropdown'");
            System.out.println(e);
        }
    }

    public void clickOnOpenInPlaygroundBtn(){
        try {
            Actions action = new Actions(driver);
            action.moveToElement(ComponentReferece.getOpenInPlaygroundBtn()).build().perform();
            ComponentReferece.getOpenInPlaygroundBtn().click();
            System.out.println("Actual result: The “Open in Playground” button is clicked");
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on The “Open in Playground” button + e");
            System.out.println(e);
        }
    }

    public void selectDatatableFromRowActions(){
        ComponentLibraryActions componentLibrary = new ComponentLibraryActions(driver);
        ComponentRefereceActions componentReferece = new ComponentRefereceActions(driver);

        try {
            componentLibrary.switchToComponentReferenceTab();
            componentReferece.setQuickFindFor();
            componentReferece.clickOnDatatableLink();
            selectOptionFromExampleDrpDwn(data.getDrpExampleOption2());
        } catch (Exception e) {
            System.out.println("Actual result: Not possible to click on The “Open in Playground” button");
            System.out.println(e);
        }
    }
}

