package com.shawon.automationv11;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;

public class CellularData extends InstrumentationTestCase {

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
        UiObject cellularData = mydevice.findObject(new UiSelector().className("android.widget.TextView")
                .text("Cellular data"));

        cellularData.clickAndWaitForNewWindow();

        // Switch OFF
        UiObject Sim1 = mydevice.findObject(new UiSelector().className("android.widget.CheckedTextView")
                .index(0));

        UiObject Sim2 = mydevice.findObject(new UiSelector().className("android.widget.CheckedTextView")
                .index(1));

        if(Sim1.isChecked())
        {
            Sim2.clickAndWaitForNewWindow();
        }

        else if(Sim2.isChecked())
        {
            Sim1.clickAndWaitForNewWindow();
        }


    }

}
