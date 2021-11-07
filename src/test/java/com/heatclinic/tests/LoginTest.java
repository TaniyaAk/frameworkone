package com.heatclinic.tests;

import com.heatclinic.pages.LoginPage;
import com.heatclinic.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class LoginTest extends BasePageTest {
    @Test
    public void LoginTest() throws InterruptedException {
        System.out.println("This is a login Page");
        loginPage.login();
    }
}
