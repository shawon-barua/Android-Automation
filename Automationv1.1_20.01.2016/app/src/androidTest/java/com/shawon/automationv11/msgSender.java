package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class msgSender extends InstrumentationTestCase{

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
        device.wait(Until.hasObject(By.text("Messaging")), 3000);

        UiObject2 Hangout = device.findObject(By.text("Messaging"));
        Hangout.click();

    }

    public void testMsg() throws Exception {

        device.wait(Until.hasObject(By.res("com.android.mms:id/amigo_overlap")), 2000);

        UiObject2 newConversion = device.findObject(By.res("com.android.mms:id/amigo_icon1"));
        newConversion.click();
          device.waitForIdle(2000);
         //UiObject2 conversion = device.findObject(By.clazz("android.widget.TextView"));
      //   conversion.click();
      //  device.waitForIdle(2000);
       // conversion.setText("01911053670");
        UiObject2 resultText = device.findObject(By.res("com.android.mms:id/embedded_text_editor"));
        //resultText.clear();
      //  resultText.click();
        device.waitForIdle(7000);
       // resultText.setText("Test");
        for(int j=1;j<=4;j++) {
            for (int i = 1; i < 2; i++) {
                device.swipe(107, 888, 107, 888, 0);
                device.waitForIdle(1000);
                device.swipe(72, 1001, 71, 1001, 0);
                device.waitForIdle(1000);
                device.swipe(648, 995, 648, 995, 0);
                device.waitForIdle(1000);
                device.swipe(324, 888, 324, 888, 0);
                device.waitForIdle(1000);
                device.swipe(612, 892, 612, 892, 0);
                device.waitForIdle(1000);
                device.swipe(504, 1111, 504, 1111, 0);
                device.waitForIdle(1000);
                device.swipe(360, 1212, 360, 1212, 0);

            }

            device.swipe(360, 1212, 360, 1212, 0);



            //device.swipe(433, 1111, 433, 1111, 0);
            //device.swipe(535, 794, 355, 794, 0);

        }
        device.pressBack();
        device.pressBack();

        UiObject2 press = device.findObject(By.res("com.android.mms:id/amigo_button1"));
        device.swipe(635, 1230, 535, 1232, 0);
        //press.click();
       // device.waitForIdle(4000);
        device.pressBack();


    }
}
