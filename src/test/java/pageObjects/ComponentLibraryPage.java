package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComponentLibraryPage {

    protected WebDriver driver;

    public ComponentLibraryPage (WebDriver driver) {

        this.driver = driver;
    }

    public  WebElement getComponentReferenceTab (){
        return(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText("Component Reference")));
    }
}
