package PageEvents;

import PageObjects.FlightPageObjects;
import TestUtils.ElementFetch;
import TestUtils.TestBase;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FlightPageEvents  {

    public void ClickOnTheRoundTripButton() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        TestBase.logger.info("Clicking on Round Trip Button");
        elementFetch.getWebElement("XPATH", FlightPageObjects.RoundTripButton).click();
        Thread.sleep(2000);
    }

    public void ClickOneWayButton() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        TestBase.logger.info("");
        elementFetch.getWebElement("XPATH", FlightPageObjects.OneWayButton).click();
        Thread.sleep(2000);
    }

        public void ClearFromTextField() throws InterruptedException {
            ElementFetch elementFetch = new ElementFetch();
            elementFetch.getWebElement("XPATH", FlightPageObjects.FromTextField).clear();
            Thread.sleep(2000);
        }
    public void EnterFromDestination() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.FromTextField).sendKeys("Nig");
        Thread.sleep(2000);
    }

    public void SelectFromLocation() throws InterruptedException{
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.FromLocation).click();
        Thread.sleep(2000);
    }

    public void ClickOnDepartureDateButton()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.DepartureDate).click();
        Thread.sleep(2000);
    }

    public void SelectDepatureDate()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.DateSelector).click();
        Thread.sleep(2000);
    }

    public void ConfirmDateSelected()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.ConfirmDate).size() > 0, "Incorrect Date displayed");
        Thread.sleep(2000);
    }

    public void VerifyAdultText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.AdultText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickAdultDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.AdultDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfAdult()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.SelectAdultNum).click();
        Thread.sleep(2000);
    }

    public void VerifyChildrenText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.ChildrenText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickChildrenDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.ChildrenDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfChildren()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.SelectChildrenNum).click();
        Thread.sleep(2000);
    }

    public void VerifyInfantText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.InfantText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickOnInfantDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.InfantDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfInfants()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.SelectInfantNum).click();
        Thread.sleep(2000);
    }

    public void VerifyMoreOptionText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.MoreOptions).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickOnMoreOptions()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.MoreOptions).click();
        Thread.sleep(2000);
    }

    public void VerifyPreferredAirline()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.AirlineText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClearAirlineText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.PreferredAirlineTextField).clear();
        Thread.sleep(2000);
    }

    public void EnterPreferredAirlineText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", FlightPageObjects.PreferredAirlineTextField).sendKeys("Qatar Airways");
        Thread.sleep(2000);
    }
    public void ScrollToErrorMessage()throws InterruptedException {
        TestBase.ScrollDown();
        Thread.sleep(2000);

    }

    public void ClickSearchButton()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS", FlightPageObjects.SearchFlightButton).click();
        Thread.sleep(2000);

    }


    public void VerifyErrorMessage() throws InterruptedException{
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", FlightPageObjects.ErrorMessage).size() > 0, "Incorrect Text Displayed");
    }
        //Assert.assertTrue(elementFetch.getListWebElements("XPATH",FlightPageObjects.ErrorMessage).equals(true)==;
        //TestBase.logger.info("Verifying that an error message is displayed");



    }


