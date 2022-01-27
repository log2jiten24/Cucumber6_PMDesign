package seleniumcodingchallenge;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandling {

	static WebDriver driver;

	@Test(dataProvider = "departDate")
	public void tripodeCalendarHandling(String date , String month , String year) throws Exception {

		// Validate if the calendar date is valid
		/*
		 * It should not be past date It should not exceed a year from current date
		 * 
		 */
		String dayToBeSelected =   date ;
		String monthToBeSelected = month ;
		String yearToBeSelected =  year ;

		String finalDatetoSelect = String.join("-", dayToBeSelected, monthToBeSelected, yearToBeSelected);
		System.out.println("Day to Select :" + finalDatetoSelect);

		// get the currentDate along with the current time zone
		LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
		System.out.println("CurrentDate timie :" + currentDate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		// convert the date to the dd-MMMM-yyyy format
		LocalDate formatDepartDate = LocalDate.parse(finalDatetoSelect, formatter);
		System.out.println("Final Date TO Select :" + formatDepartDate);

		boolean isDateValid = true;

		if (formatDepartDate.isBefore(currentDate)) {

			System.out.println("Depature Date cannot be past date ");
			isDateValid = false;
		}

		// Increase the Date to next 1 year
		LocalDate maxDepartDate = currentDate.plusYears(1);
		System.out.println("Max Departure Date :" + maxDepartDate);

		if (formatDepartDate.isAfter(maxDepartDate)) {

			System.out.println("Depart  Date cannot be past 1 year from the current Date ");
			isDateValid = false;
		}

		if (isDateValid) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tripodeal.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//input[@id='dateNew']"));
		
		if (ele.isEnabled()) {

		// click on the Date Element
		ele.click();
		}
		// verify if the calendar is Opened or not
		Assert.assertTrue(driver.findElement(By.id("dateNew_table")).isDisplayed());

		// get the current Year
		String current_Year = driver.findElement(By.xpath("(//div[@class = 'picker__year'])[1]")).getText();

		if (!current_Year.equals(yearToBeSelected)) {

			boolean flag = false;
			do {

				driver.findElement(By.xpath("(//div[@class = 'picker__nav--next'])[1]")).click();
				Thread.sleep(3000);

				String year_to_Select = driver.findElement(By.xpath("(//div[@class = 'picker__year'])[1]")).getText();

				flag = year_to_Select.equals(yearToBeSelected);// this will true the flag - once the condition is
																// satisfied

			} while (!flag);// reverse the condition - once the flag is true - it will exit the loop
		}
		// get the current Month--select the month
		String current_Month = driver.findElement(By.xpath("(//div[@class = 'picker__month'])[1]")).getText();

		if (!current_Month.equals(monthToBeSelected)) {

			boolean flag2 = false;
			do {

				driver.findElement(By.xpath("(//div[@class = 'picker__nav--next'])[1]")).click();
				Thread.sleep(3000);

				String month_to_Select = driver.findElement(By.xpath("(//div[@class = 'picker__month'])[1]")).getText();

				flag2 = month_to_Select.equals(monthToBeSelected);// this will true the flag - once the condition is
																	// satisfied

			} while (!flag2);// reverse the condition - once the flag is true - it will exit the loop
		}
		// select the date
		driver.findElement(By.xpath("//div[@id ='dateNew_root']//div[ contains(@class ,'picker__day') "
				+ "and text() = '" + dayToBeSelected + "']")).click();

		Thread.sleep (3000);
		
		driver.quit();
		
		}
	}

	@DataProvider
	public Object[][] departDate () {
		
		return new Object[] [] {
			{"10" , "April", "2021" }, 
			{"20", "March", "2024" },
			{"10" , "August" , "2022" }
			
		};
	}

}
