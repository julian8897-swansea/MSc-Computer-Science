import java.util.Scanner;

public class DayMonthLegal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Month: ");
		int month = in.nextInt();
		
		System.out.print("Enter Day: ");
		int day = in.nextInt();
		
		boolean checkNegative = ((month <= 0) || (day <= 0));
		boolean checkMonth = ((month >= 1) && (month <= 12));
		boolean checkDay = ((day >= 1) && (day <= 31));
		boolean checkFeb = ((month == 2) && (day <= 28));
		boolean checkOther = ((month == 4 || month == 6 
			|| month == 9 || month == 11) && (day <= 30));
		boolean checkOther1 = ((month == 4 || month == 6 
			|| month == 9 || month == 11) && (day > 30));
			
		if (checkNegative) {
			System.out.println("Invalid date entered!");	
		} 
		
		if (checkDay && checkMonth) {
			if (checkFeb) {
				System.out.println("Legal date");
			
			} else if (checkOther) {
				System.out.println("Legal date");
				
			} else if (checkOther1) {
				System.out.println("illegal date");
				
			} else {
				System.out.println("legal date");
			}	
				
		} else {
			System.out.println("Illegal date");
		}
	}

}