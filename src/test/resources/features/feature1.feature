#Author: Rahul
@openWeatherMap
Feature: OpenWeatherMap

  @tc101 @weatherMap
  Scenario Outline: TC101 - verify various details available on openweathermap home page
    Given the user is on the OpenWeatherMap home page
    Then verify OpenWeatherMap home page image is displayed
    And verify weather map tabs are displayed as '<tabNames>'
    And verify weather report can be viewed as '<weatherReport>'

    Examples:
      |tabNames												|weatherReport				|
      |Weather,Maps,API,Price,Partners,Stations,Widgets,Blog	|Main,Daily,Hourly,Chart,Map|