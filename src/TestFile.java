
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFile {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/maliyamukelimu/Documents/Selenium_Dependencies/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");




}

}
