import { Given,When, Then } from '@cucumber/cucumber';
import { expect,Page } from '@playwright/test';



Given('I opened amazon website', async function () {
  await this.page.goto('https://www.amazon.co.za/');
});

Then('I verify update location text', async function () {
  // using page locator
  const text = await this.page.locator("#glow-ingress-line2").textContent();
  console.log(text);

//using page fixture
// console.log(await this.page.textContent("#glow-ingress-line2"));
});

When('I click on Everyday essentials', async function (){
await this.page.locator("//div[@class='nav-div']//a[text()='Everyday Essentials']").click();
  });

  Then('I should be able to see Grocery', async function (){
const text1 =  this.page.locator("//a[contains(@class,'dcl-text-carousel-pill') and .//span[normalize-space()='Grocery']]");
 const textValue = await text1.textContent();
expect(textValue).toContain('Grocery');
  });

When('I click on Grocery', async function (){
  // await this.page.waitForTimeout(30000);
await this.page.locator("//a[contains(@class,'dcl-text-carousel-pill') and .//span[normalize-space()='Grocery']]").click();
  });

Then('I should be able to see Grocery page', async function (){
  const text3 = this.page.locator("//span[@class='acsWidgetCarouselV1__title' and text()='Beverages']");
  const textValue1 = await text3.textContent();
  expect(textValue1).toContain('Beverages');
  
});

When('I select the product',async function (){
  // await this.page.waitForTimeout(30000);
  await this.page.locator("//li[@aria-roledescription='slide' and .//span[text()='Red Bull Energy Drink 250 ml (Pack of 4)']]").click();
  ;
});

Then('I should be navigated to product details page',async function (){
  // await this.page.waitForTimeout(30000);
await expect(this.page).toHaveURL(/\/dp\/B07MFYHPNK/);
// expect(this.page).toHaveURL(URL);  
});

When('I click on add to cart button',async function (){
  // await this.page.waitForTimeout(20000);
  await this.page.locator("//input[@name='submit.addToCart']").click();
});

Then('I should be able to see the product in cart', async function (){
  const img = this.page.locator("//div[@data-asin='B07MFYHPNK']");
  expect(img).toBeVisible({ timeout: 20000 });
});







  