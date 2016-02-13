package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class playStore extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        device.wait(Until.hasObject(By.desc("Apps")), 3000);

        // Wait till the Calculator icon is on the screen
        device.wait(Until.hasObject(By.text("Play Store")), 3000);

        UiObject2 playStore = device.findObject(By.text("Play Store"));
        playStore.click();

    }

    public void testPlayStore() throws Exception {

        device.wait(Until.hasObject(By.res("android.widget.FrameLayout")), 4000);

        device.swipe(665, 100, 665, 100, 0);
        device.wait(Until.hasObject(By.res("com.android.vending:id/search_box_text_input")), 4000);
       // device.waitForIdle(12000);
        device.swipe(70, 1000, 70, 1000, 0);
        device.waitForIdle(1000);
        device.swipe(501, 1106, 501, 1106, 0);
        device.waitForIdle(1000);
        device.swipe(325, 888, 325, 888, 0);
        device.waitForIdle(1000);
        device.swipe(467, 890, 467, 890, 0);
        device.waitForIdle(1000);
        device.swipe(325, 888, 325, 888, 0);
        device.waitForIdle(1000);
        device.swipe(467, 890, 467, 890, 0);
        device.waitForIdle(5000);
        device.swipe(660, 1209, 660, 1209, 0);
        device.waitForIdle(5000);

        device.swipe(250, 320, 250, 320, 0);
        device.waitForIdle(1000);

       // device.swipe(359, 264, 359, 264, 0);
      //  device.waitForIdle(9000);

        UiObject2 antutu = device.findObject(By.text("AnTuTu Benchmark"));
        antutu.click();
        device.waitForIdle(9000);
        device.wait(Until.hasObject(By.res("android.widget.FrameLayout")), 1000);
        UiObject2 install = device.findObject(By.text("INSTALL"));
        install.click();

        device.wait(Until.hasObject(By.res("com.android.vending:id/continue_button")), 2000);
        UiObject2 accept = device.findObject(By.text("ACCEPT"));
        accept.click();

        device.wait(Until.hasObject(By.res("com.android.vending:id/title_thumbnail")), 8000);

        device.swipe(509, 589, 509, 589, 0);
        device.waitForIdle(1000);

    }
}
