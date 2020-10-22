
/*
 * Write a Java program to calculate your age
 */
package date_time;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
	
	protected void calculateAge() {
		LocalDate myBirthday = LocalDate.of(1988, 6, 18);
		LocalDate currentTime = LocalDate.now();
		
		Period period = Period.between(myBirthday, currentTime);
		
		System.out.printf("I am %d years %d months %d days old \n", period.getYears(),period.getMonths(), period.getDays());
	}
}
