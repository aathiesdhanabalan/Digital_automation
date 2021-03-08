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
        Then verify the product inside is valid


    @Test3
    Scenario: Verify tag in dipatakan Orderdetailpage
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      And User enters in the Orderdetailpage
      And Verify the invalid tag

    @Test4
    Scenario: Verify search box is available
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      And User enters in the Orderdetailpage
      And Verify the header and searchbox

    @Test5
    Scenario: Verify header is available
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      And User enter in the login page
      And User enters in the Orderdetailpage
      And Verify the header and searchbox

    @Test6
    Scenario: Verify report is available/not
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      And User verify the reportpage
      #And User enters in the Orderdetailpage
      #And Verify the invalid tag
      #Then verify the product inside is invalid

    @Test7
    Scenario: Verify Image is availble
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      Then verify for image

    @Test8
    Scenario: Verify first item is Valid item(Dispensen)
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      And User enters in the Orderdetailpage

    @Test9
    Scenario: Verify first item is Valid item(Dipatalkam)
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page

    @Test10
    Scenario: Verify that report is negative in invalid page
      Given User on BliBli page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then User verify the email
      Then User enter in the login page
      And User enters in the Orderdetailpage
      And Verify the invalid tag





