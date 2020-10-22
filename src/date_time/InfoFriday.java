package date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class InfoFriday {
	
	protected void myFriday() {
		LocalDate currentDay = LocalDate.now();
		System.out.println("The next Friday: " + currentDay.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println("The previous Friday: " + currentDay.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
	}
}
