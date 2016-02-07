package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class YouTube extends InstrumentationTestCase{

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
        device.wait(Until.hasObject(By.desc("Folder: Google")), 3000);

        UiObject2 google = device.findObject(By.desc("Folder: Google"));
        google.click();

    }

    public void testAdd() throws Exception {

        device.wait(Until.hasObject(By.text("YouTube")), 6000);

        UiObject2 tube = device.findObject(By.text("YouTube"));
        tube.click();
          device.waitForIdle(3000);
         UiObject2 search = device.findObject(By.desc("Search"));
         search.click();

       UiObject2 resultText = device.findObject(By.res("com.google.android.youtube:id/search_edit_text"));
       resultText.setText("walton");
              device.waitForIdle(3000);
      device.swipe(660,1223,660,1223,10);

        //device.waitForIdle(5000);

           //device.swipe(140,438,435,438,40);
        device.wait(Until.hasObject(By.res("com.google.android.youtube:id/compact_video_item")), 6000);
       UiObject2 video = device.findObject(By.res("com.google.android.youtube:id/compact_video_item"));
       // device.waitForIdle(3000);
        video.click();
       // device.waitForIdle(3000);
       // assertTrue(result.equals("1"));

    }
}
