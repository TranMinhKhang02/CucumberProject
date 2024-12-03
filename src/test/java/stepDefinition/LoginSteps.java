package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*public class LoginSteps {
    WebDriver driver;
    public static String username_name = "username";
    public static String password_name = "password";
    public static String loginButton_class = "orangehrm-login-button";

    @Given("user is on loginPage")
    public void user_is_on_login_page() throws InterruptedException {
        System.out.println("Step 1: User is on loginPage");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        System.out.println("Step 2: User enters username and password");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
    }

    @And("click on login button")
    public void click_on_login_button() throws InterruptedException {
        System.out.println("Step 3: Click on login button");
        Thread.sleep(2000);
        driver.findElement(By.className("orangehrm-login-button")).click();
    }

    @Then("user should land on home page")
    public void user_should_land_on_home_page() {
        System.out.println("user should land on home page");
        driver.close();
    }
}*/
public class LoginSteps {
    WebDriver driver;
    public static String username = "username";
    public static String username_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    public static String password = "password";
    public static String password_xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public static String loginButton = "orangehrm-login-button";
    public static String app_AdminPage_id = "app";
    public static String dashboard_class = "oxd-topbar-header-breadcrumb-module";

    @Given("user is on loginPage")
    public void user_is_on_login_page() {
        System.out.println("Step 1: User is on loginPage");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String uname, String pwd) throws InterruptedException {
        System.out.println("Step 2: User enters username and password");
        Thread.sleep(2000);
        driver.findElement(By.name(username)).sendKeys(uname);
        driver.findElement(By.name(password)).sendKeys(pwd);
    }

    @And("click on login button")
    public void click_on_login_button() throws InterruptedException {
        System.out.println("Step 3: Click on login button");
        Thread.sleep(1000);
        driver.findElement(By.className(loginButton)).click();
    }

    /*@Then("user should land on home page")
    public void user_should_land_on_home_page() {
        System.out.println("user should land on home page");
        String menu_dashBoard = driver.findElement(By.xpath(dashboard_class)).getText();
        assertEquals("Dashboard", menu_dashBoard);
    }*/

    @Then("user should land on home page")
    public void user_should_land_on_home_page() {
        System.out.println("user should land on home page");
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Navigation to home page is successfully");
        } else {
            System.out.println("Navigation to home page is failed");
        }
        driver.close();;
    }

    @When("user enters credentials using DataTable")
    public void user_enters_credentails_using_data_table(DataTable dataTable) throws InterruptedException {
        System.out.println("Step 2: User enters username and password");
        List<List<String>> data = dataTable.asLists(String.class);
        Thread.sleep(5000);
        driver.findElement(By.xpath(username_xpath)).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath(password_xpath)).sendKeys(data.get(0).get(1));
    }

}
