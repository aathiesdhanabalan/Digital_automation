@LoginFeature

  Feature: Login

    Background:
      User navigate to the BliBli tab

      @Test1
      Scenario: Verify user able to login the page
        Given User on BliBli page
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then User verify the email
        Then User enter in the login page



    @Test2
      Scenario: Verify tag in Orderdetailpage
        Given User on BliBli page
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then User verify the email
        Then User enter in the login page
        And User enters in the Orderdetailpage
        And Verify the invalid tag
        Then verify the product inside is invalid




