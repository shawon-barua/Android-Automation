package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class SensorBox extends InstrumentationTestCase{

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

    public void testAntutu() throws Exception {

        device.wait(Until.hasObject(By.res("android.widget.FrameLayout")), 4000);

        device.swipe(665, 100, 665, 100, 0);
        device.wait(Until.hasObject(By.res("com.android.vending:id/search_box_text_input")), 8000);
       // device.waitForIdle(12000);
        device.swipe(143, 997, 143, 997, 0);
        device.waitForIdle(4000);
        device.swipe(180, 890, 180, 890, 0);
        device.waitForIdle(4000);
        device.swipe(504, 1111, 504, 1111, 0);
        device.waitForIdle(4000);
        device.swipe(143, 997, 143, 997, 0);
        device.waitForIdle(4000);
        device.swipe(608, 888, 608, 888, 0);
        device.waitForIdle(4000);
        device.swipe(251, 890, 251, 890, 0);
        device.waitForIdle(4000);
        device.swipe(429, 1109, 429, 1109, 0);
        device.waitForIdle(4000);
        device.swipe(612, 890, 612, 890, 0);
        device.waitForIdle(4000);
        device.swipe(214, 1107, 214, 1107, 0);
        device.waitForIdle(4000);


        device.swipe(667, 1218, 667, 1218, 0);
        device.waitForIdle(4000);


        UiObject antutu = device.findObject(new UiSelector().text("Sensor Box for Android"));
        antutu.clickAndWaitForNewWindow();

        UiObject install = device.findObject(new UiSelector().text("INSTALL"));
        install.clickAndWaitForNewWindow();

        UiObject accept = device.findObject(new UiSelector().text("ACCEPT"));
        accept.clickAndWaitForNewWindow();
        

    }
}
