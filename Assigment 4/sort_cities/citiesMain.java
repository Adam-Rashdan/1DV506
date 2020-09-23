/**
 * 
 */
package sort_cities;

import java.io.*;
import java.util.*;

/**
 * @author Adam
 *
 */
public class citiesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			readAndSort("/Users/Adam/Desktop/LNU/Cities.txt");
			Print();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	private static String name;
	private static int zipCode = 0;
	private static int count;
	private static List<Cities> city = new ArrayList<Cities>();

	public static void readAndSort(String newFile) throws IOException {

		File file = new File(newFile);

		Scanner scan = new Scanner(file);

		while (scan.hasNext()) {

			count++;
			 String[] word = scan.nextLine().split(";");
			name = word[0];
			zipCode = Integer.parseInt(word[1]);
			city.add(new Cities(name, zipCode));
			Collections.sort(city);
		}
		scan.close();
	}

	public static void Print() {

		System.out.println("Number of cities found:" + count);
		for (int i = 0; i < city.size(); i++)
			System.out.println(city.get(i));
	}

}
