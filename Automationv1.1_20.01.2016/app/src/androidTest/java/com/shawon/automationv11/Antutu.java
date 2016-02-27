package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class Antutu extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        device.wait(Until.hasObject(By.desc("Apps")), 3000);

        device.wait(Until.hasObject(By.text("Play Store")), 3000);


        UiObject playStore = device.findObject(new UiSelector().text("Play Store"));
        playStore.clickAndWaitForNewWindow();

    }

    public void testAntutu() throws Exception {

        device.wait(Until.hasObject(By.res("android.widget.FrameLayout")), 4000);

        device.swipe(665, 100, 665, 100, 0);
        device.wait(Until.hasObject(By.res("com.android.vending:id/search_box_text_input")), 8000);
       // device.waitForIdle(12000);
        device.swipe(70, 1000, 70, 1000, 0);
        device.waitForIdle(4000);
        device.swipe(501, 1106, 501, 1106, 0);
        device.waitForIdle(4000);
        device.swipe(325, 888, 325, 888, 0);
        device.waitForIdle(4000);
        device.swipe(467, 890, 467, 890, 0);
        device.waitForIdle(4000);
        device.swipe(325, 888, 325, 888, 0);
        device.waitForIdle(4000);
        device.swipe(467, 890, 467, 890, 0);
        device.waitForIdle(4000);
        device.swipe(660, 1209, 660, 1209, 0);
        device.waitForIdle(4000);

        device.swipe(250, 320, 250, 320, 0);
        device.waitForIdle(4000);


        UiObject antutu = device.findObject(new UiSelector().text("AnTuTu Benchmark"));
        antutu.clickAndWaitForNewWindow();

        UiObject install = device.findObject(new UiSelector().text("INSTALL"));
        install.clickAndWaitForNewWindow();

        UiObject accept = device.findObject(new UiSelector().text("ACCEPT"));
        accept.clickAndWaitForNewWindow();


    }
}
