# bbc-f1-results-playwright
SriniAssesment
BBC Sport - 2023 Las Vegas Grand Prix Results Automation

This project uses Playwright with Cucumber (Gherkin) in TypeScript to automate test scenarios for the BBC Sport website, specifically validating the Formula 1 Grand Prix results for Las Vegas 2023.

Project Structure:

 hooks
   └── hooks.ts                 
 pages
   └── grandprixpage.ts          

 features
   └── BBCFeature.feature        
 step-definitions
   └── grandpristeps.ts           

📄 cucumber.config.ts            
📄 playwright.config.ts          
📄 package.json
📄 tsconfig.json

 Test Scenarios:

 Scenario 1: Validate Top 3 Finishers

Navigate to Formula 1 section

View 2023 Las Vegas GP results

Assert:

 Max Verstappen in first place

 Charles Leclerc in second place

 George Russell in third place

 Scenario 2: Retrieve Search Results

Search for "Sport in 2023"

Assert at least 4 relevant results are returned

 Getting Started

1. Install dependencies

npm install

You can also configure scripts in package.json for easier execution.

Tech Stack Are below:

Playwright

Cucumber.js

TypeScript

Useful Commands

Description----Command

Run all feature files-: npx cucumber-js or npm run web_cucumber_test

npx playwright: show-report-View the HTML report

 Author:

Developed by a SRINIVAS TALASANI (QA Engineer) passionate about automation 

