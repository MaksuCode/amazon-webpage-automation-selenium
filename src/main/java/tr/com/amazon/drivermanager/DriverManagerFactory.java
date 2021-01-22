package tr.com.amazon.drivermanager;


public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case IE:
                driverManager = new InternetExplorerDriverManager();
                break;
        }
        return driverManager;
    }

}
