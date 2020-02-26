import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "/Users/nayemjoy/Downloads/ac5618006c302981b5e06ea215787ab4--JavaProject 2/batch1902web/Driver/chromedriver");
        WebDriver driver = new ChromeDriver (  );
        driver.get ( "https://www.aarong.com/" );
        driver.findElement ( By.id ("search") ).sendKeys ( "Wedding" );
        driver.findElement ( By.className ( "searchIcon" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/header/div[3]/div/div[3]/div/div/form/div/input[1]" ) ).sendKeys ( "Wedding" );
        driver.findElement ( By.xpath ( "//*[@id=search]" ));


       // driver.quit ();

    }
}
