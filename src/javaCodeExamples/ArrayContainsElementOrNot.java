package javaCodeExamples;

public class ArrayContainsElementOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num[]= {1,2,3,4,5};
		int numberToFind = 6;
		boolean available = false;
		for (int iterater:num)
		{
			if(iterater==numberToFind)
			{
				available=true;
								
			}
		}
		
		if (available)
		{
			System.out.println("Element is available");
		}
		else
		{
			System.out.println("Element is not available");
		}
	}

}
