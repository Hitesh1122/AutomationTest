# AutomationTest

## Project Description
This project contains Selenium automation tests for the rb-shoe-store website.

## Setup Instructions
### Prerequisites:
*   Java JDK (version 8 or higher recommended)
*   Selenium WebDriver
*   TestNG
*   Browser Drivers (e.g., Firefox GeckoDriver, Chrome ChromeDriver)

### Project Setup:
To set up the project, you can either:
1.  **Using a build automation tool (like Maven or Gradle):**
    *   Create a new Java project.
    *   Add the following dependencies to your `pom.xml` (for Maven) or `build.gradle` (for Gradle) file:
        *   Selenium Java bindings
        *   TestNG
    *   The build tool will automatically download and manage the required JAR files.
2.  **Manual Setup:**
    *   Create a new Java project in your IDE (e.g., Eclipse, IntelliJ).
    *   Download the Selenium WebDriver Java client drivers and TestNG JAR files.
    *   Add these JARs to your project's build path.
    *   Download the necessary browser drivers (GeckoDriver for Firefox, ChromeDriver for Chrome, etc.) and ensure they are in your system's PATH or specify their location in your test scripts.

## Running the Tests
Tests can be executed using TestNG.
1.  **Using an IDE (Eclipse/IntelliJ):**
    *   Ensure your project is correctly configured with TestNG.
    *   Right-click on a TestNG XML suite file (e.g., `testng.xml` if present) or a specific test class.
    *   Select "Run As > TestNG Test".
2.  **Using Command Line (with Maven/Gradle):**
    *   If your project is set up with Maven, you can run tests using the command: `mvn test`
    *   If your project is set up with Gradle, you can run tests using the command: `gradle test`
    *   These commands will typically look for a `testng.xml` file in a predefined location (e.g., `src/test/resources/`) or run tests based on conventions.

(Note: Based on the provided file structure, specific TestNG XML files were not listed. If you have TestNG XML files, you would typically use those to run specific suites of tests.)

## Project Structure
*   `EclipseWorskspace/AutomationSeleniumProject/src/rbShoeAutomation/`: Contains the TestNG test classes (`MonthVerification.java`, `EmailVerification.java`).
*   `EclipseWorskspace/AutomationSeleniumProject/src/rbShoeUtil/`: Contains utility classes for the tests (`Util.java`).
*   `Testcases/`: Contains test case documents (e.g., `Testcase Sheet.xlsx`).
*   `Script X Execution Report/`: Contains TestNG HTML reports.
*   `README.md`: This file.
