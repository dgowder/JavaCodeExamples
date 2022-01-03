package javaCodeExamples;

import java.util.Scanner;

public class FindPositionFromEnglishAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char inputValue= scanner.next().charAt(0);
		
	   inputValue = Character.toLowerCase(inputValue);
	   int ASCII = (int)inputValue;
	   System.out.println(ASCII-96);
	   
		
	}

}
