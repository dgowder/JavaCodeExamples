package javaCodeExamples;

public class ExtractNumbersAndCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "deepish238";
		String letters = ""  ;
		String number =""  ;
	    
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
		      if (Character.isDigit(c))
		      {
		    	  number = number + Character.getNumericValue(c);
		      }else if (Character.isLetter(c)) {
		    	  
		    	  letters=letters+c;
				
		}
	

	}
		System.out.println(letters);
		System.out.println(number);

}
}
