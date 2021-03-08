package com.quinbay;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class Search {

    @FindBy(xpath = "//input[@class='form__input login__username']")
    WebElement Login_usr;
    @FindBy(xpath = "//input[@class='form__input login__password']")
    WebElement Login_pass;
    @FindBy(xpath = "//button[@class='blu-btn b-full-width b-secondary']")
    WebElement submit;
    @FindBy(xpath = "//button[@class='blu-btn otp-validation__button b-full-width b-secondary']")
    WebElement verify_email;
    @FindBy(xpath = "(//ul//li//input)[1]")
    WebElement otp1;
    @FindBy(xpath = "(//ul//li//input)[2]")
    WebElement otp2;
    @FindBy(xpath = "(//ul//li//input)[3]")
    WebElement otp3;
    @FindBy(xpath = "(//ul//li//input)[4]")
    WebElement otp4;
    @FindBy(xpath = "//button[@class='blu-btn otp__confirm-button b-full-width b-secondary']")
    WebElement otpsubmit;
    @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[2]")
    WebElement clickDipatakan;
    @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[1]")
    WebElement clickDispensen;
    @FindBy(xpath = "(//span[@class='order-list__details__status completed'])[1]")
    WebElement firstdipsen;
    @FindBy(xpath = "(//div[@class='order-list__details']/span)[1]")
    WebElement firstdipatakan;
    @FindBy(xpath = "(//i[@class='ticker__icon'])[1]")
    WebElement error;
    @FindBy(xpath = "(//span[@class='order-footer__button'])[1]")
    WebElement orderdetail;
    @FindBy(xpath = "//p[@class='order-heading']")
    WebElement head;
    @FindBy(xpath = "//img[@src='https://static-uata.gdn-app.com/frontend/member-digital/static/img/telkom.02aa6bdc.svg']")
    WebElement img;
    @FindBy(xpath = "//input[@class='form__input']")
    WebElement searchbox;
    @FindBy(xpath = "//p[@class='order-invoice__bill-text']")
    WebElement report;
    @FindBy(xpath = "(//p[@class='order-detail__transaction-details-value'])[1]")
    WebElement usrid;
    @FindBy(xpath = "(//span[@class='order-list__details__status completed'])[1]")
    WebElement paid;
    @FindBy(xpath = "//span[@class='order-heading__back']")
    WebElement back;
    public void Loginusr(String usr_name){
        // Login_usr.click();
        Login_usr.sendKeys(usr_name);
    }
    public void Loginpass(String pass){
        // Login_pass.click();
        Login_pass.sendKeys(pass);
    }
    public void orderdetailclick(){
        orderdetail.click();
    }
    public void Submit(){
        submit.click();
    }
    public void setVerify_email(){
        verify_email.click();
    }
    public void setotp(String otp){
        // otp1.click();
        otp1.sendKeys(""+otp.charAt(0));
        //otp2.click();
        otp2.sendKeys(""+otp.charAt(1));
        //otp3.click();
        otp3.sendKeys(""+otp.charAt(2));
        //otp4.click();
        otp4.sendKeys(""+otp.charAt(3));
        otpsubmit.click();
    }
    public void justclickdispensen() throws InterruptedException{
        clickDispensen.click();
    }
    public void setClickDipesan() throws InterruptedException {
        clickDispensen.click();
        String text=clickDispensen.getText();
        Thread.sleep(3000);
        if(error.isDisplayed()){
            System.out.println("Payment not completed");
            // Assert.assertEquals("123","asddf");
        }
        //  else {
        if (firstdipsen.isDisplayed()) {
            String val = firstdipsen.getText();
            String original="Selesai";
            Assert.assertEquals(val,original);
            orderdetail.click();
        }
        //}
        System.out.println("Dipesen page");
    }
    public void setClickDipatalkan() throws InterruptedException {
        clickDipatakan.click();
        String first=(String) clickDipatakan.getText();
        String second=(String) firstdipatakan.getText();
        Thread.sleep(4000);
        Assert.assertEquals(first,second);
        System.out.println("Dipatalkan page");
    }
    public void verifyimage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue("The image is available", img.isDisplayed());
        System.out.println("The image is present");
    }
    public void orderdetails(){
        try {
            Assert.assertTrue("The value is available", orderdetail.isDisplayed());
            orderdetail.click();
            Thread.sleep(4000);
            Assert.assertTrue("The id is available", usrid.isDisplayed());
            System.out.println("Order detail page");
        }
        catch (Exception e){
            System.out.println("Not in the order details");
        }
    }
    public void searchHeader(){
        System.out.println("Header is available");
        Assert.assertTrue("Web element is present or not",head.isDisplayed());
    }
    public void verifysearchBox(){
        System.out.println("Search Box is present");
        Assert.assertTrue("The search box is present",searchbox.isDisplayed());
    }
    public void verifyreport(){
        try {
            Assert.assertTrue("The report page is present", report.isDisplayed());
            System.out.println("The report page is present");
        }
        catch (Exception e){
            System.out.println("The page is not found");
        }
     //   back.click();
    }
    public void searchanypaidthing(){
        Assert.assertTrue("The paid thing is present", paid.isDisplayed());
    }

}