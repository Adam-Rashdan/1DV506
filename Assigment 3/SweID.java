/**
 * 
 */
package Ar223hf_assign3;

/**
 * @author Adam
 *
 */
public class SweID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String id1 = "881201-9092";
		String id2 = "691005-5321";
		
		System.out.println(getFirstPart(id1));
		System.out.println(getSecondPart(id1));
		System.out.println(isFemaleNumber(id2));
		System.out.print(areEqual(id1,id2));

	}
  
	private static String getFirstPart(String sweID) {
	
		return sweID.substring(0,6) ;
		 
	}
	
	private static String getSecondPart(String sweID) {
		return sweID.substring(7, 11);
	}
	
	private static boolean isFemaleNumber(String sweID) {
		
		   return sweID.charAt(9) % 2 == 0; 
		   
			
	}
	
	private static boolean areEqual(String id1 , String id2) {
		
		return id1.equals(id2);
	}
	
	
	
	
	
}
