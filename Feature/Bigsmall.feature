Feature: Testing Bigsmall.in features and functionalities
Scenario Outline: Shop Products using searchtext
     Given User is on the Bigsmall homepage
     When User enters "<desired searchtext>" in the searchbox and User clicks on enter 
     Then The searchtext results page appears
     And User picks the desired choice of product
     And User adds them to wishlist
Examples: 
|desired searchtext|
|Gifts for children|    
Scenario: Shop Products using Homepage header links
     Given User is on the homepage of Bigsmall
     When User hovers on gifts link and User clicks on Birthday Gifts 
     Then The link results page appears
     And User picks the desired choice of product under Header link results page
     And User adds them to Cart  
Scenario Outline: Shop Products using Merchandise section Logos
     Given User is on the homepage of Bigsmall
     When User clicks on DC logo under official Merchandise section
     Then The DCLogo results page appears
     And User picks the Superman Bottle
     And User enters his or her "<PIN code>" and User clicks on check button  
     Then Notification about Delivery appears
Examples:
|PIN code|     
|600128|
Scenario Outline: Retrieve password using Login page forgot feature
     Given User is on the homepage of Bigsmall
     When User clicks on SignIn button
     Then The Login page appears
     And User clicks on forgot button
     And User enters his or her "<Email ID>" and clicks on submit button
     Then Notification about password reset link sent to Email appears
Examples:
|Email ID          |
|asasasas@gmail.com|     
Scenario: Accesing Product Checkout feature from Cart
     Given User is on the homepage of Bigsmall
     When User clicks on Cart button
     Then The Cart page appears
     And User clicks on Go to Checkout button
     Then Whatsapp page popup appears and when User closes it the Checkout page appears
     And User clicks on Return to Cart
Scenario: Accessing Product Remove feature from Cart
     Given User is on the homepage of Bigsmall
     When User clicks on Cart button
     Then The Cart page appears
     And User clicks on remove button
     Then Item is removed from Cart
Scenario: Accesing Product remove feature from Wishlist
     Given User is on the homepage of Bigsmall
     When User clicks on Wishlist button
     Then The Wishlist page appears
     And User clicks on access wishlist and clicks on remove button
     Then Item is removed from Wishlist
Scenario Outline: Accesing Contact Us feature from Footer
     Given User is on the homepage of Bigsmall
     When User clicks on Contact Us button
     Then The Contact Us page appears
     And User enters "<Name>","<Email>" and "<Message>" and clicks on submit button 
     Then Notification appears
Examples:
|Name       |Email                     |Message                                                    |
|Karthik	|karthikroczz@gmail.com    |	Website has lot of popups and captchas.Can avoid these.|     
Scenario Outline: Accesing Login feature
     Given User is on the homepage of Bigsmall
     When User clicks on Sign In button
     Then The Login page appears
     And User enters "<Email>","<Password>" and clicks on Sign In  
     Then HomePage appears with User logged into his or her account
Examples:
|Email              | Password  |
|asasasas@gmail.com	|asasasaa123|                         
Scenario: Accesing About Us feature from Footer
     Given User is on the homepage of Bigsmall
     When User clicks on About Us button
     Then The About Us page appears
     And User clicks on Facebook link 
     Then Bigsmall Facebook home page appears       