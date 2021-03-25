import java.util.Scanner;
import java.io.File;

public class TesterUtilities {
	
	public static int[] readDataQ1(String filename) {
		int[] data;
		try {
			Scanner s = new Scanner(new File(filename));
			data = new int[s.nextInt()];

			int i = 0;
			while(s.hasNextInt()) {
				data[i++] = s.nextInt();
			}
			s.close();
			return data;
		} catch (Exception e) {
			System.out.println("File read error!" + e);
		}
		return null;
	}

	public static int[][] readDataQ2(String filename) {
			int[][] data;
			try {
				Scanner s = new Scanner(new File(filename));
				data = new int[s.nextInt()][];

				int i = 0;
				while(s.hasNextInt()) {
					int numElems = s.nextInt();
					int[] arr = new int[numElems];
					for (int j = 0; j < numElems; j++) {
						arr[j] = s.nextInt();
					}
					data[i++] = arr;
				}
				s.close();
				return data;
			} catch (Exception e) {
				System.out.println("File read error!" + e);
			}
			return null;
	}
}


