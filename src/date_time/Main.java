

package date_time;


public class Main {

	public static void main(String[] args) {
	
		// Months remaining in this year
		RemainingMonths months = new RemainingMonths();
		
		months.remainingMonths();

		
		// My age
		System.out.println("==========================================");
		CalculateAge age = new CalculateAge();
		age.calculateAge();
		
		// The next and previous Friday
		System.out.println("=============================================");
		InfoFriday friday = new InfoFriday();
		friday.myFriday();

	}
	

}
