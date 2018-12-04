# Flipkart Testing

## Prerequisites

* Selenium IDE 2.9 version or higher 
* Eclipse IDE 
* Java

## Installation and Setup of Software
* Go to https://www.java.com/download/ and install Java (version 8).
* Type URL: https://addons.mozilla.org/en-us/firefox/addon/selenium-ide/ in your Firefox browser. 
  Selenium IDE Add-ons page will get open then Click on Add to Firefox button, allow the pop up and click on install.
  Restart your browser.
  Click on Tools menu list displayed at the top bar. Selenium IDE will be displayed in the list.
* Go to https://www.eclipse.org/downloads/ and download Eclipse IDE accordingly. Run the setup file and select Eclipse IDE for Java EE. 

## Run the Test
* Launch Firefox and Selenium IDE.
Type the value for our Base URL for example- http://www.flipkart.com
Toggle the Record button on to start recording. 
Perform your task.
Toggle the Record button off to stop recording.
Now save the test, Go to File menu, select save Test case.
Go back to Selenium IDE and click the Playback button to execute the whole script. Selenium IDE should be able to replicate everything.

## Export the test
 Go to File, select Export Test Case as eg. Java/Junit/Webdriver
 Save the file. 

## Commands in Selenium
 * Right-click on any blank space within the page, this will bring up the Selenium IDE context menu.
   Select the "Show Available Commands" option.
* Selenese commands can have up to a maximum of two parameters: target and value.
* Parameters are not required all the time. It depends on how many the command will need.
Add the commands during testing to run the test perfectly if needed or to insert any value or paramter. 

#We can run the test case exported from Selenium in eclipse as well and modify accordingly if needed.
