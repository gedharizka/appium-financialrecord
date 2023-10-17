package com.personal;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.personal.screen.Pemasukan;
import org.personal.screen.Pengeluaran;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class PemasukanTes {

    private static AndroidDriver<MobileElement> driver;
    private Pemasukan pemasukan;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "HUAWEI YAL-21");
        capabilities.setCapability("udid", "SDEDU20110000794");
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        capabilities.setCapability("noReset", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        pemasukan = new Pemasukan(driver);
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }

    @Test
    public void testTrcPemasukan() {
        pemasukan.trcPemasukan();
        String textPemasukan = pemasukan.getPemasukan();
        System.out.println("Pengeluarannya adalah :" + " " + textPemasukan);
        Assert.assertEquals(textPemasukan, "100.000");
    }
}
