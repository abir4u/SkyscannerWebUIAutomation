# SkyscannerWebUIAutomation

Website: https://www.skyscanner.co.nz/

### Project: Test Automation of a Couple of Basic User Stories with Focus on Architecture, Project Structure and Good Scripting Standards

- Language Used: **Java**
- Framework Used: **Selenium**
- Build Management Tool: **Maven**

#### Project Prerequisites:
Other than setting up the above mentioned language and tools on your machine, download the latest chrome driver and replace the existing path with the path of your installed chromedriver in the following document:
- File: /SkyscannerWebUIAutomation/Skyscanner/src/main/resources/envProfiles/config.properties
- Line #: 3


#### User Story 

Priority: Major

As a Product Owner 

I want to ensure that user is able to search direct return flights between two international cities

So that 

The user is able to explore the direct flight options.

#### Acceptance Criteria

- Only direct flights appear in the results
- If there are not direct flights then the user is presented with an appropriate error message
e.g. “Sorry, no direct results found – now showing results with stops.”
- This functionality works on at least 2 browsers (Chrome and Firefox )


#### A Couple of Glitches in the Project:
- While running the tests on Chrome browser, the Skyscanner website detects the automated actions on the page and prevents the scripts from accessing the Search Results page for the website.
- A persistent problem in wait function forced me to use Thread.sleep() of 5 seconds at one instance across the project during navigation from Search page to the Search Results page.
