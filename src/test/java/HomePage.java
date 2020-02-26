import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage<piblic> {
    WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty ( "webdriver.chrome.driver", "/Users/nayemjoy/Downloads/ac5618006c302981b5e06ea215787ab4--JavaProject 2/batch1902web/Driver/chromedriver" );
         driver = new ChromeDriver ();
        driver.get ( "https://www.aarong.com/" );

    }
    @Test
    public void demTest() {
        System.setProperty ( "webdriver.chrome.driver", "/Users/nayemjoy/Downloads/ac5618006c302981b5e06ea215787ab4--JavaProject 2/batch1902web/Driver/chromedriver" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://www.aarong.com/" );
        driver.findElement ( By.id ( "search" ) ).sendKeys ( "Wedding" );
        driver.findElement ( By.className ( "searchIcon" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/header/div[3]/div/div[3]/div/div/form/div/input[1]" ) ).sendKeys ( "Wedding" );
        driver.findElement ( By.xpath ( "//*[@id=search]" ) );


    }

    @Test
    public void goLogin() {
        System.setProperty ( "webdriver.chrome.driver", "/Users/nayemjoy/Downloads/ac5618006c302981b5e06ea215787ab4--JavaProject 2/batch1902web/Driver/chromedriver" );
        driver = new ChromeDriver ();
        driver.get ( "https://www.aarong.com/" );
        driver.findElement ( By.partialLinkText ( "Log In" ) ).click ();
    }
    @AfterMethod
    public void Close (){
        driver.quit ();

    }

    }
