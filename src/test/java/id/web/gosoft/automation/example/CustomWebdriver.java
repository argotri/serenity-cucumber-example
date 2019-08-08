package id.web.gosoft.automation.example;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CustomWebdriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        ChromeOptions cap  = new ChromeOptions();
        try {
            WebDriver webDriver = new RemoteWebDriver(new URL("http://104.198.33.138:4444/wd/hub") , cap);
            return webDriver;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
