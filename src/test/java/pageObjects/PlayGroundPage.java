package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PlayGroundPage {
    protected WebDriver driver;

    public PlayGroundPage (WebDriver driver) {
        this.driver = driver;
    }


    //public WebElement getLabelRow3Txt(){ return(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("lightning-primitive-cell-factory.slds-has-focus > span:nth-child(1) > div:nth-child(1) > lightning-formatted-text:nth-child(1)"))); }

   // public WebElement getLabelRow3Txt() throws InterruptedException {
     //   return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > th .slds-grid")));

    //}



    public WebElement getRandomPlace() {
        return driver.findElement(By.id("st-search-input"));
    }

    public WebElement getLabelEditRow3Btn() {
        try {
            return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(3) lightning-primitive-icon")));
        } catch (Exception e){
            return null;
        }
    }
    public WebElement getNameEditRow100Btn() {
        try {
            return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(100) lightning-primitive-icon")));
        } catch (Exception e){
            return null;
        }
    }

    public WebElement getLabelRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1934")));
    }

    public WebElement getLabelRow100Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("lightning-primitive-cell-factory.slds-has-focus")));
    }

    public WebElement getWebsiteEditRow3Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(4) lightning-primitive-icon")));
    }

    public WebElement getWebsiteRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1937")));
    }

    public WebElement getPhoneNumberRow3Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(5) lightning-primitive-icon")));
    }

    public WebElement getPhoneNumberRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1940")));
    }

    public WebElement getDateRow3Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(6) lightning-primitive-icon")));
    }

    public WebElement getDateRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1945")));
    }

    public WebElement getTimeRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1949")));
    }

    public WebElement getBalanceRow3Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(7) lightning-primitive-icon")));
    }

    public WebElement getBalanceRow100Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(100) > .slds-cell-edit:nth-child(7) lightning-primitive-icon")));
    }
    public WebElement getBalanceRow100Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tr.slds-hint-parent:nth-child(100) > td:nth-child(5) > lightning-primitive-cell-factory:nth-child(1) > span:nth-child(1) > div:nth-child(1) > lightning-formatted-number:nth-child(1)")));
    }

    public WebElement getBalanceRow3Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-2049")));
    }

    public WebElement getShowDetails() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(100) > .slds-cell-edit:nth-child(6) lightning-primitive-icon")));
    }
    public WebElement getName() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("dd.slds-item_detail:nth-child(2)")));
    }
    public WebElement getBalance() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(" dd.slds-item_detail:nth-child(4) > lightning-formatted-number:nth-child(1)")));
    }





}
