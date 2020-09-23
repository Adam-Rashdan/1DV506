package Ar223hf_assing4;

import java.io.*;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/Adam/Desktop/LNU/histo.txt";
		int numberCounter = 0;
		int outOfRange = 0;
	    int [] list = new int [10] ;
	    String [] asterisk = new String [10];

		File file = new File(path);
		System.out.println("Reading integers from the file: " + path);
		Scanner scan = new Scanner(file);
		
		//System.out.println(scan.nextLine());
		
		
		
		
		while (scan.hasNextInt()) {
			int number = scan.nextInt();
		
			if (number > 100 || number < 0) 
				outOfRange++;
				
			else {
				numberCounter++;
				int i = ((number - 1) / 10);
				list[i]++;
			}
			
			
		}
		
		for (int i = 0 , j = 0 ; i < list[j] && j < 10 ; i++ , j++) {
			
			asterisk[i] += "*";
		}
		
		System.out.println("Number of integers in the interval [1,100]: " + numberCounter);
		System.out.println("Others: " + outOfRange);
		System.out.println(" 1  - 10  | " + asterisk[0]);
		System.out.println("11  - 20  | " + asterisk[1]);
		System.out.println("21  - 30  | " + asterisk[2]);
		System.out.println("31  - 40  | " + asterisk[3]);
		System.out.println("41  - 50  | " + asterisk[4]);
		System.out.println("51  - 60  | " + asterisk[5]);
		System.out.println("61  - 70  | " + asterisk[6]);
		System.out.println("71  - 80  | " + asterisk[7]);
		System.out.println("81  - 90  | " + asterisk[8]);
		System.out.println("91  - 100 | " + asterisk[9]);
		
		
		
		
		scan.close();
		
		
     
	}

}