
public class TestMain {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] data = TesterUtilities.readData("C:\\Users\\pc 3\\eclipse-workspace\\Algorithm Coursework 2\\src\\test.txt");
		//int[] data = {7,8,9,8,9,10};
		for (int i = 0; i < data.length; i++) {
		   System.out.println(sol.lessThan(data[i], true));
		}

	}

}
