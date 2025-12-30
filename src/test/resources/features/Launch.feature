Feature: Validate Controls and other screens in ApiDemos app

  Scenario: User interacts with Controls Light Theme screen
    Given the user launches the ApiDemos application
    When the user navigates to Views
    And the user opens Controls
    And the user selects Light Theme
    Then the Controls Light Theme screen should be displayed
    And the user enters text in the input field
    And the user selects a checkbox
    And the user selects a radio button
    And the user selects an option from the dropdown

  Scenario: User interacts with Controls Dark Theme screen
    Given the user launches the ApiDemos application
    When the user navigates to Views
    And the user opens Controls
    And the user selects Dark Theme
    Then the Controls Dark Theme screen should be displayed
    And the user enters text in the input field
    And the user selects a checkbox
    And the user selects a radio button
    And the user selects an option from the dropdown

  Scenario: User interacts with Animation / Multiple Properties screen
    Given the user launches the ApiDemos application
    When the user opens Animation
    And the user selects "Multiple Properties"
    Then the Multiple Properties screen should be displayed
    And the user performs the animation

  Scenario: User views Arcs in Graphics
    Given the user launches the ApiDemos application
    When the user opens Graphics
    And the user opens Arcs
    Then the Arcs screen should be displayed

  Scenario: User adjusts Seek Bar
    Given the user launches the ApiDemos application
    When the user navigates to Views
    And the user selects "Seek Bar"
    Then the Seek Bar screen should be displayed
    And the user moves the slider to 20 percent
  
  Scenario: User triggers SMS intent from ApiDemos
    Given the user launches the ApiDemos application
    And the user navigates to OS menu
    And the user opens SMS Messaging screen
    When the user enters recipient number "1234567890"
    And the user enters message body "Hello from Appium"
    And the user taps on Send button
    Then the SMS intent should be triggered successfully

  Scenario: User triggers App Notification from Incoming Message
    Given the user launches the ApiDemos application
    When the user opens App menu
    And the user opens Notification menu
    And the user opens Incoming Message screen
    And the user taps on Show App Notification
    And the user opens the notification panel
    And the user closes the notification panel
    Then the application should be in foreground

