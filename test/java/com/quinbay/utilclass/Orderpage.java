package com.quinbay.utilclass;

import com.quinbay.Search;
import io.cucumber.java.bs.I;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {

    public Search page;
    public Orderpage(WebDriver driver){
        page= PageFactory.initElements(driver,Search.class);
    }
    public void clickDipesan() throws InterruptedException {
        page.setClickDipesan();
        //page.orderdetails();
    }
    public void justclickdispensen() throws InterruptedException{
        page.justclickdispensen();
    }
    public void setClickDipat() throws InterruptedException {
        page.verifysearchBox();
        page.searchanypaidthing();
        page.setClickDipatalkan();
        page.verifyimage();
    }
    public void searchforh2tag(){
        page.searchHeader();
        page.verifyreport();
    }
    public void searchbox(){
        page.verifysearchBox();
    }
    public void searchanypaidthing(){
        page.searchanypaidthing();
    }
    public void verifysearchBox(){page.verifysearchBox();}
    public void image() throws InterruptedException {
        page.setClickDipesan();
        page.verifyimage();
    }
    public void verifyimage() throws InterruptedException{
        page.verifyimage();
    }
    public void verifyreport() throws InterruptedException{
        page.justclickdispensen();
        page.orderdetailclick();
    }

}
