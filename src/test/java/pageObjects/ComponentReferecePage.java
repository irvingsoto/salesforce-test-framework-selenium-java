package pageObjects;

import com.sun.deploy.util.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ComponentReferecePage {
    protected WebDriver driver;
    public ComponentReferecePage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getQuickFindTxt (){ return driver.findElement(By.name("Quick Find")); }
    public WebElement getExampleDrp1 (){ return (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.name("example"))); }
    public WebElement getDatatableLink (){ return(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//div[2]/componentreference-tree-item/div")
        ));
    }
    public WebElement getOpenInPlaygroundBtn (){ return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(.,'Open in Playground')]")
        ));
    }
    public List<WebElement> getDrpItems (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        return driver.findElements(By.className("slds-media__body"));
    }
}

