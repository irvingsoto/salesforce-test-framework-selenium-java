package pageObjects;

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

    public WebElement getQuickFindTxt (){ return driver.findElement(By.id("input-62")); }
    public WebElement getDatatableLink (){ return(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2]/componentreference-tree-item/div"))); }
    public WebElement getExampleDrp1 (){ return (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.name("example"))); }
    public WebElement getOpenInPlaygroundBtn (){ return (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Open in Playground')]"))); }
    public WebElement getDrpOption3 (){ return (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-367-3-367"))); }





    public List<WebElement> getDrpItems (){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        return driver.findElements(By.className("slds-media__body"));
    }

}

