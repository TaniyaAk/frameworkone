package com.heatclinic.tests;

import com.heatclinic.pages.BasePage;
import org.testng.annotations.Test;

public class RegistrationTest extends BasePageTest {

    @Test
    public void registrationTest() throws InterruptedException {
        System.out.println("This is Heat Clinic");
        registrationPage.registerAccount();
    }
}
