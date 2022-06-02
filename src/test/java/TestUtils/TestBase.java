package TestUtils;

import TestUtils.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import junit.framework.TestResult;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;


    public static ExtentReports extent;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentTest logger;

    @BeforeTest
    public void SetUp() {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + File.separator + "Reports" + File.separator + "AutomationReport.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Automation Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation tester", "Olawuyi Olajide");


    }


    @BeforeMethod
    @Parameters(value = {"browserName"})
    public void StartBrowser(String browserName, Method testMethod) {
        logger = extent.createTest(testMethod.getName());
        driver = setupDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(Constants.url);


    }


    @AfterMethod
    public void Status(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS, m);
        } else if (result.getStatus() == ITestResult.FAILURE) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL, m);
        } else if (result.getStatus() == ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "Skipped";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
            logger.log(Status.SKIP, m);
        }
        driver.quit();

    }


    @AfterTest
    public void aftertestMethod() {
        extent.flush();

    }

    public WebDriver setupDriver(String browserName) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        //driver = new ChromeDriver();
        return new ChromeDriver();

    }

    public static void ScrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        {

            jse.executeScript("window.scrollBy(0, -1500);");

        }

    }

    public static void ScrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        {

            jse.executeScript("window.scrollBy(0, 1500);");
        }
    }

}
