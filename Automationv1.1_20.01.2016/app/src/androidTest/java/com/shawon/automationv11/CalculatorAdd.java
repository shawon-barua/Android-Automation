package com.shawon.automationv11;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.Until;
import android.test.InstrumentationTestCase;

public class CalculatorAdd extends InstrumentationTestCase{

    private UiDevice device;

    @Override
    public void setUp() throws Exception {

        device = UiDevice.getInstance(getInstrumentation());
        device.pressHome();

        // Wait till the Apps icon is on the screen
       // device.wait(Until.hasObject(By.desc("Apps")), 3000);
        device.wait(Until.hasObject(By.text("Calculator")), 3000);

        UiObject2 calculatorApp = device.findObject(By.text("Calculator"));
        calculatorApp.click();

    }

    public void testAdd() throws Exception {


        device.wait(Until.hasObject(By.text("9")), 3000);
        for(int i=1;i<=10;i++)
        {
            device.swipe(600,570 ,600,570, 0);
        }

        device.waitForIdle(6000);
        UiObject2 buttonNine = device.findObject(By.text("9"));
        buttonNine.click();

        UiObject2 buttonPlus = device.findObject(By.text("+"));
        buttonPlus.click();

        buttonNine.click();

        UiObject2 buttonEquals = device.findObject(By.text("="));
        buttonEquals.click();

        device.waitForIdle(3000);

        UiObject2 resultText = device.findObject(By.clazz("android.widget.EditText"));
        String result = resultText.getText();

        assertTrue(result.equals("18"));
    }
}
