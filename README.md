# SignUpAutomation - QA Technical Assignment

## Description
This project contains automation scripts for testing the Sign Up flow of the product:
https://architect-testing.projectsmate.com/signup

### Tests Included
- **Valid Sign Up Test** – Verifies successful sign up with correct data.
- **Invalid Sign Up Test** – Verifies validation messages and errors for incorrect data.

## How to Run Tests

### Prerequisites
- Java 8 or above
- Maven installed
- ChromeDriver in PATH (or WebDriverManager)

### Steps
1. Clone the repo:
git clone https://github.com/annremold/ProjectMate.git
2. Navigate to project folder:
cd signUpAutomation
3. Run directly from IDE:
- Right-click `testng.xml`
- Select **Run As → TestNG Suite**

## Test Reports
- TestNG reports are generated in the `test-output` folder.
- Open `test-output/index.html` in a browser to view detailed test results
