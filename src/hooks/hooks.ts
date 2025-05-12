import { Before, After } from '@cucumber/cucumber';
import { Browser, chromium, Page } from '@playwright/test';

let browser: Browser;
let page: Page;

Before(async function () {
  browser = await chromium.launch({ headless: false });
  const context = await browser.newContext();
  page = await context.newPage();
   await page.goto('https://www.bbc.com/sport', { waitUntil: 'load', timeout: 60000 });
  this.page = page;
});

After(async function () {
  await browser.close();
});
