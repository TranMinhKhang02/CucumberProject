package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public static String password = "password";
    public static String loginButton = "orangehrm-login-button";
    public static String app_AdminPage_id = "app";

    @Given("user is on loginPage")
    public void user_is_on_login_page() {
        System.out.println("Step 1: User is on loginPage");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        System.out.println("Step 2: User enters username and password");
        Thread.sleep(2000);
        driver.findElement(By.name(username)).sendKeys("Admin");
        driver.findElement(By.name(password)).sendKeys("admin123");
    }

    @And("click on login button")
    public void click_on_login_button() throws InterruptedException {
        System.out.println("Step 3: Click on login button");
        Thread.sleep(1000);
        driver.findElement(By.className(loginButton)).click();
    }

    @Then("user should land on home page")
    public void user_should_land_on_home_page() {
        System.out.println("user should land on home page");
        driver.findElement(By.id(app_AdminPage_id)).isDisplayed();
    }

}
