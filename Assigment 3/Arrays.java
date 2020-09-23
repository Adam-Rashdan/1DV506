/**
 * 
 */
package Ar223hf_assign3;

/**
 * @author Adam
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] a = {8,9,2,3,95,13,7,45};
		String str = Arrays.toString(a);
		
	
		System.out.println("The Sum is: "+sum (a));
		System.out.println("a = " + str);
		System.out.println("a after adding n = " + toString(addN (a, 2)));
		System.out.println("a in reverse order = "+toString (reverse (a)));
		System.out.println("Has(5): "+hasN(a, 5) );
		replaceAll (a,3,5) ;
		System.out.println("a after replace = "+toString(a));
		System.out.println("sorted a = "+toString(sort(a)));
		System.out.println("hasSubsequence (a, {2,8,5,9}: "+hasSubsequence (a, new int[] {2,8,5,9}));
		System.out.println("{1,2,3,4} larger {1,3,5}? => " + isLarger(new int[] { 1, 2, 3, 4 }, new int[] { 1, 3, 5 }));
		System.out.println("{1,2,3,4} larger {1,2,3}? => " + isLarger(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3 }));
		System.out.println("{1,2,3} larger {1,2,3,4}? => " + isLarger(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3, 4 }));
		
		
	}
	
/*
	adding all elements of the array a and returning the sum.
	*/
	
	private static int sum (int [] arr) {
		
		int sum = 0 ;
		for (int i : arr) 
			sum += i ;
		return sum ;
	}
	

//creating a string containing a nice-looking print out of the content of the array
	
	
	private static String toString (int [] arr) {
		
		StringBuilder str = new StringBuilder ();
		str.append("{");	
		
		for(int i : arr) 
			
		str.append(i+",");
		str.deleteCharAt(str.length()-1);
		
		str.append("}");
		return str.toString() ;
					
	} 

//creating and returning a new array,where n have been added to all elements in a
	
	private static int[] addN (int [] arr , int n) {
	   int[] arr2 = new int[arr.length] ;
	   
	   
	   for(int i = 0 ; i < arr.length ; i++)
		   arr2[i] = arr[i] + n;
	   
	   return arr2;
	   
	}
	
//creating and returning a new array, consisting of all elements in a in reverse order.
	
	private static int[] reverse (int [] arr) {
		int [] arr2 = new int [arr.length] ;
		
		for (int i = 0 ; i < arr.length ; i++) 
		arr2 [i] = arr [(arr.length - 1) -i];
		
		return arr2 ;
		
	}
//returning true if n is contained in the array a, false otherwise.

	private static boolean hasN (int [] arr , int n ) {
		
		boolean hasN = true ;
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			if (arr[i] == n)
				
			return hasN ;
			
		}
		return false;	
	}
	
// replacing all occurrences of old with new in arr.
	
	private static void replaceAll (int [] arr , int old , int nw) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			if (arr[i] == old)
				arr[i] = nw ;
		}
		
	}
	
	
	private static int[] sort(int[] arr) {
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr.length; ++i) 
			arr2[i] = arr[i];
		
	
		for (int i = 0; i < arr2.length; i++) {
			for (int x = i + 1; x < arr2.length; x++) {
				if (arr2[i] > arr2[x]) {
					int temp = arr2[i];
					arr2[i] = arr2[x];
					arr2[x] = temp;
				}
			}
		}
		return arr2;
	}
	
	
	
	private static boolean hasSubsequence (int [] arr , int [] sub) {
		
		int x = 0;
		for (int i = 0 ;i < arr.length ; i++  ) {
			
			if (sub[x] == arr[i]) {
				x++;
				if (x == sub.length) 
					return true;
			}

			else 
				x = 0;

		}
		return false;
	}
	
	
	
	
	private static boolean isLarger (int [] a1 , int [] a2) {
		
	  for (int i = 0 ; i < a1.length ; i++ ) {
		  if (i >= a2.length) {
				return true;
			}
		  if (a1[i] == a2[i])
			  continue;	
		  else 
			  return a1[i] > a2[i] ;
	  }
	  return false ;
	}
	
	
}
	
	
	
	
	
	
	

