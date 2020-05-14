package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayGroundPage {
    protected WebDriver driver;

    public PlayGroundPage (WebDriver driver) {
        this.driver = driver;
    }

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
    public WebElement getLabelRow3Txt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1934"))); }
    public WebElement getUpdatedRow3Txt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/th"))); }
    public WebElement getUpdatedWebsiteRow3Txt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[3]"))); }
    public WebElement getUpdatedPhoneTxt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[4]"))); }
    public WebElement getUpdatedDateTxt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[5]"))); }
    public WebElement getUpdatedBalanceTxt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[6]"))); }
    public WebElement getLabelRow100Txt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("lightning-primitive-cell-factory.slds-has-focus")));
    }

    public WebElement getWebsiteEditRow3Btn() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".slds-hint-parent:nth-child(3) > .slds-cell-edit:nth-child(4) lightning-primitive-icon")));
    }
    public WebElement getWebsiteRow3Txt() { return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("input-1937")));
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

    public WebElement getLastRowNameTxt() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[100]/th")));
    }
    public WebElement getName() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("dd.slds-item_detail:nth-child(2)")));
    }
    public WebElement getBalance() {
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(" dd.slds-item_detail:nth-child(4) > lightning-formatted-number:nth-child(1)")));
    }

public WebElement getShowDownBtn (){
    return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[100]/td[6]/lightning-primitive-cell-factory/span/div/lightning-primitive-cell-actions/lightning-button-menu/button/lightning-primitive-icon")));

}

    public WebElement getShowDetailsOpstion (){
        return(new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//lightning-datatable/div[2]/div/div/div/table/tbody/tr[100]/td[6]/lightning-primitive-cell-factory/span/div/lightning-primitive-cell-actions/lightning-button-menu/div/div/slot/lightning-menu-item[1]/a/span\n")));

    }



}
