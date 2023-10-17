package org.personal.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Pemasukan {
    public AndroidDriver<MobileElement> driver;

    public Pemasukan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.chad.financialrecord:id/fabMenu")
    private MobileElement btnMenu;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement btnTabIncome;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvIncome")
    private MobileElement txtIncome;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private MobileElement inputCalender;
    @AndroidFindBy(accessibility = "01 Oktober 2023")
    private MobileElement btnTanggal;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btnOkCalender;
    @AndroidFindBy(id = "com.chad.financialrecord:id/spCategory")
    private MobileElement selectKategori;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[10]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement selectedKategori;

    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement inputNote;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement inputJumlah;

    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btnSave;

    public void trcPemasukan() {

        btnMenu.click();
        btnTabIncome.click();
        inputCalender.click();
        btnTanggal.click();
        btnOkCalender.click();
        selectKategori.click();
        selectedKategori.click();
        inputJumlah.sendKeys("100000");
        inputNote.sendKeys("Terjual");
        btnSave.click();
    }

    public String getPemasukan() {
        return txtIncome.getText();
    }
}
