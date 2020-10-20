
/*
 * Write a Java program to get the months remaining in the year
 */
package date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class RemainingMonths {


	protected  void remainingMonths() {
		LocalDate today 		= LocalDate.now();
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		Period period 			= today.until(lastDayOfYear);
		
		System.out.println("Months remaining in this year:" + period.getMonths());
	}	
}
