# SkyscannerWebUIAutomation

Website: https://www.skyscanner.co.nz/

### Project: Test Automation of a Couple of Basic User Stories with Focus on Architecture, Project Structure and Good Scripting Standards

- Language Used: **Java**
- Framework Used: **Selenium**
- Build Management Tool: **Maven**
- IDE Used: **IntelliJ IDEA** (optional)

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

#### Running the Script:
Feel free to use Maven lifecycle methods on Terminal to run this project.

However, in case your IDE is not correctly set up for Maven builds, you can use the following steps to run the test:

##### Common Steps
- Launch IntelliJ IDEA
- Open the pom.xml file within the project folder
##### Method 1
- Navigate to "View -> Tool Window -> Maven projects" to view the Maven projects window open as your right panel
- Expand the project folder > "lifecycle" directory > Double Click "clean"

##### Method 2
- Navigate to Terminal
- Type in the following:
/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/bin/java "-Dmaven.multiModuleProjectDirectory=<**local path for repository**>/Skyscanner" "-Dmaven.home=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58039:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.5.2.jar" org.codehaus.classworlds.Launcher -Didea.version=2017.1.3 install


#### A Couple of Glitches in the Project:
- While running the tests on Chrome browser, the Skyscanner website detects the automated actions on the page and prevents the scripts from accessing the Search Results page for the website. It takes you to the I'm Not a Robot page in Google Chrome. You should not have any such issue while running it on Firefox browser.
- A persistent problem in wait function during navigation forced me to use Thread.sleep() of 5 seconds at one instance across the project. This is used during navigation from Search page to the Search Results page.
