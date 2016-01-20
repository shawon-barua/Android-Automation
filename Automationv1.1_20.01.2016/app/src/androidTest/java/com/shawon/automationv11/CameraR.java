package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class CameraR extends InstrumentationTestCase {

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        // Wait till the Apps icon is on the screen
        //device.wait(Until.hasObject(By.desc("Apps")), 3000);

       // UiObject2 appsButton = device.findObject(By.desc("Apps"));
       // appsButton.click();

        // Wait till the Calculator icon is on the screen

        device.wait(Until.hasObject(By.text("Camera")), 3000);
        UiObject2 cameraApp = device.findObject(By.text("Camera"));
        cameraApp.click();
        //device.waitForIdle(5000);
       // UiObject2 calculatorApp = device.findObject(By.text("Calculator"));
       // calculatorApp.click();

    }

    public void testCameraDirection() throws Exception {

        device.wait(Until.hasObject(By.res("com.android.camera:id/camera_bottom_bar")), 1000);


       // device.waitForIdle(3000);
        //capture1.click();

       // device.waitForIdle(6000);
        UiObject2 back = device.findObject(By.res("com.android.camera:id/camera_picker"));
        device.waitForIdle(3000);
       back.click();
       // device.waitForIdle(3000);
      //  UiObject2 capture1 = device.findObject(By.res("com.android.camera:id/shutter_indicator_view"));
     //   device.waitForIdle(3000);
      //  capture1.click();
       // Thread.sleep(40);
       // UiObject2 calculatorApp = device.findObject(By.text("Calculator"));
        //calculatorApp.swipe();

    }
}
