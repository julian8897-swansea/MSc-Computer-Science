import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		if (number > 0){
			System.out.println("Positive Number");
			
		} else if (number < 0){
			System.out.println("Negative Number")
			
		} else {
			System.out.println("Zero")
		}
		
	}
}