package com.shawon.automationv11;


import android.os.RemoteException;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Until;

public class Airplane extends InstrumentationTestCase{

    private UiDevice mydevice;

    public void setUp() throws RemoteException, UiObjectNotFoundException {

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


    public void testAirplane() throws RemoteException,
            UiObjectNotFoundException {
        mydevice = UiDevice.getInstance(getInstrumentation());
        // Validate that the package name is the expected one
       UiObject settingsValidation = mydevice.findObject(
                new UiSelector().packageName("com.android.settings"));
        assertTrue("Unable to detect Settings", settingsValidation.exists());


        // Switch ON
        UiObject AirplaneOnButton = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .checkable(true).text("ON").index(0));
        // Switch OFF
        UiObject AirplaneOffButton = mydevice.findObject(new UiSelector().className("android.widget.Switch")
                .checkable(true).text("OFF").index(0));

        if (AirplaneOnButton.exists()) {
            AirplaneOnButton.click();
        } else if (AirplaneOffButton.exists()) {
            AirplaneOffButton.click();
        }

        mydevice.wait(Until.hasObject(By.text("Dual SIM setting")), 8000);;

        UiObject sim = mydevice.findObject(new UiSelector().text("Dual SIM setting"));

        if(AirplaneOnButton.exists())
        {
            assertFalse(sim.isEnabled());
        }

        if(AirplaneOffButton.exists())
        {
            assertTrue(sim.isEnabled());
        }



    }

}