package javaCodeExamples;

public class FindVowelsInTheString {

	public static void main(String[] args) {
		String input="Deepu";
		int vowelCount=0;
		for(int i=0;i<input.length();i++)
		{
		 if (input.charAt(i) == 'a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
		 {
			 vowelCount++;
		 }
		}
System.out.println(vowelCount);
	}

}
