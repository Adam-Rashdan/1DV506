/**
 * 
 */
package Ar223hf_assign3;

/**
 * @author Adam
 *
 */
public class MultiDisplayMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiDisplay md = new MultiDisplay () ;
		
		md.setDisplayMessage("Hello World!");
		md.setDisplayCount(3);
		md.display();
		
		md.display("Goodbye cruel world!", 2);
		
		System.out.println("Current Message: "+ md.getDisplayMessage());

	}

}
