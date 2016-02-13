package com.shawon.automationv11;


        import android.os.RemoteException;

        import android.support.test.uiautomator.UiDevice;

        import android.support.test.uiautomator.UiObject;

        import android.support.test.uiautomator.UiObjectNotFoundException;

        import android.support.test.uiautomator.UiSelector;

        import android.test.InstrumentationTestCase;



public class lWifi extends InstrumentationTestCase{

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


    public void testWiFi() throws RemoteException,
            UiObjectNotFoundException {
        mydevice = UiDevice.getInstance(getInstrumentation());
        // Validate that the package name is the expected one
       UiObject settingsValidation = mydevice.findObject(
                new UiSelector().packageName("com.android.settings"));
        assertTrue("Unable to detect Settings", settingsValidation.exists());

        // Wi-Fi settings
        UiObject WiFiSettings = mydevice.findObject(new UiSelector()
                .text("WLAN"));

        if (WiFiSettings.exists())
            WiFiSettings.click();

        // Switch ON
        UiObject WifiOnButton = mydevice.findObject(new UiSelector()
                .text("On"));
        // Switch OFF
        UiObject WifiOffButton = mydevice.findObject(new UiSelector()
                .text("Off"));

        if (WifiOnButton.exists()) {
            WifiOnButton.click();
        } else if (WifiOffButton.exists()) {
            WifiOffButton.click();
        }

    }

}