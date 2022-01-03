package javaCodeExamples;

public class reverseWords {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String actualWord="I love you";
		String reversedWord ="";
		
		String[] temp=actualWord.split(" ");
		
		for(int i=temp.length-1;i>=0;i--)
		{
			reversedWord = reversedWord + temp[i] + " ";
		}

		System.out.println(reversedWord);
		
		
	}

}
