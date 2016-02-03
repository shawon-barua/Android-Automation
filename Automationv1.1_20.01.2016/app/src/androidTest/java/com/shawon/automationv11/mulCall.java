package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class mulCall extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        // Wait till the Apps icon is on the screen
        device.wait(Until.hasObject(By.desc("Apps")), 3000);

        // UiObject2 appsButton = device.findObject(By.desc("Apps"));
        // appsButton.click();

        // Wait till the Calculator icon is on the screen
        device.wait(Until.hasObject(By.text("Phone")), 3000);

        UiObject2 Hangout = device.findObject(By.text("Phone"));
        Hangout.click();

    }

    public void testCall() throws Exception {

        for(int i=1;i<11;i++) {
            device.wait(Until.hasObject(By.res("com.android.contacts:id/dialButton")), 2000);


            device.waitForIdle(2000);

            UiObject2 zero = device.findObject(By.res("com.android.contacts:id/zero"));
            zero.click();

            UiObject2 one = device.findObject(By.res("com.android.contacts:id/one"));
            one.click();

            UiObject2 nine = device.findObject(By.res("com.android.contacts:id/nine"));
            nine.click();

            one.click();
            one.click();
            zero.click();

            UiObject2 five = device.findObject(By.res("com.android.contacts:id/five"));
            five.click();

            UiObject2 three = device.findObject(By.res("com.android.contacts:id/three"));
            three.click();

            UiObject2 six = device.findObject(By.res("com.android.contacts:id/six"));
            six.click();

            UiObject2 seven = device.findObject(By.res("com.android.contacts:id/seven"));
            seven.click();

            zero.click();


            UiObject2 resultText = device.findObject(By.res("com.android.contacts:id/dialButton"));
            resultText.click();

            device.waitForIdle(200000);


            UiObject2 cancel = device.findObject(By.res("com.android.incallui:id/endButton"));
            // cancel.click();
            //  wait(100000);

            device.wait(Until.hasObject(By.res("com.android.contacts:id/dialButton")), 800000);
            //  wait(100000);
        }
        //  snd.click();
        //device.swipe(660,1223,660,1223,10);

        // device.waitForIdle(5000);

        //device.swipe(140,438,435,438,40);
        // device.wait(Until.hasObject0(By.res("com.google.android.youtube:id/compact_video_item")), 6000);
        // UiObject2 video = device.findObject(By.res("com.google.android.youtube:id/compact_video_item"));
        // device.waitForIdle(3000);
        // video.click();
        // device.waitForIdle(3000);
        // assertTrue(result.equals("1"));

    }
}
