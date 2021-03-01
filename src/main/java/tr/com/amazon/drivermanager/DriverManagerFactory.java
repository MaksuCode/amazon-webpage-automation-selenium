package tr.com.amazon.drivermanager;


public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case GECKODRIVER:
                driverManager = new FirefoxDriverManager();
                break;
            case IEDRIVERSERVER:
                driverManager = new InternetExplorerDriverManager();
                break;
        }
        return driverManager;
    }

}
