package javapractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarhandlingCode {

	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//try on goibibo.com with the same logic 

		driver.findElement(By.id("datepicker")).click();

//		new WebDriverWait(driver, Duration.ofSeconds(5))
//	    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		// selecting the day,month,and year

		selectDate("12", "January", "2022");
	}

	public static String[] getMonthYear(String monthYearVal) {

		return monthYearVal.split(" ");
	}

	public static void selectDate(String exDay, String expMonth, String exYear) {

		if (expMonth.equals("February") && Integer.parseInt(exDay) > 29) {

			System.out.println("Invalid Data Selected " + expMonth + " : " + exDay);
			return;
		}

		if (Integer.parseInt(exDay) > 31) {

			System.out.println("Invalid Data Selected " + expMonth + " : " + exDay);
			return;
		}

		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();

		System.out.println(monthYearVal);

		while (!(getMonthYear(monthYearVal)[0].equals(expMonth) &&

				getMonthYear(monthYearVal)[1].equals(exYear)))// check the while condition once it becomes true it will
																// not go inside the condition
		{

			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();

		}
		try {
			
			driver.findElement(By.xpath("//a[normalize-space()='" + exDay + "']")).click();
		} catch (Exception e) {

			System.out.println("Invalid Data Selected " + expMonth + " : " + exDay);
		}
	}

}
