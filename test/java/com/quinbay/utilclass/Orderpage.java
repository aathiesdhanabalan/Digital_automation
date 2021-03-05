package com.quinbay.utilclass;

import com.quinbay.Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {

    public Search page;
    public Orderpage(WebDriver driver){
        page= PageFactory.initElements(driver,Search.class);
    }
    public void clickDipesan() throws InterruptedException {
        page.setClickDipesan();
        page.orderdetails();
    }
    public void setClickDipat(){
        page.verifysearchBox();
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
}
