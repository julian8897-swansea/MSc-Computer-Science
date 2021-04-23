import java.util.Scanner;
import java.io.File;

public class TesterUtilities {
	
	public static int[] readData(String filename) {
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

}