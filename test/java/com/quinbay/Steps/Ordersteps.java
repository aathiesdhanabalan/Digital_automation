package com.quinbay.Steps;

import com.quinbay.Search;
import com.quinbay.utilclass.Orderpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Ordersteps {
    static WebDriver driver;
    static Orderpage search;
    @When("User enters in the Orderdetailpage")
    public void user_enters_in_the_orderdetailpage() throws InterruptedException {
        driver=CucumberHooks.getdriver();
        search=new Orderpage(driver);
        search.setClickDipat();
        search.clickDipesan();
        System.out.println("User enters successfull");
    }

    @When("Verify the invalid tag")
    public void user_clicks_dibatalkan_tag() {
        search.searchforh2tag();
    }

    @Then("verify the product inside is invalid")
    public void the_first_product_is_same_as_dibatalkan_tag() {

    }

}
