package Ar223hf_assing4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) throws FileNotFoundException {
		
		int whiteSpace = 0 , upperCase = 0, lowerCase = 0, others = 0 ;
		String word ; 
		
		String path = "/Users/Adam/Desktop/LNU/Untitled.rtf" ;
		File file = new File (path) ;
		
		Scanner scan = new Scanner (file) ;
		
		while (scan.hasNextLine()) {
			
			word = scan.nextLine();
			
			for (int i = 0 ; i < word.length() ; i++) {
				
				
				
				 if(Character.isWhitespace(word.charAt(i))||word.charAt(i)==' ') 
					whiteSpace++; 
				
				else if (Character.isUpperCase(word.charAt(i)))
					upperCase++;
				
				else if (Character.isLowerCase(word.charAt(i))) 
					lowerCase++;
				
				else if (!Character.isLetter(word.charAt(i))) 
					others++;
			}
			
			
			
		}
		
		System.out.println("Number of upper case letters: " + upperCase); 
		System.out.println("Number of lower case letters: " + lowerCase);
		System.out.println("Number of whitespaces: " + whiteSpace );
		System.out.println("Number of others: " + others);
		
		
		
		
		scan.close();
		

	}

}
