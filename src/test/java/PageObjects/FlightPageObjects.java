package PageObjects;

public interface FlightPageObjects {

    String RoundTripButton = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/label[2]/div[1]/span";
    String OneWayButton = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/label[1]/div[1]/span";
    String FromTextField = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/input";
    String FromLocation = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div[2]/ul/li[1]/p";
    String DepartureDate = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div[3]/div/div/div/div/button";
    String DateSelector = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[2]";
    String ConfirmDate = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div[3]/div/div/div/div/button/div";
    String AdultText = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[1]/h4";
    String ChildrenText = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[3]/h4";
    String InfantText = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[5]/h4";
    String AdultDropDown = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[1]/div/select";
    String ChildrenDropDown = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[3]/div/select";
    String InfantDropDown = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[5]/div/select";
    String SelectAdultNum = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[1]/div/select/option[3]";
    String SelectChildrenNum = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[3]/div/select/option[3]";
    String SelectInfantNum = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/div[1]/div[5]/div/select/option[2]";
    String MoreOptions = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[6]/div/div/div";
    String AirlineText = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[7]/div/div[3]/h4";
    String PreferredAirlineTextField = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[7]/div/div[3]/div/div/div/input";
    String AirlineSelect = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[7]/div/div[3]/div/div/div[2]/ul/li/p";
    String SearchFlightButton = "#root > div > div > div.container.w-100p.flex-1 > div.row > div.col-13.homeba.h-fc > div > div.row.pt-3.pb-4.p-relative.px-4 > div.col.flex.flex-middle > button";
    String ErrorMessage = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div";



}
