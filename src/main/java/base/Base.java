package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Enablers;

public class Base {


    public static WebDriver driver;
    public static Enablers enablers;

    public Base() {
    }

    public Base(WebDriver driver) {
        enablers= new Enablers(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void launchBrowserAndUrl() {
        setupWebDriver("chrome");
//        driver.get("https://www.saucedemo.com");

    }

    public WebDriver setupWebDriver(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("=====Browser launched======");
        return driver;

    }

    public void closeBrowser() {
        driver.quit();
        System.out.println("=====Browser closed======");
    }
}