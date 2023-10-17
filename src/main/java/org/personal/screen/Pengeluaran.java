package org.personal.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Pengeluaran {
    public AndroidDriver<MobileElement> driver;

    public Pengeluaran(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement btnMenu;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvExpense")
    private MobileElement txtPengeluaran;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement inputCalender;
    @AndroidFindBy(accessibility = "09 Oktober 2023")
    private MobileElement btnTanggal;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btnOkCalender;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement inputNote;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement inputJumlah;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btnSave;

    public void trcPengeluaran() {

        btnMenu.click();
        inputCalender.click();
        btnTanggal.click();
        btnOkCalender.click();
        inputJumlah.sendKeys("50000");
        inputNote.sendKeys("coba aja guys");
        btnSave.click();
    }

    public String getPengeluaran() {
        return txtPengeluaran.getText();
    }
}
