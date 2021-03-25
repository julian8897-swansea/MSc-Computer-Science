import java.util.Arrays;

public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] data1 = TesterUtilities.readDataQ1("C:\\Users\\pc 3\\eclipse-workspace\\Algorithm Coursework\\src\\q1_test.txt");
//		System.out.println(Arrays.toString(data1));
//		Solution.q1_1_solution(data1);
//		System.out.println(Solution.q1_4_solution(data1));
		
		
//		int[] arr1 = {4};
//    	int[] arr2 = {4 ,1};
//    	int[] arr3 = {5, 4, 1};
    	int[][] testArray = {{4, 1}, {4}, {5, 4, 1}, {6,9}};
    	System.out.println(Arrays.deepToString(testArray));
    	System.out.println(Arrays.deepToString(Solution.q2_solution(testArray)));
	}

}
