import { Given,When, Then } from '@cucumber/cucumber';
import { expect, request } from '@playwright/test';
import assert from 'assert';

Given('I hit the api endpoint', async function () {

  const apiContext = await request.newContext();

  this.response = await apiContext.get(
    'https://jsonplaceholder.typicode.com/users'
  );

  this.statusCode = this.response.status();
});

Then('I should receive a response with status code {int}', async function (status:number) {
      const actualStatus = await this.statusCode ;
      console.log('Status code:', status);
      expect(actualStatus).toBe(status);
})

Then('I should see the user id', async function () {
  const responseBody = await this.response.json();
  const userId = responseBody[0].id;
  expect(userId).toBeDefined();
  console.log('User ID:', userId);
})

Then('I should see the user email',async function () {
  const responseBody = await this.response.json();
  const userEmail = responseBody[0].email;
  expect(userEmail).toBeDefined();
  console.log('User Email:', userEmail);
})

Then('I should see the user name',async function () {
  const responseBody = await this.response.json();
  const userName = responseBody[0].name;
  expect(userName).toBeDefined();
  console.log('User Name:', userName);
})

Then('I should see the user address',async function () {
  const responseBody = await this.response.json();
  const userAddress = responseBody[0].address;
  expect(userAddress).toBeDefined();
  console.log('User Address:', userAddress);
})








