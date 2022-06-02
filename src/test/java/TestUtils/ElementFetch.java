package TestUtils;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ElementFetch{

    public WebElement getWebElement(String identifierType, String identifierValue){
        switch (identifierType){
            case "ID":
                return TestBase.driver.findElement(By.id(identifierValue));
            case "CSS":
                return TestBase.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return TestBase.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return TestBase.driver.findElement(By.xpath(identifierValue));
            default:
                return null;


        }
    }
    public List<WebElement> getListWebElements(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "ID":
                return TestBase.driver.findElements(By.id(identifierValue));
            case "CSS":
                return TestBase.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return TestBase.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return TestBase.driver.findElements(By.xpath(identifierValue));
            default:
                return null;


        }
    }
}
