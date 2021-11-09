Feature: TideStore Automation
Scenario: TideStore PowderText Check
     Given User launches the Chrome Browser
     When User opens URL of TideStore
     Then User should see the homepage of TideStore
     Then User hovers on shopProducts and clicks on powder
     Then PowderSearch Page appears
     And User verifies the PowderText
     
Scenario Outline: TideStore AntiBacterialText Check
     Given User is on homepage of TideStore
     When User enters "<searchtext>" in searchBox and clicks on find 
     Then User is navigated to AntiBacterial Page
     And User verifies the AntiBacterial Text
    
Examples:
       |searchtext   |
       |Antibacterial|
                      
Scenario: TideStore LandryText Check
     Given From homepage of eLocalStore
     When User clicks on learnMore 
     Then User is navigated to LaundryPage
     And User verifies the LaundryText
     
     