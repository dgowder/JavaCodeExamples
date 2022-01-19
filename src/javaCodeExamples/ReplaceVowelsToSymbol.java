package javaCodeExamples;


public class ReplaceVowelsToSymbol {

	public static void main(String[] args) {
		
		String input="Deepak Gowder";

		System.out.println( input.replaceAll("[aeiouAEIOU]", "*"));
	
	}

}
