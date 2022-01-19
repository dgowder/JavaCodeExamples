package javaCodeExamples;

public class ToCheckDupicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Hello World";
		char charValue[] = input.toCharArray();
		//char valueToCheck='l';
		
		for (int i=0;i<charValue.length;i++)
		{
			int count = 1;
			
			for(int j=i+1;j<charValue.length;j++)
			{
			if(charValue[i]==charValue[j])
			{
				count++;
				charValue[j]=0;
			}
			}
			if (count > 1 && charValue[i]!=0)
			{
			System.out.println(input.charAt(i) + " available " + count + " time" );
			}
		}
	
	}

}
 