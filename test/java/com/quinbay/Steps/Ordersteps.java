package com.quinbay.Steps;

import com.quinbay.Search;
import com.quinbay.utilclass.Orderpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Ordersteps {
    static WebDriver driver;
    static Orderpage search;
    @And("User enters in the Orderdetailpage")
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
    @Then("Verify the header and searchbox")
    public void verify_the_header_and_searchbox(){
        search.searchforh2tag();
    }
    @Then("verify the product inside is valid")
    public void the_first_product_is_same_as_dispensen_tag() {
       // search.searchanypaidthing();
    }
    @Then("verify the product inside is invalid")
    public void the_first_product_is_same_as_dibatalkan_tag() {
    }
    @And("verify for searchbox")
    public void verify_for_searchbox(){
        search.verifysearchBox();
    }
    @Then("verify for image")
    public void verify_for_image() throws InterruptedException {
        driver=CucumberHooks.getdriver();
        search=new Orderpage(driver);
        search.justclickdispensen();
        search.verifyimage();
    }
    @And("User verify the reportpage")
    public void user_verify_the_reportpage() throws InterruptedException{
        driver=CucumberHooks.getdriver();
        search=new Orderpage(driver);
        search.justclickdispensen();
        search.verifyreport();

    }


}
