# BlazeDemo Automation FrameWork with Page Object Model ( Page Factory )

## Tech Stack
-Java
-Selenium WebDriver
-TestNG
-Maven
-Page Object Model ( POM - Page Factory )
-Extent Reports

## Project Structure

-src/main/java -> pages, utils
-src/test/java -> dataProviders , listeners , functional ,negative ,smoke ,tests
-src/test/resources -> completeProject.xml ( complete project execution ) , smoke.xml ( for smoke group  execution) , functional.xml ( for function group execution) , negativeGroup.xml( for negative 
                       group execution )
-Reports -> all reports of respected .xml 
-SereenShot -> screenshot of all failed test
-pom.xml -> for manage all dependencies

## Features

- E2E test for flight Booking (Blaze Demo)
- Test based on groups which inludes Smoke , Functional , Negative test cases 
- Assertions and Validations
- ScreenShot on failure
- Extent Reports for complete execution and for different groups also 

## How to Run

-Through .xml file
-Through CLI mvn test

