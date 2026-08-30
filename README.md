# Android Automation Test Suite

Automated UI and device testing framework for Android devices powered by **Android UI Automator 2.0** and **Android Instrumentation Test Runner**.

---

## 📌 Overview

This repository contains an end-to-end Android UI Automation test suite that automates user interactions, application flows, hardware toggles, and performance benchmark execution across physical Android devices and emulators.

Tests interact directly with system interfaces, hardware settings, and pre-installed or third-party applications by finding UI elements (`By.text`, `By.res`, `By.desc`) and simulating touch and gesture events.

---

## 🚀 Key Features & Test Coverage

### 1. ⚙️ Connectivity & System Controls
- **Airplane Mode** (`Airplane.java`): Automates toggling Airplane mode on and off via device Settings.
- **Bluetooth** (`blueTooth.java`): Automates Bluetooth discovery, enabling/disabling cycles.
- **Cellular Data** (`CellularData.java`): Verifies mobile network settings and data toggle controls.
- **Dual SIM** (`dualSIM.java`): Tests Dual SIM management interfaces and SIM card switching.
- **Wi-Fi** (`lWifi.java`): Automates Wi-Fi network scanning, connection, and toggle validation.

### 2. 📱 Core Applications & Utilities
- **Calculator - Basic** (`CalculatorAdd.java`): Automates arithmetic calculations and keypress sequences.
- **Calculator - Scientific** (`CalculatorSci.java`): Automates scientific formulas and trigonometric functions.
- **Camera - Front** (`CameraFront.java`): Switches to the front camera, toggles flash, and captures burst photos.
- **Camera - Rear** (`CameraRear.java`): Tests rear camera shutter clicks, flash control, and photo capture.
- **Camera - Direction Switch** (`CameraR.java`): Tests dynamic switching between front and rear cameras.
- **Phone / Dialer** (`zCall.java`): Automates dialpad interaction, number dialing, and call termination.
- **SMS Messaging** (`msgSender.java`): Automates composing and sending text messages to contacts.
- **Web Browser** (`Browser.java`): Automates web navigation and URL loading in default browser.
- **YouTube** (`YouTube.java`): Automates search queries and video playback initiation.

### 3. 🏎️ Benchmark & Gaming Performance Automation
- **AnTuTu Benchmark** (`Antutu.java`): Automates running full system benchmark tests.
- **CPU-Z** (`CPUZ.java`): Verifies CPU specs, SoC information, and temperature readings.
- **Hardware Info** (`HardwareInfo.java`): Checks device sensor and hardware telemetry screens.
- **NenaMark 2** (`Nenamark2.java`): Executes OpenGL ES 2.0 graphics performance benchmark.
- **Sensor Box** (`SensorBox.java`): Validates accelerometer, gyroscope, light, and proximity sensors.
- **Asphalt 8** (`Asphalt8.java`): Automates game launching and race session execution.

---

## 📂 Project Structure

```
Android-Automation/
├── Automationv1.1_20.01.2016/       # Main Android Studio project
│   ├── app/
│   │   ├── src/
│   │   │   ├── androidTest/java/com/shawon/automationv11/  # UI Automator Test Classes
│   │   │   │   ├── Airplane.java
│   │   │   │   ├── Antutu.java
│   │   │   │   ├── Asphalt8.java
│   │   │   │   ├── Browser.java
│   │   │   │   ├── CPUZ.java
│   │   │   │   ├── CalculatorAdd.java
│   │   │   │   ├── CalculatorSci.java
│   │   │   │   ├── CameraFront.java
│   │   │   │   ├── CameraR.java
│   │   │   │   ├── CameraRear.java
│   │   │   │   ├── CellularData.java
│   │   │   │   ├── HardwareInfo.java
│   │   │   │   ├── lWifi.java
│   │   │   │   ├── msgSender.java
│   │   │   │   ├── Nenamark2.java
│   │   │   │   ├── SensorBox.java
│   │   │   │   ├── YouTube.java
│   │   │   │   ├── blueTooth.java
│   │   │   │   ├── dualSIM.java
│   │   │   │   └── zCall.java
│   │   │   ├── main/
│   │   │   │   ├── AndroidManifest.xml
│   │   │   │   └── res/
│   │   │   └── test/java/com/shawon/automationv11/
│   │   │       └── ExampleUnitTest.java
│   │   └── build.gradle
│   ├── build.gradle
│   ├── settings.gradle
│   └── gradlew / gradlew.bat
├── .gitignore
└── README.md
```

---

## 🛠️ Tech Stack & Dependencies

- **Platform**: Android OS (API 21+ / Lollipop and newer)
- **Language**: Java
- **Testing Framework**:
  - `android.support.test.uiautomator:uiautomator-v18:2.1.0`
  - `android.support.test:runner:0.2`
  - `android.support.test:rules:0.2`
  - `junit:junit:4.12`

---

## 🏃 Running the Tests

### Prerequisites
1. Android SDK installed with `platform-tools` (`adb`) in your `PATH`.
2. An Android device or Android Virtual Device (AVD) with **USB Debugging** enabled.
3. Verify your device connection:
   ```bash
   adb devices
   ```

### Method 1: Android Studio (GUI)
1. Open the [`Automationv1.1_20.01.2016`](file:///c:/Users/Shawon/OneDrive/Documents/GitHub/Android-Automation/Automationv1.1_20.01.2016) folder in **Android Studio**.
2. Sync the project with Gradle.
3. Expand `app` > `src/androidTest/java/com/shawon/automationv11`.
4. Right-click on any test class or the entire package and click **Run 'Tests in com.shawon.automationv11'**.

### Method 2: ADB Command Line
You can trigger individual test cases or the full suite directly using the Android Instrumentation runner:

```bash
# Run a specific test case (e.g. Scientific Calculator test)
adb shell am instrument -w -r -e class com.shawon.automationv11.CalculatorSci com.shawon.automationv11.test/android.support.test.runner.AndroidJUnitRunner

# Run all test cases in the package
adb shell am instrument -w -r com.shawon.automationv11.test/android.support.test.runner.AndroidJUnitRunner
```

---

## 📄 License
This project is open-source and available for educational and automation testing purposes.
