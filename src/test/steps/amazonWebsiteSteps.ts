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
const text1 = this.page.locator("//a[contains(@class,'dcl-text-carousel-pill') and .//span[normalize-space()='Grocery']]");
  console.log(text1);
await expect(text1).toBeVisible();
  
});

When('I click on Grocery', async function (){
await this.page.locator("//a[contains(@class,'dcl-text-carousel-pill') and .//span[normalize-space()='Grocery']]").click();
  });

Then('I should be able to see Grocery page', async function (){
  const text3 = this.page.locator("//span[@class='acsWidgetCarouselV1__title' and text()='Beverages']");
  console.log(text3);
  await expect(text3).toBeVisible();
});

When('I select the product',async function (){
  await this.page.locator("//li[@aria-roledescription='slide' and .//span[text()='Red Bull Energy Drink 250 ml (Pack of 4)']]").click();
  await this.page.waitForTimeout(10000);
});

Then('I should be navigated to product details page',async function (){
const url = await this.page.waitForURL("https://www.amazon.co.za/Red-Bull-Energy-Drink-Pack/dp/B07MFYHPNK/ref=s9_acsd_al_ot_c2_x_1_t?_encoding=UTF8&pf_rd_m=AE08WJ6YKNBMC&pf_rd_s=merchandised-search-4&pf_rd_r=9WKFR0PAWM2SMYZEGHAB&pf_rd_p=dd3468a1-e9ed-4309-bed7-ae4919e0cb11&pf_rd_t=&pf_rd_i=206282429031");
console.log(this.page.url());
expect(this.page.url()).toMatch(url);  
});

When('I click on add to cart button',async function (){
  await this.page.locator("//input[@name='submit.addToCart']").click();
});

Then('I should be able to see the product in cart', async function (){
  const img = this.page.locator("//div[@data-asin='B07MFYHPNK']");
     await expect(img).toBeVisible({ timeout: 10000 });
});







  