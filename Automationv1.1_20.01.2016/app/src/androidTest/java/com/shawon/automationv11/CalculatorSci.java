package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class CalculatorSci extends InstrumentationTestCase{

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
        device.wait(Until.hasObject(By.text("Calculator")), 3000);

        UiObject2 calculatorApp = device.findObject(By.text("Calculator"));
        calculatorApp.click();

    }

    public void testSci() throws Exception {

        device.wait(Until.hasObject(By.text("9")), 3000);

        UiObject2 buttonNine = device.findObject(By.text("0"));
        // buttonNine.click();

        UiObject2 buttonPlus = device.findObject(By.text("+"));
        // buttonPlus.click();

        // buttonNine.click();

        UiObject2 buttonEquals = device.findObject(By.text("="));
        //  buttonEquals.click();

        //

        for(int i=1;i<=10;i++)
        {
            device.swipe(600,570 ,600,570, 0);
        }

        device.waitForIdle(6000);
       // UiObject2 CLEAR = device.findObject(By.text("clr"));
       // CLEAR.click();

        device.swipe(700,900 , 175,900, 40);

        device.waitForIdle(3000);
        UiObject2 cos1 = device.findObject(By.res("com.android.calculator2:id/digit_9"));
        cos1.click();
        device.waitForIdle(1000);
        device.swipe(175, 900, 700, 900, 40);
        device.waitForIdle(1000);
        buttonNine.click();
        device.waitForIdle(1000);
        UiObject2 resultText = device.findObject(By.res("com.android.calculator2:id/result"));
        String result = resultText.getText();
        buttonEquals.click();

        // UiObject2 resultText = device.findObject(By.res("com.android.calculator2:id/result"));
        //   String result = resultText.getText();
        //  assertTrue(result.equals(1));

        device.waitForIdle(3000);

        // UiObject2 resultText = device.findObject(By.clazz("android.widget.EditText"));


        assertTrue(result.equals("1"));
    }
}
