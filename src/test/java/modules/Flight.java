package modules;

import PageEvents.FlightPageEvents;
import TestUtils.TestBase;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Flight extends TestBase {

    @Test
    public void QaAssessmentTest() throws InterruptedException {


        FlightPageEvents flightPageEvents = new FlightPageEvents();

        flightPageEvents.ClickOnTheRoundTripButton();
        flightPageEvents.ClickOneWayButton();
        flightPageEvents.ClearFromTextField();
        flightPageEvents.EnterFromDestination();
        flightPageEvents.SelectFromLocation();
        flightPageEvents.ClickOnDepartureDateButton();
        flightPageEvents.SelectDepatureDate();
        flightPageEvents.ConfirmDateSelected();
        flightPageEvents.VerifyAdultText();
        flightPageEvents.ClickAdultDropDown();
        flightPageEvents.SelectNumOfAdult();
        flightPageEvents.VerifyChildrenText();
        flightPageEvents.ClickChildrenDropDown();
        flightPageEvents.SelectNumOfChildren();
        flightPageEvents.VerifyInfantText();
        flightPageEvents.ClickOnInfantDropDown();
        flightPageEvents.SelectNumOfInfants();
        flightPageEvents.VerifyMoreOptionText();
        flightPageEvents.ClickOnMoreOptions();
        flightPageEvents.VerifyPreferredAirline();
        flightPageEvents.ClearAirlineText();
        flightPageEvents.EnterPreferredAirlineText();
        flightPageEvents.ScrollToErrorMessage();
        flightPageEvents.ClickSearchButton();
        flightPageEvents.VerifyErrorMessage();



    }

}
