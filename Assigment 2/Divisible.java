
package Ar223hf_assign2;

/**
 * @author Adam
 *
 */
public class Divisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int lineBreak = 1;

		for (int i = 100; i <= 200; i++) {

			if ((i % 4 == 0 || i % 5 == 0) && i % 20 != 0) {
				System.out.print(i + " ");
				lineBreak++;
				if (lineBreak > 10) {
					System.out.println("\n");
					lineBreak = 1;
				}

			}

		}

	}
}
