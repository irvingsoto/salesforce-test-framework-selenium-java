package testActions;

import org.openqa.selenium.WebDriver;
import pageObjects.ComponentLibraryPage;

public class ComponentLibraryActions {

    protected WebDriver driver = null;
    ComponentLibraryPage ComponentLibrary = null;

    public ComponentLibraryActions (WebDriver driver){

        this.driver = driver;
        ComponentLibrary = new ComponentLibraryPage(driver);

    }

    public void navigateToLink() {

        try {
            if (driver.getTitle().contains("Salesforce Lightning Component Library")) System.out.println("Actual result: App Loaded Succesfully");
                else System.out.println("Actual result: App Not Loaded");

        } catch (Exception e) {
            System.out.println("Actual result: App Not Loaded");
            System.out.println(e);
        }
    }

    public void switchToComponentReferenceTab(){

        try {
            ComponentLibrary.getComponentReferenceTab().click();
            System.out.println("Actual result: Switched to Component Reference tab");

        } catch (Exception e) {
            System.out.println("Actual result: Not possible to switch to Component Reference tab");
            System.out.println(e);
        }
    }

}





