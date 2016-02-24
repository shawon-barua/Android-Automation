package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class dualSIM extends InstrumentationTestCase {

    private UiDevice mydevice;

    @Override
    public void setUp() throws Exception {

        mydevice = UiDevice.getInstance(getInstrumentation());
        //If screen is off, wake up the device (make sure the screen lock is set to None)

        if (!mydevice.isScreenOn()) {

            mydevice.wakeUp();

        }

        mydevice.pressHome();
        //Create UiObject instance for the UI element

        UiObject AppTray_Button = mydevice.findObject(new UiSelector().text("Settings"));

        //Check if Widgets tab exists

        if (AppTray_Button.exists()) {

            AppTray_Button.clickAndWaitForNewWindow();

        }

    }

    public void testDUAL() throws Exception {

        // mydevice = UiDevice.getInstance(getInstrumentation());
        // Validate that the package name is the expected one
        UiObject settingsValidation = mydevice.findObject(
                new UiSelector().packageName("com.android.settings"));
        assertTrue("Unable to detect Settings", settingsValidation.exists());

        // Wi-Fi settings
        UiObject SimSettings = mydevice.findObject(new UiSelector()
                .text("Dual SIM setting"));

        if (SimSettings.exists())
            SimSettings.clickAndWaitForNewWindow();
        // mydevice.waitForIdle(5000);
        mydevice.swipe(631, 293, 631, 293, 0);

        // Switch ON
        UiObject SimOnButton = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .text("ON"));
        // Switch OFF
        UiObject SimOffButton = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .text("OFF"));

        mydevice.waitForIdle(8000);
        if (SimOffButton.exists()) {
            assertFalse(SimOffButton.isChecked());
        }

        else if (SimOnButton.exists()) {
            assertTrue(SimOnButton.isChecked());
        }

        mydevice.swipe(662, 422, 662, 422, 0);

        // Switch ON
        UiObject SimOnButton1 = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .text("ON"));
        // Switch OFF
        UiObject SimOffButton1 = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .text("OFF"));

        mydevice.waitForIdle(8000);
        if (SimOffButton1.exists()) {
            assertFalse(SimOffButton1.isChecked());
        }

        else if (SimOnButton1.exists()) {
            assertTrue(SimOnButton1.isChecked());
        }

    }

}
