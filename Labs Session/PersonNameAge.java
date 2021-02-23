/* Program that asks user to enter a name and age. Only a maximum
 * of 10 pairs of names and ages can be stored
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class PersonNameAge {

	public static void main(String[] args) {
		
		ArrayList<String> nameData = new ArrayList<String>();
		ArrayList<Integer> ageData = new ArrayList<Integer>();
		
		while (ageData.size() < 10) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter your last name: ");
			String name = in.nextLine();
			
			//Loop can be exited by typing "done"
			if (name.equals("done")) {
				break;
			} else {
				
				System.out.print("Enter your age: ");
				int age = in.nextInt();
				
				//Store names and ages in the arrays
				nameData.add(name);
				ageData.add(age);
				
			}
					
		}
		
		//Prints out the entered names and corresponding ages
		System.out.print("Names: ");
		System.out.println(nameData);
		System.out.print("Ages: ");		
		System.out.println(ageData);
		
//		System.out.println( "Maximum Age: " 
//				+ Collections.max(ageData) );
		
		//Finds the index number of the maximum and minimum age
		int posMaxAge = ageData.indexOf(Collections.max(ageData));
		int posMinAge = ageData.indexOf(Collections.min(ageData));
		
		//Prints out the oldest and youngest person by using the
		//indices above
		System.out.println( "Oldest Person: " 
				+ nameData.get(posMaxAge) );
		System.out.println( "Youngest Person: " 
				+ nameData.get(posMinAge) );
			
	}

}
