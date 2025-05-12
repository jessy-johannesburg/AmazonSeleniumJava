import { Given,When, Then } from '@cucumber/cucumber';
import { expect } from '@playwright/test';
import { GrandPrixPage } from '../../pages/grandprixpage';

Given('As a BBC editor launched the BBC Sport homepage', async function (){
  const page = this.page;
  this.grandprixPage = new GrandPrixPage(page);
      await this.grandprixPage.sportHeadingIsVisible();
})


When('I clicked on Formula 1', async function () {
    await this.grandprixPage.clickFormula1();
  });

  Then('I should be navigated to formula1 page', async function () {
    await this.grandprixPage.isNavigatedToFormula1();
  });

  When('I clicked on Results option', async function () {
    await this.grandprixPage.clickResults();
  });

When('I selected the year',async function () {
  await this.grandprixPage.selectYear();

  });

  Then('I should be navigated to Results page', async function () {
    await this.grandprixPage.isNavigatedToResults();
  });

  Then('I should see Max Verstappen in first place', async function () {
    await this.grandprixPage.firstPositionIsVisible();
  });
  
  Then('I should see Charles Leclerc in second place', async function () {
    await this.grandprixPage.secondPositionIsVisible();
  });
  
  Then('I should see George Russell in third place', async function () {
    await this.grandprixPage.thirdPositionIsVisible();
  });

  //Second Scenario steps
  When('I clicked on search box', async function () {
await this.grandprixPage.clickSearchIcon();
  });
 Then('I should see serach input box', async function () {
      await this.grandprixPage.verifySearchInputBoxIsVisible();
  });
 Then('I should see at least {int} relevant search results', async function (int) {    
      await this.grandprixPage.getRelevantSearches();
  });

 When('I entered {string} as Sport in 2023 into the search bar', async function (Search_Text:string) {
   await this.grandprixPage.enterTxt(Search_Text); 
      
 });
    
 When('I submitted the search', async function () {
          await this.grandprixPage.submitSearch();
         
  });









