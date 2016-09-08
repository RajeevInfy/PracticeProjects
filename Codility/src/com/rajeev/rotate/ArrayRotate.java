package com.rajeev.rotate;

import java.util.Scanner;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] testarray1 = { 'a', 'b', 'c', 'd' };
		//System.out.println(testarray1);
		//rotate(testarray1);
		//System.out.println(rotate(testarray1));		
		//rotating with n characters
		Scanner scanner = new Scanner(System.in);

	    //  prompt for the user's name
	    System.out.print("Enter your number of times you want to rorte: ");
	    String username = scanner.next();
	    int notime=Integer.parseInt(username);
	    
	    int actualrorartion=notime%testarray1.length;
	    
	
		
		
		

	}

	public static char[] rotate(char[] chararray) {
		int length = chararray.length;
		char[] modarray = new char[length];
		if (length > 0) {
			char end = chararray[length - 1];
			for (int i = 1; i <= length - 1; i++) {

				modarray[i] = chararray[i - 1];
			}
			modarray[0] = end;
		}
		//System.out.println(modarray);
		return modarray;
	}
	
	public static char[] rotate(char[] chararray,int times) {
		
		for(int i=1; i<=times;i++)
		{
			chararray=rotate(chararray);
		}return chararray;
	}

}
