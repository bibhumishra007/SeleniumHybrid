package base;

public class BaseClass {

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/config/config.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
        } else if(browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
            driver = new FirefoxDriver();
        }

}
