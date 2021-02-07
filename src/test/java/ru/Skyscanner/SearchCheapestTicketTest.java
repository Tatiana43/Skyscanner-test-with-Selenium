package ru.Skyscanner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCheapestTicketTest {

    @Test
    public void searchCheapestTicketsForCertainDates() {

        System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

// Go to Skyscanner.com
        driver.get("https://skyscanner.ru/");

// Click on return tickets
        try {
            Thread.sleep(1000);
            driver.findElementById("fsc-trip-type-selector-return").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on From input field
        try {
            Thread.sleep(1000);
            driver.findElementById("fsc-origin-search").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Clear From input field
        try {
            Thread.sleep(1000);
            driver.findElementById("fsc-origin-search").clear();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Write SPb in From input field
        try {
            Thread.sleep(1000);
            driver.findElementById("fsc-origin-search").sendKeys("Санкт-Петербург Пулково (LED)");
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on Where input field
        try {
            Thread.sleep(1000);
            driver.findElementById("fsc-destination-search").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on Не можете определиться
        try {
            Thread.sleep(1000);
            driver.findElementById("react-autowhatever-fsc-destination-search").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on Date To
        try {
            Thread.sleep(1000);
            driver.findElementById("depart-fsc-datepicker-button").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Choose date (here 12.02.2021)
        try {
            Thread.sleep(1000);
            driver.findElementByClassName("BpkCalendarDate_bpk-calendar-date__1M0FZ BpkCalendarDate_bpk-calendar-date--focused__37Bt- BpkCalendarDate_bpk-calendar-date--selected__1fVNd").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on Date Back
        try {
            Thread.sleep(1000);
            driver.findElementById("return-fsc-datepicker-button").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Choose date (here 19.02.2021)
        try {
            Thread.sleep(1000);
            driver.findElementByClassName("BpkCalendarDate_bpk-calendar-date__1M0FZ BpkCalendarDate_bpk-calendar-date--focused__37Bt- BpkCalendarDate_bpk-calendar-date--selected__1fVNd").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

// Click on Find tickets
        try {
            Thread.sleep(1000);
            driver.findElementByXPath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

        // Switch to the opened page
        try {
            Thread.sleep(1000);
            driver.getCurrentUrl();

        }catch(Exception e)
        {
            System.out.println(e);
        }

        // Click on the first block
		try {
            Thread.sleep(1000);
            driver.findElementByXPath("//*[@id=\"destinations\"]/ul/li[1]/a").click();

        }catch(Exception e)
        {
            System.out.println(e);
        }

        // Make sure we have tickets which price is less than 4000 rubles
		// Get the first price and compare with 4000 rub.
//            int maxPrice = 4000;
//            int lowestPrice = driver.findElementByXPath("/html/body/div/div[2]/div/div[1]/div/div/div/div[1]/section/div[3]/ul/li[1]/ul/li[1]/div/div/div[2]/a[1]/div/span").getText();
//
//            if (lowestPrice > maxPrice) {
//                // If it's more than 4000, finish
//				System.out.println("К сожалению мы никуда в отпуск не едем");
//            }
//// If less, open the cheapest tickets
//				else



 // Click on the first (cheapest) tickets
        try {
            Thread.sleep(1000);
        driver.findElementByXPath("//*[@id=\"destinations\"]/ul/li[1]/ul/li[1]/div/div/div[2]/a[1]/div/svg/path").click();
        }catch(Exception e)
        {
            System.out.println(e);
        }

//  Switch to the opened new page
//        try {
//            Thread.sleep(1000);
//            driver.getCurrentUrl();
//
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }

//
//				// Click on the cheapest price (Самый дешевый)
//        try {
//				driver.findElementByXPath("//*[@id=\"app-root\"]/div[1]/div/div[2]/div[2]/div[1]/div[2]/button[2]").click();
//
//				// click on See the cheapest price (Посмотреть)
//				driver.findElementByXPath("//*[@id=\"app-root\"]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/a/div/div[3]/div/button").click();
//
//				// click on Expand the ticket Departure from
//				driver.findElementByXPath("//*[@id=\"app-root\"]/div/div[3]/div[1]/div[1]/button/div[2]").click();
//
//				// Save into the variable С какого города летим
//				String departureFrom = driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[2]/div/div[3]/span[1]").getText();
//
//				// Save into the variable Куда летим
//				String  destination = driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div/div/div[2]/div/div[3]/span[2]").getText();
//
//				// click on Expand the second ticket
//				driver.findElementByXPath("//*[@id=\"app-root\"]/div/div[3]/div[1]/div[2]/button/div[2]").click();
//
//				// Save into the variable С какого города летим
//				String departureBackFrom = driver.findElementByCssSelector("#app-root > div > div.DetailsPanelContent_content__El2wi > div.DetailsPanelContent_item__2U8Uo.DetailsPanelContent_left__1ietC > div:nth-child(2) > div:nth-child(3) > div > div > div.LegSegmentDetails_container__3wZa8 > div > div.Routes_routes__2_FZu > span:nth-child(1)").getText();
//
//				// Save into the variable Куда летим
//				String destinationBack = driver.findElementByCssSelector("#app-root > div > div.DetailsPanelContent_content__El2wi > div.DetailsPanelContent_item__2U8Uo.DetailsPanelContent_left__1ietC > div:nth-child(2) > div:nth-child(3) > div > div > div.LegSegmentDetails_container__3wZa8 > div > div.Routes_routes__2_FZu > span:nth-child(2)").getText();
//
//				System.out.println("Я лечу в отпуск! Туда: " + departureFrom +" - " + departureFrom);
//				System.out.println("Обратно: " + departureBackFrom +" - " + destinationBack);
//
//		}catch(Exception e)
//        {
//            System.out.println(e);
//        }
//

// maybe switch selenium to the opened tab

//        driver.quit();
    }
}
