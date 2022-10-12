package Stepdefine;


import PageOM.PageOM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefinition {

WebDriver driver;

   @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        driver= new ChromeDriver();

    }
    @Given("on google site gmail")
    public void on_google_site_gmail() {
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin#inbox");
    }
    @When("click on icon gmail and give <traore> and <<pass>>")
    public void click_on_icon_gmail_and_give_traore_and_pass() {
       System.out.println("hjk");}
    @When("write section")
    public void write_section() {
        System.out.println("hjk");
    }



    @After
    public void tearDown() throws InterruptedException {

       Thread.sleep(5000);
        driver.quit();

    }
}
