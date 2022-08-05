package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string = input.nextLine();
		int length = string.length();
		
		String reversedString = "";         
		for(int i = length-1 ; i >= 0; i --)     
		{
			reversedString = reversedString + string.charAt(i); 
			// char method extracts character from the given string and 
			//then concatenates them in reverse order to reverse the string  
		}
		
		System.out.println("Reversed String is :" + reversedString);
		input.close();
	}

}
