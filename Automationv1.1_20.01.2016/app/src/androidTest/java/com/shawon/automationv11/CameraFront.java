package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;


public class CameraFront extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        // Wait till the Apps icon is on the screen
        device.wait(Until.hasObject(By.desc("Apps")), 3000);

        device.wait(Until.hasObject(By.text("Camera")), 3000);
        UiObject2 cameraApp = device.findObject(By.text("Camera"));
        cameraApp.click();
        //device.waitForIdle(5000);
       // UiObject2 calculatorApp = device.findObject(By.text("Calculator"));
       // calculatorApp.click();

    }

    public void testFrontCamera() throws Exception {

        device.wait(Until.hasObject(By.res("com.android.camera:id/camera_bottom_bar")), 1000);

        UiObject2 capture1 = device.findObject(By.res("com.android.camera:id/shutter_indicator_view"));
        UiObject2 flash = device.findObject(By.res("com.android.camera:id/flashlight_picker"));
        // UiObject2 capture1 = device.findObject(By.res("com.android.gallery3d:id/shutter_button_photo"));
        // UiObject2 capture1 = device.findObject(By.res("org.codeaurora.snapcam:id/shutter_button"));
        device.waitForIdle(3000);


        if(flash.isEnabled()) {

            UiObject2 back = device.findObject(By.res("com.android.camera:id/camera_picker"));
            device.waitForIdle(3000);
            back.click();
            device.waitForIdle(3000);
            for (int i = 0; i < 10; i++) {
                capture1.click();
                Thread.sleep(3000);
            }
        }

        else
        {

            for (int i = 0; i < 10; i++) {
                capture1.click();
                Thread.sleep(3000);
            }

        }

    }
}
