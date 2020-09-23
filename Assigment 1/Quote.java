package Ar223hf_assign1;
/**
 * @author Adam
 *
 */
public class Quote {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter the Quote : ");
		String quote = scan.nextLine();

		System.out.print("Quote: " + "\"" + quote + '.' + "\"");
		
		scan.close();

	}

}
