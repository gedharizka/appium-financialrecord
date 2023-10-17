package org.personal.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainScreen {
    public AndroidDriver<MobileElement> driver;

    public MainScreen(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chad.financialrecord:id/tvBalance")
    private MobileElement txtSaldo;

    public String getSaldo() {
        return txtSaldo.getText();
    }
}
