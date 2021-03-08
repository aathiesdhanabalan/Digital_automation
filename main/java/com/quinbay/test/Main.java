package com.quinbay.test;

public class Main {

    public static void main(String[] args) throws InterruptedException {
       /* System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver=new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://wwwuata.gdn-app.com/member/order/digital/completed");
        LoginAction obj=new LoginAction(driver);
        Thread.sleep(3000);
        obj.Login("arpitha.riya@mailinator.com","Blibli@123456");
        obj.verifyemail("3333");
        Thread.sleep(3000);
        /*OrderAction ob=new OrderAction(driver);
        ob.scrolltoelement();*/
       // driver.quit();*/

    }
}
