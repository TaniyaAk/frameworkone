package com.heatclinic.tests;

import com.heatclinic.pages.LoginPage;
import com.heatclinic.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePageTest {
    public WebDriver driver;
    String baseURL = "https://demo.broadleafcommerce.org/";


    //Test Classes
    protected RegistrationPage registrationPage;
    protected LoginPage loginPage;



    @BeforeClass
    public void setup(){
        init();
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        // addToCartPage = new AddToCartPage(driver);

    }

    @AfterClass //to close the browser //null-means Driver cannot be found
    public void teardown(){
        if(driver != null){
            // driver.quit();
        }
    }

    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseURL);
    }
}

