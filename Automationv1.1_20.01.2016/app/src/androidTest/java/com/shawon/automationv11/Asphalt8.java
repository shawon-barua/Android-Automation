package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class Asphalt8 extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {


        device = UiDevice.getInstance(getInstrumentation());
        device.pressDPadCenter();
        device.pressHome();

        device.wait(Until.hasObject(By.desc("Apps")), 3000);

        device.wait(Until.hasObject(By.text("Play Store")), 3000);


        UiObject playStore = device.findObject(new UiSelector().text("Play Store"));
        playStore.clickAndWaitForNewWindow();

    }

    public void testAsphalt() throws Exception {

        device.wait(Until.hasObject(By.res("android.widget.FrameLayout")), 4000);

        device.swipe(665, 100, 665, 100, 0);
        device.wait(Until.hasObject(By.res("com.android.vending:id/search_box_text_input")), 8000);
       // device.waitForIdle(12000);
        device.swipe(72, 999, 72, 999, 0);
        device.waitForIdle(4000);
        device.swipe(143, 997, 143, 997, 0);
        device.waitForIdle(4000);
        device.swipe(683, 884, 683, 884, 0);
        device.waitForIdle(4000);
        device.swipe(429, 999, 429, 999, 0);
        device.waitForIdle(4000);
        device.swipe(72, 999, 72, 999, 0);
        device.waitForIdle(4000);
        device.swipe(646, 995, 646, 995, 0);
        device.waitForIdle(4000);
        device.swipe(324, 888, 324, 888, 0);
        device.waitForIdle(4000);


        device.swipe(667, 1218, 667, 1218, 0);
        device.waitForIdle(4000);


        UiObject antutu = device.findObject(new UiSelector().text("Asphalt 8: Airborne"));
        antutu.clickAndWaitForNewWindow();

        UiObject install = device.findObject(new UiSelector().text("INSTALL"));
        install.clickAndWaitForNewWindow();

        UiObject accept = device.findObject(new UiSelector().text("ACCEPT"));
        accept.clickAndWaitForNewWindow();

        //UiObject progressbar = device.findObject(new UiSelector().className("android.widget.ProgressBar").index(2));
        //progressbar.waitUntilGone(200000);

        UiObject open = device.findObject(new UiSelector().text("OPEN"));
        open.waitForExists(400000);
        open.clickAndWaitForNewWindow();

        UiObject yes = device.findObject(new UiSelector().className("android.widget.Button").text("Yes"));
        yes.waitForExists(200000);
        yes.clickAndWaitForNewWindow();

        UiObject ok = device.findObject(new UiSelector().className("android.widget.Button").text("OK"));
        ok.waitForExists(200000);
        ok.clickAndWaitForNewWindow();

        UiObject cancel = device.findObject(new UiSelector().className("android.widget.Button").text("Cancel"));
        cancel.waitUntilGone(2400000);

        device.swipe(641, 289, 641, 289, 0);
        device.waitForIdle(4000);
        device.swipe(534, 432, 534, 432, 0);
        device.waitForIdle(4000);
        device.swipe(813, 518, 813, 518, 0);
        device.waitForIdle(4000);
        device.swipe(1048, 682, 1048, 682, 0);
        device.waitForIdle(4000);
        device.swipe(534, 406, 534, 406, 0);
        device.waitForIdle(4000);
        device.swipe(621, 673, 621, 673, 0);
        device.waitForIdle(4000);


    }
}
