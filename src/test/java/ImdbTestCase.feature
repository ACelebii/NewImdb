Feature: ImdTestCase

  Background: User is navigated to the URL successfully
    Given browser is open
    And user is on landing page

  @Smoke
  Scenario: Check if both of the selected movies have same features for first movie
    When user clicks on menu button
    And user clicks on oscars button from under the title of Award & Events and goes to the oscars page
    And user selects the year from event history title and goes to the awards page
    And user selects the movie from under the title of Honorary Award and goes to the movie detail page
    And user saves informations and clicks on IMDb button and goes back to the home page
    And user enters "Şarlo Sirkte" on textbox and clicks search button and goes the results page
    And user selects the movie goes to the new movie detail page
    And user checks if the information of director, writer and stars of the movie are matched
    Then user clicks on photos link and goes to the photo gallery page and checks if there is any broken image

  @Regression
  Scenario: Check if both of the selected movies have same features for second movie
    When user clicks menu button
    And user clicks on all events from under the title of Award & Events and goes to the all events page
    And user selects the grammy awards title and goes to the grammy awards page
    And user selects the movie from under the title of Event History
    And user selects the movie and goes to the second movie detail page
    And user saves second informations and clicks on IMDb button and goes back to the new home page
    And user enters "The Jazz Singer" on textbox and clicks search button and goes the new results page
    And user selects the movie goes to the new second movie detail page
    And user checks if the new information of director, writer and stars of the movie are matched
    Then user clicks on photos link and goes to the new photo gallery page and checks if there is any broken image