package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *  Project-3- ProjectName: com-herokuapp
 *  BaseUrl = http://the-internet.herokuapp.com/login
 *  1. Set up  browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current URL.
 *  5. Print the page source.
 *  6. Enter the email in the email field.
 *  7. Enter the password in the password field.
 *  8. Click on the Login Button.
 *  9. Print the current URL.
 *  10. Refresh the page.
 *  11. Close the browser
 */

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " http://the-internet.herokuapp.com/login";
        //1.Set up Chrome browser
        WebDriver driver = new EdgeDriver();

        //2.open URL
        driver.get(baseUrl);

        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //4.Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current Url" + currentUrl);

        //5.Print the page source
        System.out.println("The page source :" + driver.getPageSource());

        //6.Enter the email in the email field.
        WebElement emailId = driver.findElement(By.name("username"));
        emailId.sendKeys("abc123@gmail.com");

        //7.enter the password in the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("xyz123");

        //8.Click on the Login Button.
        WebElement login = driver.findElement(By.className("radius"));
        login.click();

        //9.Print the current URL
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //10.Refresh the page
        driver.navigate().refresh();

        //11.Close the browser.
        driver.close();
    }
}
