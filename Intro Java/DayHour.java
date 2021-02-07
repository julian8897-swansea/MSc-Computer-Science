import java.util.Scanner;

public class DayHour {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Hour between 1 and 24: ");
		int hour = in.nextInt();
		
		if (hour >= 1 && hour <= 24 ) {
			if (hour >= 1 && hour < 12) {
				System.out.println("Morning");
				
			} else if (hour >= 12 && hour <= 19) {
				System.out.println("afternoon");
				
			} else {
				System.out.println("night");
			}
		}
		
	}
}