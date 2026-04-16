package utilities;


import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Enablers extends Base {

    public JavascriptExecutor js;

    public Enablers(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param element
     * @Description: This method is used click element if there are errors like stale element etc.
     */
    public void javaScriptExecutor(WebElement element) {

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * @Description: This method is used to scroll down by 250 pixel vertical in the web page
     */
    public void scrollDown() {

        js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 550);");
    }

    /**
     * @Description: This method is used to scroll Up in the web page
     */

    public void scrollUp() {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0)");
    }

    /**
     * @Description: This method is used to scroll to the element in the web page
     */
    public void scrollToElement(WebElement element) {

        Coordinates cor = (Coordinates) ((Locatable) element).getCoordinates();
        cor.inViewPort();
    }

    /**
     * @Description: This method is used to scroll to the end of the page
     */
    public void scrollToEndOfPage() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    /**
     * @Description: This method is used explicitly waiting for the element presence in the page
     */

    public WebElement waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /**
     * @Description: This method is used explicitly waiting for the element is clickable in the page
     */

    public WebElement waitForElementToBeClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }


    /**
     * @Description: Delay time in seconds to pause or hold for some page objects to load takes
     * only integer value of number of seconds to pause
     * * @param seconds
     */
    public void secondsDelay(int seconds) {
        int timeInMilliSeconds;
        try {
            timeInMilliSeconds = seconds * 1000;
            System.out.println("##############################################");
            System.out.println("Going for " + timeInMilliSeconds + " delay");
            System.out.println("##############################################");
            Thread.sleep(timeInMilliSeconds);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    /**
     * @Description: This method used to click and element
     * * @param element
     */

    public boolean clickElement(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
            return true;
        }
        return false;
    }

    /**
     * @Description: This method used to send keys in to the text box
     * * @param element,text
     */

    public boolean typeText(WebElement element, String text) {
        if (element.isDisplayed()) {
            element.sendKeys(text);
            return true;
        }
        return false;
    }

    /**
     * @Description: This method used to clear the text box
     * * @param element
     */

    public boolean clearText(WebElement element) {
        if (element.isDisplayed()) {
            element.clear();
            return true;
        }
        return false;
    }

    /**
     * @Description: This method used to verify the element present in the page
     * * @param element
     */

    public boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void selectDropDownValue(WebElement strDDOpenerXpath, String strDDULXPath, String strValue) {
        secondsDelay(1);
        strDDOpenerXpath.click();
        secondsDelay(1);
        for (int i = 1; i <= 300; ++i) {
            try {
                String strResult = this.driver.findElement(By.xpath(strDDULXPath + "[" + i + "]")).getText();
                if (strResult.contains(strValue)) {
                    this.driver.findElement(By.xpath(strDDULXPath + "[" + i + "]")).click();
                    break;
                }
            } catch (Exception var7) {
                throw new ElementNotSelectableException("Dropdown selection failed for value " + strValue);
            }
        }

    }

    /**
     * @Description: This method used to implement implicit wait
     */
    public void implicitWait(int sec) {
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    /**
     * @Description: This method used to take screenshot
     */
    public void screenShot() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
//Saving the screenshot in desired location
        File source = screenshot.getScreenshotAs(OutputType.FILE);
//Path to the location to save screenshot
        FileUtils.copyFile(source, new File("target/test_output/Screen.png"));

    }

    public void selectDrodown(String option) throws InterruptedException {
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='list']//li"));
        for (WebElement el : allOptions) {
            if (el.getText().contains(option)) {

                el.click();

            }
        }
    }

}