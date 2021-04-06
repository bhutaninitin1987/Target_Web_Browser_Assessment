# Target_Web_Browser_Assessment
Repo for Target Web Browser Assessment

## The Problem - Web Browser Test

Using the Time tracker https://timetracker.anuko.com/login.php, create automated web browser test for the below Acceptance Criteria

### Acceptance Criteria

#### Scenario 1: Update user Password

```markdown
Given I login to the timetracker as an existing user
And I update the Password of the user
And I logout from the timetracker
When I login with the updated timetracker user details
Then I am able to login successfully
```

#### Scenario 2: Update user Login

```markdown
Given I login to the timetracker as an existing user
And I update the Login of the user
And I logout from the timetracker
When I login with the updated timetracker user details
Then I am able to login successfully
```

## Solution
### JAVA - TestNG - Page Object - TDD - Selenium

I have automated the above test scenarios in Java using TestNG framework with Selenium.

The framework is developed in TDD approach and based on page object model. There are 3 classes under pageobjects which represent different pages of the time tracker web application.
- LoginPage
- ProfileEditPage
- TimePage

The "_TestScenarios_" class under testcase package contains boths the test scenarios along with BeforeMethod and AfterMethod functions.
- BeforeMethod - initializeDriver() - This method is used to initialize the driver and it gets executed before execution of each test method. 
- AfterMethod - closeDriver() - This method is used to close the driver and it gets executed after completion of each test method.
- updateUserPassword() - This method represents Scenario 1 of the problem statement.
- updateUserLogin() - This method represents Scenario 2 of the problem statement.

There is one additional file under testcase package.
- TestSuite.xml - This file contains the list of the tests to execute using this framework.

In addition to above, there is an additional folder named as "_test-output_" folder which contains the execution results from my local machine. This is the standard reporting functionality of TestNG framework.

## Improvements

- Reporting functionality - Due to less time, I didn't get chance to improve the reporting of this framework which will be used to generate the better test execution report.
- BDD Implementation - I would also like to upgrade this framework to BDD approach using Cucumber or any other BDD tools.
