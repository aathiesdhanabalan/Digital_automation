
package com.quinbay.Steps;

import com.quinbay.test.Pages.LoginPage;
import com.quinbay.utilclass.Orderpage;
//import cucumber.annotation.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

public class MyStepdefs {

    public static WebDriver driver;
    static LoginPage ob;
    String user;
    public static Orderpage search;
    @Given("User on BliBli page")
    public void user_on_bli_bli_page() {
        driver=CucumberHooks.getdriver();
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String arg0) {
        // System.out.println("USER "+arg0);
        ob=new LoginPage(driver);
        ob= PageFactory.initElements(driver,LoginPage.class);
        user=""+arg0;

    }

    @And("User enter password as {string}")
    public void user_enter_password_as(String arg0) throws InterruptedException {
        ob.Login("arpitha.riya@mailinator.com","Blibli@123456");
       // System.out.println("Pass "+arg0);
        //  ob.Loginpass("Blibli@123456");
        ob.Submit();
    }

    @Then("User verify the email")
    public void user_verify_the_email() {
        System.out.println("Clicked by verify by email tag");
        ob.setVerify_email();
        ob.setotp("3333");
    }

    @Then("User enter in the login page")
    public void user_enter_in_the_login_page() {
        System.out.println("Otp Verified with 3333");
        //ob.setotp("3333");
    }


}

